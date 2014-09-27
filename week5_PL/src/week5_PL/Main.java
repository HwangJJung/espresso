
package week5_PL;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("몇번째 Lab을 실행할까요?: ");	
		Scanner keyboard = new Scanner(System.in);	
		String lab_num = keyboard.nextLine();
		
		switch(lab_num) {
		case "1":
			lab1(); break;		
		case "2":
			lab2(); break;
		case "3":
			lab3(); break;
		case "4":
			lab4(); break;
		case "5":
			lab5(); break;	
		case "6":
			lab6(); break;	
		}
	}
	public static void lab1() {

		Menu menu = new Menu(new MenuItem[] {
				new Coffee("하우스 블렌드",1000),
			    new Coffee("다크 로스트",1500),
			    new Coffee("디캐프",1200),
			    new Coffee("에스프레소",900)
		});
		
		MenuItem order = Menu.search(menu, Menu.order());
		System.out.println("가격: " + order.cost + "원");
	}
	
	public static void lab2(){
		Menu menu = new Menu(new MenuItem[] {
				new Coffee("하우스 블렌드",1000),
			    new Coffee("다크 로스트",1500),
			    new Coffee("디캐프",1200),
			    new Coffee("에스프레소",900)
		});
		Barista barista = new Barista();
		MenuItem order = Menu.search(menu, Menu.order());
		System.out.println("가격: " + order.cost + "원");
		barista.make_menu(order);
		System.out.println("이름: " + order.name);

	}
	public static void lab3(){
		Menu menu = new Menu(new MenuItem[] {
				new Coffee("하우스 블렌드",1000),
			    new Coffee("다크 로스트",1500),
			    new Coffee("디캐프",1200),
			    new Coffee("에스프레소",900),
			    new Tea("녹차",1000),
				new Tea("밀크티",1200)
					
		});
		Barista barista = new Barista();
		MenuItem order = Menu.search(menu, Menu.order());
		barista.make_menu(order);
		System.out.println("이름: " + order.name);
	}
	public static void lab4(){
		Menu menu = new Menu(new MenuItem[] {
				new Coffee("하우스 블렌드",1000),
			    new Coffee("다크 로스트",1500),
			    new Coffee("디캐프",1200),
			    new Coffee("에스프레소",900),
			    new Tea("녹차",1000),
				new Tea("밀크티",1200)
					
		});
		Barista barista = new Barista();
		MenuItem order = Menu.search(menu, Menu.order());
		barista.count(order);
	}
	public static void lab5(){
		Menu menu = new Menu(new MenuItem[] {
				new Coffee("하우스 블렌드",1000),
			    new Coffee("다크 로스트",1500),
			    new Coffee("디캐프",1200),
			    new Coffee("에스프레소",900),
			    new Tea("녹차",1000),
				new Tea("밀크티",1200)			
		});
		Barista barista = new Barista();
		MenuItem order = Menu.search(menu, Menu.order());
		barista.count(order, Menu.discount());
	}
	public static void lab6(){
		Menu menu = new Menu(new MenuItem[] {
				new Coffee("하우스 블렌드",1000),
			    new Coffee("다크 로스트",1500),
			    new Coffee("디캐프",1200),
			    new Coffee("에스프레소",900),
			    new Tea("녹차",1000),
				new Tea("밀크티",1200)					
		});
		Barista barista = new Barista();
		MenuItem order = Menu.search(menu, Menu.order());
		barista.count(order, Menu.discount(), Menu.addon());
	}
}
