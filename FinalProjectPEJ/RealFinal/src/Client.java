
public class Client implements Observer {
	
	String name;
	int arrivalTime;
	int ticketingTime;
	Station startStation;
	Station arrivalStation;
	Boolean isHadTicket;
	
	public Client() {}
	
	
	@Override
	public void update(ReleaseObservable clerk) {
		System.out.println("Client : " + clerk + "is Release the ticket.");
		
	}
	public void Order() {
		Clerk clerk2 = new Clerk();
		Ticket ticket = new Ticket();
		
		TicketReleaseCommand ticketRelease = new TicketReleaseCommand(ticket);
		
		clerk2.setCommand(ticketRelease);
		clerk2.release();
	}
	
	public String getName() {
		return this.name;
	}
	public Station getStartStation() {
		return this.startStation;
	}
	public Station getArrivalStation() {
		return this.arrivalStation;
	}
}
