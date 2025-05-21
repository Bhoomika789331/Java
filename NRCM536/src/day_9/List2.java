package day_9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2 {
	public static void main (String[] args) {
	   List<Object> l1=new ArrayList<Object>();	
	   l1.add(12);
	   l1.add("hi");
	   l1.add(67);
	   System.out.println(l1);
	   List<Object> extra=Arrays.asList("nikky","bhanu");
	   l1.addAll(1,extra);//1 is an index if removes output is changes
	   System.out.println(l1.get(3));//.get(index) is used to access the particular position if remove output will change 
	   
	}
}
