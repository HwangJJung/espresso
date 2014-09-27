package Factory;


public interface TicketComponentFactory {
	
	public Point SetStartPoint();
	public Point SetArrivalPoint();
	public Policy SetPolicy();
}
