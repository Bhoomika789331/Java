package day_1;

public class Marea {
	static int r=5,l=4,b=2;
	int a=4;
	void Circle() {
		System.out.println(3.14*r*r);
	}
	static void Rec() {
		System.out.println(l*b);
	}
	void Sqr() {
		System.out.println(a*a);
	}
	static void Tri() {
		int p=4,q=2;
		System.out.println(p*q/2);
	}

	public static void main(String[] args) {
		Marea n1=new Marea();
		n1.Circle();
		Rec();
		n1.Sqr();
		Tri();

	}

}
