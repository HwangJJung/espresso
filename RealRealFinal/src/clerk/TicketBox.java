package clerk;

import client.AbstractClient;

public class TicketBox implements StateObservable
{
  public static final int EMPTY = 0;
  static final int HAS_CUSTOMER = 1;
  static final int SOLD = 2;
  public String name;
  boolean isLive = true;

  Ticket ticket = new Ticket();
  private int boxState = 0;

  AbstractClient client = null;
  Observable observable;

  public int getboxState()
  {
    return this.boxState;
  }
  public void setClient(AbstractClient client) {
    this.client = client;
  }

  public TicketBox(String name) {
    this.name = name;
    this.observable = new Observable(this);
  }

  public void isCameCustomer(AbstractClient client) {
    System.out.println("hahahahaha");
    if (this.boxState == EMPTY) {
      this.boxState = HAS_CUSTOMER;
      setClient(client);
      client.RecordWaitTime();
      System.out.println("어서오세요. 티켓발부 해드릴게요.");
      takeOrder();
    } else if (this.boxState == HAS_CUSTOMER) {
      System.out.println("다른 분 이후에 안내도와드릴게요. ");
    } else if (this.boxState == SOLD) {
      System.out.println("잠시만요, 티켓 발급 중입니다.");
    }
  }

  private void takeOrder() {
    if (this.boxState == EMPTY) {
      System.out.println("줄 서서 기다리셔야해요.");
    } else if (this.boxState == HAS_CUSTOMER) {
      this.boxState = SOLD;
      ticketing();
      System.out.println("멀리 가시네요~ 티켓 준비중이니 잠시만 기다려주세요.");
    } else if (this.boxState == SOLD) {
      System.out.println("잠시만요, 티켓 발급 중입니다.");
    }
  }

  private void ticketing()
  {
    System.out.println("잠시 기다립시다.스레드 불러서 잠시 멈출게요.");

    Thread t = new Thread(new TiketBoxMachine(this.ticket, this.client.getTicketingTime()));

    t.setDaemon(true);
    t.start();
    this.client.RecordRealTicketingTime();
    StateIsEmpty();
  }

  public void StateIsEmpty()
  {
    this.boxState = this.ticket.state;
    setClient(null);
    notifyObservers();
  }

  public void notifyObservers()
  {
    this.observable.notifyObservers();
  }
}