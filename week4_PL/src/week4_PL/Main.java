package week4_PL;

public class Main {
	public static void main(String[] args) {
	
		IronMan ironman = new IronMan(new Kid("요츠바",5));
		System.out.print(ironman.introduce());
	}
}
