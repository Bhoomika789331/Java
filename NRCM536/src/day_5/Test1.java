package day_5;
interface I5{
	void add();
}
class Test39{
	void sub(){
		System.out.println("hello");
	}
}

public class Test1 extends Test39 implements I5{// remove I2
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hellom");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 n1=new  Test1();
		 n1.add();
		 n1.sub();
		 

	}

}

