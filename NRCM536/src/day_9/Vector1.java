package day_9;
import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> s1=new Vector<Integer>();
		s1.add(56);
		s1.add(89);
		s1.add(90);
		System.out.println(s1);
		Enumeration i1=s1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}

	}

}
