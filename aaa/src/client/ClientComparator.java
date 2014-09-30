package client;
import java.util.Comparator;


public class ClientComparator implements Comparator<Object> {

	public int compare(Client c1, Client c2) {
		
		if (c1.getArrivalTime() > c2.getArrivalTime()){
			return 1;
		}
		else if (c1.getArrivalTime() < c2.getArrivalTime()) {
			return 0;
		}
		else {
			return -1;
		}
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
