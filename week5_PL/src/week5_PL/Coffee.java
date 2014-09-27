package week5_PL;

public class Coffee extends Beverage {
 
	Coffee(String name, int cost){
		this.name = name;
		this.cost = cost;
	 }
	
	
	protected void brew(){
	System.out.println("- 필터로 커피를 우려내는 중");				
	}
	protected void add_condiments(){
	System.out.println("- 설탕과 커피를 추가하는 중");	
	}

}
