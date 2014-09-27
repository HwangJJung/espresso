package week4_PL;

 public abstract class Person implements Tellable {
	
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
	
	String message() {
	    return "Message : [" + introduce() + "]";
    }
	
	
	static void method(Person person) {
		System.out.print(person.introduce());
	}
}