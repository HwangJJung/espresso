import org.apache.commons.lang3.time.StopWatch;


public class Client {
	
	String name;
	int arrivalTime;
	int ticketingTime;
	Station startStation;
	Station arrivalStation;
	Boolean isHadTicket;
	String start;
	String arrival;
	StopWatch stopWatch;
	
	public Client(String name, int arrivalTime, int ticketingTime,
			Station startStation, Station arrivalStation) {
		this.name = name;
		this.arrivalTime = arrivalTime;
		this.ticketingTime = ticketingTime;
		this.startStation = startStation;
		this.arrivalStation = arrivalStation;
		
		this.isHadTicket = false;
		//this.timer = 
		//timer.On();
	}
	
	public Client(String name, int arrivalTime, int ticketingTime,
			String startStation, String arrivalStation) {
		this.name = name;
		this.arrivalTime = arrivalTime;
		this.ticketingTime = ticketingTime;
		this.start = startStation;
		this.arrival = arrivalStation;
		this.isHadTicket = false;
	}

	public void TimerStart() {
		
		stopWatch.start();
	}
	
}
