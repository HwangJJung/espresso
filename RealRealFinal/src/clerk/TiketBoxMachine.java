package clerk;

public class TiketBoxMachine
  implements Runnable
{
  Ticket ticket;
  int ticketingTime;

  public TiketBoxMachine(Ticket ticket, int ticketingTime)
  {
    this.ticket = ticket;
    this.ticketingTime = ticketingTime;
  }
  public void run() {
    try {
      Thread.sleep(this.ticketingTime * 1000);
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    this.ticket.state = changeStateToEmpty();
    System.out.println("발급 완료 어서가시죠.");
  }

  private int changeStateToEmpty()
  {
    return 0;
  }
}