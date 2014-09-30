package clerk;

import client.AbstractClient;

public class Observable
  implements StateObservable
{
  Observer observer = new BoxChecker();
  TicketBox ticketBox;

  public Observable(TicketBox ticketBox)
  {
    this.ticketBox = ticketBox;
  }

  public void notifyObservers()
  {
    this.observer.update(this.ticketBox);
  }

  public void isCameCustomer(AbstractClient client)
  {
    System.out.println("오지마");
  }
}