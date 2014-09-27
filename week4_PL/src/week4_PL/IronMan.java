package week4_PL;
	
public class IronMan {
	Tellable tellable;
	
	IronMan(Tellable tellable) {
		this.tellable = tellable;
	}
	
	String introduce() {
		return tellable.introduce();
	}
}

