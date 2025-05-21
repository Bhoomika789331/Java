package day_5;
class Sample45{
	public Sample45() {
		System.out.println("good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}

public class Super1 extends Sample45{
    public Super1() {
    	super();
    	
    }
    void show() {
    	int y=45;
    	//super.print();
    	System.out.println(super.x);
    	System.out.println(y);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super1 s1=new Super1();
		s1.show();

	}

}
