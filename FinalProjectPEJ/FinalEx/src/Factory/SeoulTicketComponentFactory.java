package Factory;


public class SeoulTicketComponentFactory implements TicketComponentFactory{

	@Override
	public Point SetStartPoint() {
		// TODO Auto-generated method stub
		return new SeoulPoint();
	}

	@Override
	public Point SetArrivalPoint() {
		// TODO Auto-generated method stub
		return new GwangjuPoint();
	}

	@Override
	public Policy SetPolicy() {
		// TODO Auto-generated method stub
		return new AlphaPolicy();
	}

}
