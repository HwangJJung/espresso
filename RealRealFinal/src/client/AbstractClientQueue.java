package client;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class AbstractClientQueue implements haveStopWatch
{
  ArrayList<AbstractClient> clients = new ArrayList<AbstractClient>();

  public AbstractClientQueue()
  {
    initialize();
  }

  public void add(AbstractClient abstractClient)
  {
    this.clients.add(abstractClient);
  }

  public void remove(AbstractClient abstractClient) {
    this.clients.remove(abstractClient);
  }

  public ArrayList<AbstractClient> getList() {
    return this.clients;
  }

  public AbstractClient get(int i) {
    return (AbstractClient)this.clients.get(i);
  }

  public void sort()
  {
  }

  public int getSize()
  {
    return this.clients.size();
  }

  public void timerStart()
  {
    Iterator<AbstractClient> iterator = this.clients.iterator();
    while (iterator.hasNext()) {
      AbstractClient client = (AbstractClient)iterator.next();
      client.timerStart();
    }
  }

  public void print() { Iterator<AbstractClient> iterator = this.clients.iterator();
    while (iterator.hasNext()) {
      AbstractClient client = (AbstractClient)iterator.next();
      client.print();
    }
  }

  public abstract void initialize();
}