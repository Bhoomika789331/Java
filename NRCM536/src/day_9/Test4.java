package day_9;
import java.util.*;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(89);
		l1.add(57);
		l1.add(45);
		System.out.println(l1);
		l1.addFirst(45);
		l1.addLast(89);
		l1.add(3,90 );
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(45);
		l1.remove(1);
		System.out.println(l1);

	}

}
