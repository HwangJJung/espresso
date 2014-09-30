package clerk;

public class TiketBoxMachine implements Runnable {
		Ticket ticket;
	public TiketBoxMachine(Ticket ticket) {
		this.ticket = ticket;
	}
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ticket.state = changeStateToEmpty();
		System.out.println("발급 완료 어서가시죠.");
		
	}
	
	private int changeStateToEmpty() {
		return TicketBox.EMPTY;
	}
}
