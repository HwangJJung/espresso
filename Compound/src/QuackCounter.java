

public class QuackCounter implements Client {
	
	
	Client duck;
	static int numberOfQuacks;
	
	public QuackCounter (Client duck) {
		this.duck  = duck;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		numberOfQuacks++;
		notifyObservers();
	}
	
	public static int getQuacks() { 
		return numberOfQuacks;
	}
	

	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
		
	}

	@Override
	public void notifyObservers() {
		
		duck.notifyObservers();
		
	}

}
