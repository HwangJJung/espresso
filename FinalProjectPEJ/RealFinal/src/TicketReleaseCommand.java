
public class TicketReleaseCommand implements Command {
	
	Ticket ticket;
	//이안에 티켓발매 정보가 담겨야해.
	public TicketReleaseCommand(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
	@Override
	public void execute() {
		ticket.Release();
	}
	

}
