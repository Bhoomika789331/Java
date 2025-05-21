package day_5;
interface I1{
	/*optional -abstract*/ void add();
}
interface I2{
	void sub();
}

public class Interface1 implements I1,I2{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hellom");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Interface1 n1=new  Interface1();
		 n1.add();
		 n1.sub();
		 

	}

}
