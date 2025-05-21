package day_1;

public class Methodarea {
	static int r=5,l=4,b=2;
	int a=4;
	void circle() {
		System.out.println(3.14*r*r);
	}
	static void rec() {
		System.out.println(l*b);
	}
	void sqr() {
		System.out.println(a*a);
	}
	static void tri() {
		int p=4,q=2;
		System.out.println(p*q/2);
	}

	public static void main(String[] args) {
		Methodarea n1=new Methodarea();
		n1.circle();
		rec();
		n1.sqr();
		tri();

	}

}
