package client;


import org.apache.commons.lang3.time.StopWatch;

public abstract class AbstractClient implements haveStopWatch
{
  String startStation;
  String arrivalStation;
  String name;
  int ticketingTime;
  int arrivalTime;
  StopWatch stopWatch;
  long realEnqueueTime = 0L;
  long realTicketingTime = 0L;
  long waitTime = 0L;

  public String getStartStation() {
    return this.startStation;
  }

  public String getArrivalStation() {
    return this.arrivalStation;
  }

  public String getName() {
    return this.name;
  }

  public int getArrivalTime() {
    return this.arrivalTime;
  }

  public void timerStart()
  {
    this.stopWatch.start();
  }

  public long getRealEnqueueTime() {
    return this.realEnqueueTime;
  }

  public void RecordRealEnqueueTime() {
    this.stopWatch.split();
    this.realEnqueueTime = this.stopWatch.getSplitTime();
  }
  public long getWaitTime() {
    return this.waitTime;
  }
  public void RecordWaitTime() {
    this.stopWatch.split();
    this.waitTime = (this.stopWatch.getSplitTime() - this.realEnqueueTime);
  }

  public long getRealTicketingTime() {
    return this.realTicketingTime;
  }

  public void RecordRealTicketingTime() {
    this.stopWatch.split();
    this.realEnqueueTime = (this.stopWatch.getSplitTime() - this.waitTime);
  }

  public int getTicketingTime() {
    return this.ticketingTime;
  }

  public void print() {
    System.out.println(toString());
  }

  public String toString() {
    return "AbstractClient [startStation=" + this.startStation + 
      ", arrivalStation=" + this.arrivalStation + ", name=" + this.name + 
      ", ticketingTime=" + this.ticketingTime + ", arrivalTime=" + 
      this.arrivalTime + ", realEnqueueTime=" + this.realEnqueueTime + 
      ", realTicketingTime=" + this.realTicketingTime + ", waitTime=" + 
      this.waitTime + "]";
  }
}