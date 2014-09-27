
public class DuckCall implements Orderable {

	Observable observable;
	
	public DuckCall() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Kwak");
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
