package process;

import client.AbstractClient;
import client.ClientQueue;
import client.haveStopWatch;

import java.util.Iterator;

public class ClientTimeChecker
  implements Runnable
{
  ClientSender clientSender;
  int currentTime = 0;
  ClientQueue clientQueue = new ClientQueue();
  boolean isLive = true;

  public ClientTimeChecker(ClientSender clientSender)
  {
    this.clientSender = clientSender;
  }

  public void run()
  {
    while (this.isLive)
    {
      Iterator<AbstractClient> it = this.clientQueue.getList().iterator();
      while (it.hasNext())
      {
        AbstractClient client = (AbstractClient)it.next();
        if (client.getArrivalTime() == this.currentTime) {
          this.clientSender.sendClientToStation(client);
          System.out.println(client.getName() + "enqueue " + client.getArrivalTime() + " is same" + this.currentTime);
        }
      }

      this.currentTime += 1;
      if (this.currentTime > 20) {
        console(this.clientQueue);
        this.isLive = false;
      }
      try
      {
        Thread.sleep(1000L); } catch (InterruptedException localInterruptedException) {
      }
      System.out.println("-");
    }
  }

  public void console(haveStopWatch hsw)
  {
    hsw.print();
  }
}