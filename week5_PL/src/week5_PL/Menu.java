
package week5_PL;
import java.util.*;

public  class Menu {
	MenuItem[] menuItem;
	
	Menu(){
		this.menuItem = null;
	}
	
	Menu(MenuItem[] menuItem){
		 this.menuItem = menuItem;
	}
	public static  String order(){
		System.out.print("메뉴를 선택하세요: ");	
		Scanner keyboard = new Scanner(System.in);	
		String input_value = keyboard.nextLine();
		return input_value;
	}
	
	public static MenuItem search(Menu menu ,String input) {
		
		for (int i=0 ; i < menu.menuItem.length; i++) {
			if (menu.menuItem[i].name.equals(input)){
				return menu.menuItem[i];
			}
		}
		System.out.println("메뉴판에 없습니다.에스프레소 드세요. ");
		return menu.menuItem[3];
	}
	
	public static int discount(){
		System.out.print("할인종류를 입력하세요(1-쿠폰,2-카드,3-이벤트) : ");	
		Scanner keyboard = new Scanner(System.in);	
		int discount = keyboard.nextInt();	
		return discount;
	}
	
	public static String addon() {
		System.out.println("추가 재료를 선택하세요(우유 모카 두유 크림) :");
		Scanner keyboard = new Scanner(System.in);	
		String addon = keyboard.nextLine();	
		return addon;
	}
	
}
