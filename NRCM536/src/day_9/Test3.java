package day_9;
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {67,89,90,46,88};
		Arrays.sort(arr1);
		int a=Arrays.binarySearch(arr1, 88);
		System.out.println(a);
		for(int b1:arr1)
			System.out.println(b1);
		System.out.println();

	}

}
