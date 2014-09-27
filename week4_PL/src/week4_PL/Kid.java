package week4_PL;

public class Kid extends Person {
	
	public Kid (String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public String introduce() {
		return 
		"이름 : " + name + ", 나이 " + age + "세";
		}

}
