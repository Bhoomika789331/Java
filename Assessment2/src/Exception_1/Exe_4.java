package Exception_1;

import java.util.*;

public class Exe_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer");
		String n=sc.nextLine();
		try
		{
			int a=Integer.parseInt(n);
			System.out.println("parsed integer" + a);
		}catch(NumberFormatException e) {
			System.out.println("error: not a valid integer");
		}

	}

}

