package Collection_day_8;
//Enumerator
import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(78);
		System.out.println(l1);
		Enumeration<Integer> i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}
		

	}

}



