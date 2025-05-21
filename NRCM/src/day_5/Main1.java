package day_5;

public class Main1 {
	public static void main() {
    	   System.out.println("good morning");
       }
	public static void main(int a,int b) {
    	   System.out.println(a+b);
       }
	public static void main(double d1,double d2) {
    	   System.out.println(d1-d2);
       }
	public static void main(String s1,String s2) {
    	   System.out.println(s1+s2);
       }


	public static void main(String[] args) {
		Main1 o1=new Main1();
		main();
		main(12, 8);
		main(1.1, 0.1);
		main("ab", "cd");
		

	}

}

