package Test1;
import java.util.*;


public class Linkedhash_1 {//it allows insertion order
	public static void  main(String[] args) {
	Set<Integer> q1=new LinkedHashSet<Integer>();
	q1.add(12);
	q1.add(89);
	q1.add(null);
	q1.add(12);
	q1.add(null);
	q1.add(45);
	System.out.println(q1);
	}
	
}

