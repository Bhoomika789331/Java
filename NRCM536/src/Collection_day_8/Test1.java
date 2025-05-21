package Collection_day_8;
//iterator
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(78);
		System.out.println(l1);
		Iterator<Integer> i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		

	}

}
