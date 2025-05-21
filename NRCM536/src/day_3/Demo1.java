package day_3;

abstract class Test1{
	abstract void add();
	abstract void sum();
}
class Demo1 extends Test1 {
   public void add() {
	   System.out.println("hi");
   }
   public void sum() {
	   System.out.println("hello");
   }

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.add();
		d1.sum();

	}

}


