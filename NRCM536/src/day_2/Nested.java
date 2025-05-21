package day_2;

public class Nested {

	public static void main(String[] args) {
		int a=12;
		if(a%2==0) {
			System.out.println("satisfy"+a);
		    if(a%3==0) {
			System.out.println("both satisfied");
		}
		else {
			System.out.println("not multiplied with 3");
		}

	}

}
}
