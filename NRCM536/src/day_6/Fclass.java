package day_6;

class Test3{// final class cannot access//keep final before class
	void show() {
		System.out.println("hi");
	}
}
public class Fclass  extends Test3{
	void show() {
		int a=25;
		System.out.println(a);
		a=36;
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fclass f1=new Fclass();
		f1.show();
		

	}

}

