package day_9;//hashmap
import java.util.*;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1,"cse");// it doesnt support the two values like cse ,ece(same like set)
		m1.put(2,"ece");
		m1.put(3,"ds");
		m1.put(4, "cs");
		m1.put(5, null);
		System.out.println(m1);

	}

}
