package day_2;

public class Practice {

	public static void main(String[] args) {
		int a=10;
		if(a%2==0) {
			System.out.println("satisfy"+a);
		    if(a%3==0) {
			System.out.println("both satisfied");
		}
		else {
			System.out.println("not multiplied with 3");
		}

	}
	else {
			if(a<=11) {
				System.out.println("below 10");
			}
			else {
				System.out.println("above 10");
			}
		}

	}

}
