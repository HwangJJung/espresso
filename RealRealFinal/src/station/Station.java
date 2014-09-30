package station;

import clerk.BoxChecker;
import clerk.TicketBox;
import client.AbstractClient;
import client.StationClientQueue;


public abstract class Station
{
  public StationClientQueue stationQueue = new StationClientQueue();
  public String name = "서울역이 아닙니다.";
  boolean isticketboxFull = false;

  TicketBox[] boxes = { new TicketBox("Alpha"), new TicketBox("Betha"), new TicketBox("Gamma") };
  BoxChecker boxChecker = new BoxChecker();

  public Station()
  {
    System.out.println(this.stationQueue.isEmpty());
    Thread checker = new Thread(new queueChecker());
    checker.start();
  }

  public void match() {
    for (int i = 0; i < this.boxes.length; i++)
      if (this.boxes[i].getboxState() == 0)
        this.boxChecker.update(this.boxes[i]);
  }

  public void ticketboxfull()
  {
    if (this.boxes[0].getboxState() * this.boxes[1].getboxState() * this.boxes[2].getboxState() != 0)
    {
      this.isticketboxFull = true;
    }
  }

  public void add(AbstractClient abstractClient) {
    this.stationQueue.add(abstractClient);
    print();
    System.out.println("이역의 이름은 " + this.name + "인지도 모르겠습니다.");
  }

  public StationClientQueue getStationQueue()
  {
    return this.stationQueue;
  }

  public void print()
  {
    System.out.println(this.stationQueue.get(0).getName());
  }

  class queueChecker
    implements Runnable
  {
    boolean Live = true;

    queueChecker() {  } 
    public void run() { while (this.Live) {
        try {
          Thread.sleep(3000L);
        }
        catch (InterruptedException e) {
          e.printStackTrace();
        }

        System.out.println("queuechecker 내부에서 주기적으로 큐를 확인하는 메소드.");
        Station.this.boxChecker.setQueue(Station.this.stationQueue);

        if (Station.this.name.equals("서울역")) {
          System.out.println("이역의 이름은 " + Station.this.name + "입니다. ");
        } else {
          System.out.println("이 역은 서울역이 아닙니다. 스레드를 종료합니다. ");
          this.Live = false;
        }
        Station.this.ticketboxfull();

        if (Station.this.isticketboxFull)
          this.Live = false;
        else
          Station.this.match();
      }
    }
  }
}