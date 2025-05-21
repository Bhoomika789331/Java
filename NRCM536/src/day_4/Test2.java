package day_4;

public class Test2 {
	int x;
	int y;
	int z;
	public Test2() {
		System.out.println("welcome to my profile : Bhoomika");
	}
	public Test2(int x) {
		this.x=x;
		System.out.println("ssc:"+x);
	}
	public Test2(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("ssc:"+x+", inter:"+y);
	}
	public Test2(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("ssc:"+x+", inter:"+y+", b.tech:"+z);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t1=new Test2();
		Test2 t2=new Test2(989);
		Test2 t3=new Test2(989,950);
		Test2 t4=new Test2(989,950,900);

	}

}
