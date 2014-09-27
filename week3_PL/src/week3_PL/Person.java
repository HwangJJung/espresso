package week3_PL;

public class Person {
	String name;
	int age;
	
	Person()
	{
		this("사람",1);
	}
	Person(String name, int age) {
		this.name =name;
		this.age = age;
	}
	String introduce() {
		return "이름: " + name + ", 나이 " + age + "세";
	}
	String message() {
    return "Message : [" + introduce() + "]";
    }
	public static void main(String[] args) {
		Person yotsuba = new Person("요츠바",5);
		System.out.println(yotsuba.introduce());
	}
}