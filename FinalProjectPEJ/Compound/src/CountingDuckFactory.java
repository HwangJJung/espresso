
public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Orderable createMallardDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Orderable createRedheadDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter( new RedheadDuck()); 
	}
	@Override
	public Orderable createDuckcall() {
		// TODO Auto-generated method stub
		return new QuackCounter( new DuckCall()); 
	}

	@Override
	public Orderable createRubberDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter( new RubberDuck());
	}

}
