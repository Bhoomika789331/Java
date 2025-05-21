package day_5;

public class Nested1 {
      void show() {
    	  System.out.println("hi");
      }
      class Test2{
    	  void print() {
    		  System.out.println("hello");
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested1 n1=new Nested1();
		n1.show();
		Nested1.Test2 t1=new Nested1().new Test2();
		t1.print();
		
		

	}

}
