package Collection_day_8;
//listiterator
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(78);
		System.out.println(l1);
		ListIterator<Integer> i1=l1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		while(i1.hasPrevious()) {
			
			System.out.println(i1.previous());
		}
		
		

	}

}


