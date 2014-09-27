package week5_PL;

public abstract class MenuItem {
	protected String name;
	protected int cost;
	protected String type;
	
	MenuItem(){
		this.cost= 0;
		this.name= " ";
	}
	
	MenuItem(String name, int cost){
		 this.name = name;
		 this.cost = cost;
	}
	
	MenuItem(String type ,String name, int cost){
		this.type = type; 
		this.name = name;
		 this.cost = cost;
	}

	abstract void make();
	
}
