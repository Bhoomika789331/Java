package day_7_;
import java.util.*;

import day_3.Strings;


public class Exception2{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException|InputMismatchException e) {//replace ArithmeticException 
			System.out.println(e.getMessage());
		}
		/*catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}*/
		finally {
			System.out.println("hi");// its executes 
		}

	}

}
