package day_9;
import java.util.*;
public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1=new Stack<Integer>();
		s1.push(56);
		s1.push(89);
		s1.push(90);
		System.out.println(s1); 
		System.out.println(s1.peek());//last one
		System.out.println("hello");
		System.out.println(s1.pop());//90
		System.out.println("hi");
		Iterator<Integer> i1=s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
      System.out.println(s1.push(13));
	}

}
