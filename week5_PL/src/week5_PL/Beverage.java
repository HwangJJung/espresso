package week5_PL;

public abstract class Beverage extends MenuItem {
	
	Beverage(){
		this.cost= 0;
		this.name= " ";
	}
	
	Beverage(String name, int cost){
		 this.name = name;
		 this.cost = cost;
	}
	
	private void boil_water(){
		System.out.println("- 물 끓이는 중");	
	}
	
	abstract protected void brew();
	
	private void pour_in_cup(){
		System.out.println("- 컵에 따르는 중");		
	}
	
	abstract protected void add_condiments();
	
	void make()
	{
		boil_water();
		brew();
		pour_in_cup();
		add_condiments();
	}
}
