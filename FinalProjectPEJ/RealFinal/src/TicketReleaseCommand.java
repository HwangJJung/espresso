
public class TicketReleaseCommand implements Command {
	
	Ticket ticket;
	
	public TicketReleaseCommand(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
	@Override
	public void execute() {
		ticket.Release();
	}
	

}
