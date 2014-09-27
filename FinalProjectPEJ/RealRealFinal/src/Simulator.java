
public class Simulator {

	public static void main(String[] args) {
		
		FileIO fileio = new FileIO();
		
		fileio.addClient(new Client("고객1", 0, 5,"서울","광주"));
		fileio.addClient(new Client("고객1", 0, 3,"서울","광주"));
		fileio.addClient(new Client("고객1", 1, 3,"서울","광주"));
		fileio.addClient(new Client("고객1", 2, 4,"서울","광주"));
		fileio.addClient(new Client("고객1", 3, 4,"서울","광주"));
		fileio.addClient(new Client("고객1", 4, 4,"서울","광주"));
		fileio.addClient(new Client("고객1", 4, 4,"서울","광주"));
		fileio.addClient(new Client("고객1", 5, 4,"서울","광주"));
		fileio.addClient(new Client("고객1", 6, 4,"서울","광주"));
		fileio.addClient(new Client("고객1", 6, 4,"서울","광주"));
		fileio.addClient(new Client("고객1", 7, 4,"서울","광주"));
		
		
		
		Invoker invoker = new Invoker();
		Timer timer = new Timer();
		TimerOnCommand timerOn = new TimerOnCommand(timer);
		
		invoker.setCommand(timerOn);
		invoker.TimeEnd();

		
		
	}

}
