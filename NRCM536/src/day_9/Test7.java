package day_9;
import java.util.*;

public class Test7 {//does not follow insertion
	public static void  main(String[] args) {
	Set<Integer> q1=new TreeSet<Integer>();
	q1.add(12);
	q1.add(89);
	//q1.add(null); it does not allow null
	q1.add(12);
	//q1.add(null);
	q1.add(45);
	System.out.println(q1);//does not allows duplicates
	}
	
}
