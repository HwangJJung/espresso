
public class RedheadDuck implements Orderable {
	
	Observable observable;
	
	
	public RedheadDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
		
	}

	@Override
	public void notifyObservers() {
		
		observable.notifyObservers();
		
	}
}
