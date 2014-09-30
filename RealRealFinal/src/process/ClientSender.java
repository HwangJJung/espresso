package process;

import client.AbstractClient;
import exception.SameStationException;
import station.Station;
import station.StationCollection;

public class ClientSender
{
  StationCollection stationCollection;
  Station station;
  AbstractClient client;

  public ClientSender(StationCollection stationCollection)
  {
    this.stationCollection = stationCollection;
  }

  public void sendClientToStation(AbstractClient client)
  {
    this.client = client;
    String startStation = client.getStartStation();
    String arrivalStation = client.getArrivalStation();

    if (startStation.equals(arrivalStation)) {
      try {
        throw new SameStationException("출발역: " + startStation + ", 도착역: " + 
          arrivalStation + " \n 으로 출발지와 도착지가 같습니다. ");
      } catch (SameStationException e) {
        e.printStackTrace();
      }
    }

    this.station = this.stationCollection.getStation(startStation, true);
    this.station.add(client);
    System.out.println(this.station.name);
    System.out.println("클라이언트 센더에서는 큐가 엠티인가?  " + this.station.stationQueue.isEmpty());
    client.RecordRealEnqueueTime();
    client.print();
  }
}