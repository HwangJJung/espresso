

public interface ReleaseObservable {
	
	public void registerObserver(Observer observer);
	public void notifyObservers();

}
