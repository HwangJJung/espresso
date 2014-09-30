package client;

import org.apache.commons.lang3.time.StopWatch;

public class Client extends AbstractClient
{
  public Client(String name, int arrivalTime, int ticketingTime, 
		  String startStation, String arrivalStation)
  {
    this.name = name;
    this.arrivalTime = arrivalTime;
    this.ticketingTime = ticketingTime;
    this.startStation = startStation;
    this.arrivalStation = arrivalStation;
    this.stopWatch = new StopWatch();
  }

  public int getArrivalTime() {
    return this.arrivalTime;
  }

  public void enterStation()
  {
  }
}