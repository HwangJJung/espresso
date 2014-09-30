package client;
import java.util.ArrayList;
import java.util.Iterator;


public class ClientQueue {

	
	ArrayList<Client> clients = new ArrayList<Client>();


	public void add(Client client) {
		clients.add(client);
	}
	
	public void remove(Client client) {
		clients.remove(client);
	}
	
	
	public void initialize() {

		add(new Client("고객1", 0, 3,"서울","광주"));
		add(new Client("고객2", 1, 3,"서울","광주"));
		add(new Client("고객3", 2, 4,"서울","광주"));
		add(new Client("고객4", 3, 4,"서울","광주"));
		add(new Client("고객5", 4, 4,"서울","광주"));
		add(new Client("고객6", 4, 4,"서울","광주"));
		add(new Client("고객7", 5, 4,"서울","광주"));
		add(new Client("고객8", 6, 4,"서울","광주"));
		add(new Client("고객9", 6, 4,"서울","광주"));
		add(new Client("고객0", 7, 4,"서울","광주"));
		
	}
	
	public ArrayList<Client> getList() {
		return clients;
	}
	
	public Client get(int i) {
		return clients.get(i);
	}
	
	public void sort() {
	//	ClientComparator comparator = new ClientComparator();
		// Collection.sort(clients,comparator);
		
	}
	
	public int getSize() {
		return clients.size();
	}
	

	public void Order() {
		Iterator<Client> iterator = clients.iterator();
		while (iterator.hasNext()) {
			Client client = (Client)iterator.next();
			client.Order();
		}
	}

	public void enterStation() {
		// TODO Auto-generated method stub
		
	}

}
