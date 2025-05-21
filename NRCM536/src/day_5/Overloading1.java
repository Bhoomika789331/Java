package day_5;

public class Overloading1 {
       void show() {
    	   System.out.println("good morning");
       }
       void show(int a,int b) {
    	   System.out.println(a+b);
       }
       void show(double d1,double d2) {
    	   System.out.println(d1-d2);
       }
       void show(String s1,String s2) {
    	   System.out.println(s1+s2);
       }


	public static void main(String[] args) {
		Overloading1 o1=new Overloading1();
		o1.show();
		o1.show(12, 8);
		o1.show(1.1, 1.2);
		o1.show("ab", "cd");
		

	}

}
