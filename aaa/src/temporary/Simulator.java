package temporary;
import clerk.TicketBox;
import client.ClientTimeChecker;


public class Simulator {

	public static void main(String[] args) {
		Thread th = new Thread(new ClientTimeChecker());
		th.start();
		
		TicketBox ticketbox = new TicketBox();
		ticketbox.isCameCustomer();
		ticketbox.isCameCustomer();
		
		
		
	}

}
