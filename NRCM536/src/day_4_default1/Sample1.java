package day_4_default1;

class Sample2{
	protected void add() {
		System.out.println("hello");
	}
}
public class Sample1 extends Sample2{
	
	public static void main(String[] args) {
	   
		Sample2 d1=new Sample2();
		d1.add();
		
	}
}
