package day_2;
import java.util.Scanner;//added
public class Switch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);//added scanner class if it not add then write the below line
	//String color="orange";
	System.out.println("enter the color");//added for scanner class
	String color=sc.next();//added
	switch(color) {
	case "red":
		System.out.println("holi");
		break;
	case "green":
		System.out.println("dasara");
		break;
	case "white":
		System.out.println("ugadi");
		break;
	default :
		System.out.println("no");
	}

	}

}
