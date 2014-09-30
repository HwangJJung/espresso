package station;

import client.AbstractClient;

public class SeoulStation extends Station
{
  public SeoulStation()
  {
    this.name = "서울역";
  }

  public void add(AbstractClient abstractClient) {
    this.stationQueue.add(abstractClient);
    print();
    System.out.println("이역의 이름은 " + this.name + "인지도 모르겠습니다.");
  }
}