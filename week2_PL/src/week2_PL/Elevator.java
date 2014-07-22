package week2_PL;

public class Elevator {
	int floor;
	
	
	Elevator(int floor)
	{
		this.floor =floor;
	}
	
	Elevator()
	{
		this(1);
	}
	void moveUp()
	{
		moveUp(10);
	}
	
	void moveUp(int floor)
	{
		if(floor > 10 || this.floor >= floor){
			return;
		}
		this.floor = floor;
	}
	
	void movedown()
	{
		movedown(1);
	}
	
	void movedown(int floor)
	{
		if(floor < 1 || this.floor <= floor){
			return;
		}
		this.floor = floor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elevator elevator = new Elevator();
		System.out.println(elevator.floor);
		
		elevator.moveUp(8);
		System.out.println(elevator.floor);
	}
	
}
