package client;
import java.util.Iterator;



public class ClientTimeChecker implements Runnable {
	
	int currentTime = 0;
	ClientQueue clientQueue = new ClientQueue();
	ClientQueue seoulQueue = new ClientQueue();
	
	
	@Override
	public void run() {
		
		clientQueue.initialize();
		
		while(true) {
			try {
				Thread.sleep(1000); //1초마다
			} catch ( InterruptedException e) {}
			System.out.println("1");
		
			Iterator<Client> it = clientQueue.getList().iterator();
			while (it.hasNext()) {

				Client client = it.next();
				
				if(client.getArrivalTime() == currentTime) {
					seoulQueue.add(client);
					System.out.println(client.name + "enqueue " + client.getArrivalTime() + " is same" + currentTime);
					
					
					//	clientQueue.remove(client);
				}
			}
			currentTime++;
		}
		
	}
}
