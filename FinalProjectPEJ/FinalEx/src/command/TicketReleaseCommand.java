package command;

import Factory.Ticket;

public class TicketReleaseCommand implements Command{
	
	Ticket ticket;
	
	public TicketReleaseCommand(Ticket ticket) {
		this.ticket = ticket;
	}

	public void execute() {
		ticket.release();
	}
}
