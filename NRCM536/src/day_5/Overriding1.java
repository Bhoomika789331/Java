package day_5;
class Test3{
	void add() {
		System.out.println("hi");
	}
}

public class Overriding1 extends Test3 {
	void add() {
		System.out.println("hello");
	}

	public static void main(String[] args)
	{
	     
		Overriding1 o1=new Overriding1();
		o1.add();
	}

}
