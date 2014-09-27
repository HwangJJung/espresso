

public class GooseAdapter implements Orderable {
	
	Observable observable;
	Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
		
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
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
