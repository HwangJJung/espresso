package Factory;



public class Ticket {
	
	String name;
	Point  startPoint;
	Point  arrivalPoint;
	Price price;
	Policy policy;
	
	TicketComponentFactory ticketComponentFactory;
	
	public Ticket(TicketComponentFactory ticketComponentFactory) {
		this.ticketComponentFactory = ticketComponentFactory;
	}
	
	public void release() {
		System.out.println("Ticket Release. Have a Good Trip.");
		startPoint = ticketComponentFactory.SetStartPoint();
		arrivalPoint = ticketComponentFactory.SetArrivalPoint();
		policy = ticketComponentFactory.SetPolicy();
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}

}
