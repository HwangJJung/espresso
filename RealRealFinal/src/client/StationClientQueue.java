package client;


public class StationClientQueue extends AbstractClientQueue {
  public boolean isEmpty()
  {
    if (this.clients.isEmpty()) {
      System.out.println("역클라큐, clients empty.");
      return true;
    }
    System.out.println("clients has a client.");
    return false;
  }

  public void initialize()
  {
    this.clients.clear();
  }

  public AbstractClient targetClient() {
    AbstractClient temp = (AbstractClient)this.clients.get(0);
    this.clients.remove(0);
    temp.print();
    return temp;
  }
}