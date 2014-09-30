package clerk;

import client.AbstractClient;
import client.StationClientQueue;

public class BoxChecker
  implements Observer
{
  private AbstractClient client = null;
  private StationClientQueue stationQueue;

  public void setQueue(StationClientQueue stationQueue)
  {
    this.stationQueue = stationQueue;
    if (stationQueue.isEmpty()) { System.out.println("BoxChecker.setQueue.if: 큐가 널임.");
    } else {
      System.out.println("BoxChecker.setQueue.if: 큐가 널이 아님.");
      setClient(stationQueue.get(0));
    }
  }

  public void setClient(AbstractClient client) {
    this.client = client;
  }

  public void updateClient() {
    try {
      if (this.client.equals(null))
        System.out.println("BoxChecker.setClient.if: 클라가 null임");
    }
    catch (NullPointerException e) {
      e.printStackTrace();
      System.out.println("오늘은 아예 손님이 없나봅니다.");
    }

    if (this.stationQueue.isEmpty()) {
      System.out.println("해당 역에 아무런 승객이 없습니다.");
    }
    else {
      this.client = this.stationQueue.targetClient();
      this.client.print();
    }
  }

  public void update(TicketBox ticketBox)
  {
    updateClient();
    ticketBox.isCameCustomer(this.client);
  }
}