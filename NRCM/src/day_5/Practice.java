package day_5;
class Fruits{
	void benifits() {
		System.out.println("healthy");
	}
}
class Apple extends Fruits {
	void color() {
		System.out.println("red");
	}
}
class  Mango extends Fruits{
	void cost() {
		System.out.println("100 kg");
	}
}
class Banana extends Fruits{
	void taste() {
		System.out.println("sweet");
	}
}

public class Practice {

	public static void main(String[] args) {
		Apple a1=new Apple();
		Banana b1=new Banana();
		Mango m1=new Mango();
		a1.benifits();
		a1.color();
		//b1.benifits();
		b1.taste();
		m1.cost();
	}

}



