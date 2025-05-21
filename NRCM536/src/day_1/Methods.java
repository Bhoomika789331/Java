package day_1;

public class Methods {
	int x=6,y=8;//instance
	static int p=5,q=12;//static
	
	   void div() {
		   int a=20,b=10;
		   System.out.println(x+y);
		   System.out.println(p+y);
		   System.out.println(a+b);
	   }
	 static void show() {
		 int a=2,b=3;//doesnt allow instance variables
		 System.out.println(p+q);
		 System.out.println(a+b);
	 }
public static void main(String[] args) {
	new Methods();
	show();//for same class
}

}
