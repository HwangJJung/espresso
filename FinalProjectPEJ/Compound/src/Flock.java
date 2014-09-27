import java.util.ArrayList;
import java.util.Iterator;


public class Flock implements Orderable {
	
	ArrayList<Orderable> quackers = new ArrayList<Orderable>();


	public void add(Orderable quacker) {
		quackers.add(quacker);
	}
	
	
	@Override
	public void quack() {
		Iterator<Orderable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Orderable quacker = (Orderable)iterator.next();
			quacker.quack();
			
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		
		Iterator<Orderable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Orderable quacker = (Orderable)iterator.next();
			quacker.registerObserver(observer);
		}
		
	}

	@Override
	public void notifyObservers() {	}

}
