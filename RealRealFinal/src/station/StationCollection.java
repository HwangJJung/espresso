package station;

import exception.NoEntryArrivalStationException;
import exception.NoEntryStartStationException;
import java.util.ArrayList;
import java.util.HashMap;

public class StationCollection
{
  HashMap<String, Integer> stationMap = new HashMap<String, Integer>();
  ArrayList<Station> stationList = new ArrayList<Station>();

  public StationCollection()
  {
    initialize();
  }

  public void initialize()
  {
    MapInitialize();
    ListInitalize();
  }

  public ArrayList<Station> getStationList()
  {
    return this.stationList;
  }

  public void MapInitialize()
  {
    this.stationMap.put("Seoul", LOCATION.SEOUL);
    this.stationMap.put("Chuncheon", LOCATION.CHUNCHEON);
    this.stationMap.put("Wonju", LOCATION.WONJU);
    this.stationMap.put("Asan", LOCATION.ASAN);
    this.stationMap.put("Gwangju", LOCATION.GWANGJU);
    this.stationMap.put("Daejeon", LOCATION.DAEJEON);
    this.stationMap.put("Gyeongju", LOCATION.GYEONGJU);
  }

  public void ListInitalize()
  {
    this.stationList.add(LOCATION.SEOUL.intValue(), new SeoulStation());
    this.stationList.add(LOCATION.DAEJEON.intValue(), new DaejeonStation());
    this.stationList.add(LOCATION.GWANGJU.intValue(), new GwangjuStation());
    this.stationList.add(LOCATION.CHUNCHEON.intValue(), new ChuncheonStation());
    this.stationList.add(LOCATION.WONJU.intValue(), new WonjuStation());
    this.stationList.add(LOCATION.ASAN.intValue(), new AsanStation());
    this.stationList.add(LOCATION.GYEONGJU.intValue(), new GyeongjuStation());
  }

  public Station getStation(String name, boolean isStartStation)
  {
    if (this.stationMap.containsKey(name)) {
      int index = ((Integer)this.stationMap.get(name)).intValue();
      System.out.println(index + "가 0이 아닙니까,,?");
      System.out.println(((Station)this.stationList.get(index)).name + "은 서울이여야해.");
      return (Station)this.stationList.get(index);
    }
    if (isStartStation) {
      try {
        throw new NoEntryStartStationException(name + ", 해당 출발역이 없습니다.");
      } catch (NoEntryStartStationException e) {
        e.printStackTrace();
        return null;
      }
    }
    try
    {
      throw new NoEntryArrivalStationException(name + ", 해당 도착역이 없습니다.");
    } catch (NoEntryArrivalStationException e) {
      e.printStackTrace();
    }return null;
  }

  static abstract interface LOCATION
  {
    public static final Integer SEOUL = Integer.valueOf(0);
    public static final Integer DAEJEON = Integer.valueOf(1);
    public static final Integer GWANGJU = Integer.valueOf(2);
    public static final Integer CHUNCHEON = Integer.valueOf(3);
    public static final Integer WONJU = Integer.valueOf(4);
    public static final Integer ASAN = Integer.valueOf(5);
    public static final Integer GYEONGJU = Integer.valueOf(6);
  }
}