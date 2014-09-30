package clerk;

import client.AbstractClient;

public abstract interface StateObservable
{
  public abstract void notifyObservers();

  public abstract void isCameCustomer(AbstractClient paramAbstractClient);
}