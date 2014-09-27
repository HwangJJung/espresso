package command;


public class TicketBox extends Thread{
	Command slot;
	
	public TicketBox() {}
	
	public void run() {
		
	}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void HaveClient() {
		slot.execute();
	}
}
