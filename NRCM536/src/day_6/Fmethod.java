package day_6;
/*class Test1{
	final void show() {
		System.out.println("hi");//with final method
	}
}*/
class Test1{
	void show() {
		System.out.println("hi");//without final method
	}
}
public class Fmethod  extends Test1{
	void show() {
		int a=25;
		System.out.println(a);
		a=36;
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fmethod f1=new Fmethod();
		f1.show();
		f1.show();

	}

}
