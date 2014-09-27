package week5_PL;

public class Tea extends Beverage {
	Tea(String name, int cost){
		 this.name = name;
		 this.cost = cost;
	 	}
	
   
	protected void brew(){
	System.out.println("- 차를 우려내는 중");				
	}
	protected void add_condiments(){
	System.out.println("- 레몬을 추가하는 중");	
	}

}
