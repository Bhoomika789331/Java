package day_6;
class Demo1{
	void show() {//example library
		System.out.println("hi");
	}
}


public class Anynomous_1 {// it takes the inbuilt method show()
	Demo1 d1=new Demo1() {//anynomous//reference object is created for library class
		void show() {//anynomous method
			System.out.println("hello");
			super.show();//if you dont want to print the library method then remove this super.show();
		}
		
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anynomous_1 a1=new Anynomous_1();
	   a1.d1.show();
		

	}

}
