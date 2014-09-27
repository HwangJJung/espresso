package week5_PL;

public class Barista {
	private String name;
	
	Barista(){
		this.name = "조영호";
	}
	
	Barista(String name){
	 this.name = name;
	}
	void make_menu(MenuItem menuItem){
		menuItem.make();
	}
    void count(MenuItem menuItem){
    	double cost = menuItem.cost;
    	cost = Math.floor(cost);
		make_menu(menuItem);
		System.out.println("구매가격: " + cost + "원");
	}
	
	void count(MenuItem menuItem, int discount){
		double cost = 0;
		switch(discount) {
		case 1:
			cost = (menuItem.cost - 100); 
			break;
		case 2:
			cost = (menuItem.cost*0.97); 
			cost = Math.floor(cost);
			break;
		case 3:
			cost = (menuItem.cost * 0); 
			break;
		}
	    int cost2 = (int) cost;
	    make_menu(menuItem);
		System.out.println("구매가격: " + cost2 + "원");	
	}
	
	void count(MenuItem menuItem, int discount, String addon){
		double cost = menuItem.cost;
		if (addon.contains("우유")) {
			cost = cost + 100;
		}
		if (addon.contains("모카")) {
			cost = cost + 50;
		}
		
		if (addon.contains("크림")) {
			cost = cost * 1.0001;
		}
		if (addon.contains("두유")) {
			cost = cost * 1.001;
		}
		
		switch(discount) {
		case 1:
			cost = (cost - 100); 
			break;
		case 2:
			cost = (cost*0.97); 
			cost = Math.floor(cost);
			break;
		case 3:
			cost = (cost * 0); 
			break;
		}
	    
		
		
		int cost2 = (int) cost;
	    
	    make_menu(menuItem);
	    System.out.println();
		System.out.println("구매가격: " + cost2 + "원");	
	}
}
