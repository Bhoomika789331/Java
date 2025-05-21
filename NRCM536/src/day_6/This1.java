package day_6;

public class This1 extends Object {
	int a=89;
	void add() {
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		This1 t1=new This1();
		t1.sub();
	}

}
