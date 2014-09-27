package week3_PL;

public class Killer extends Person {
	String warning;
	String weapon;
	
	Killer(String name, int age, String warning, String weapon)
	{
		this.name = name;
		this.age = age;
		this.warning = warning;
		this.weapon = weapon;
	}

	String getWeapon() {
		return weapon;
	}
	
	String introduce() {
		return "무기 : " + weapon + "," +
		"이름 : " + name + ", 나이 " + age + "세";
		}

	public static void main(String[] args) {
		Person killerYotsuba = new  Killer("요츠바",5,"You can tell me in hell.", "총");
		System.out.println(killerYotsuba.introduce());
	}
	
}