package day_9;
import java.util.*;

public class Queue1 {
	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(67);
		q1.offer(45);
		q1.offer(90);
		q1.offer(78);
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.peek();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		
		
	}

}
