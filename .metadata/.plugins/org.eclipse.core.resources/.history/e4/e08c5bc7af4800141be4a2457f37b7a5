package clerk;

public class TicketBox {
	
	final static int EMPTY = 0;
	final static int HAS_CUSTOMER = 1;
	final static int SOLD = 2;
	
	int state = EMPTY;
	
	public void isCameCustomer() {
		if (state == EMPTY) {
			state = HAS_CUSTOMER;
			System.out.println("어서오세요. 티켓발부 해드릴게요.");
			takeOrder();
		} else if (state == HAS_CUSTOMER) {
			System.out.println("다른 분 이후에 안내도와드릴게요. ");	
		} else if (state == SOLD) {
			System.out.println("잠시만요, 티켓 발급 중입니다.");
		}
	}
	
	private void takeOrder() {
		if (state == EMPTY) {
			System.out.println("줄 서서 기다리셔야해요.");
		} else if (state == HAS_CUSTOMER) {
			state = SOLD;
			ticketing();
			System.out.println("멀리 가시네요~ 티켓 준비중이니 잠시만 기다려주세요.");	
		} else if (state == SOLD) {
			System.out.println("잠시만요, 티켓 발급 중입니다.");
		}
	}
	

	private void ticketing() {
		System.out.println("잠시 기다립시다.스레드 불러서 잠시 멈출게요.");
		Ticket ticket = new Ticket();
		Thread t = new Thread(new TiketBoxMachine(ticket));
		t.start();
		state = ticket.state;
	}

}
