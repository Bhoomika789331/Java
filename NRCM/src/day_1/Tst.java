package day_1;

public class Tst {
    int a=45,b=6;
	static int x=30,y=5;
	void and() {
		System.out.println(a>b&&a<b);
	}
	void or() {
	     System.out.println(x>y||x<=y) ;
}
	void diff() {
		int p=65,q=5;
		System.out.println(p!=q);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tst t1=new Tst();
		t1.and();
		t1.or();
		t1.diff();

	}

}



