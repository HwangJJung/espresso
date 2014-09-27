
public class TicketGenerator extends Observable{
	
	
	public TicketGenerator(ReleaseObservable client) {
		super(client);
		// TODO Auto-generated constructor stub
	}

	Ticket ticket;
	
	@Override
	public Ticket getTicket() {
		
		return ticket;
	}

	@Override
	public void execute(Client client) {
		// TODO Auto-generated method stub
		ticket.name = client.getName();
		ticket.startStation = client.getStartStation();
		ticket.arrivalStation = client.getArrivalStation();
		notifyObservers();
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

}
