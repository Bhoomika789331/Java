package day_4;
class Demo1{
	/*private void add() {
		System.out.println("hi");
	}*/
}


public class Private1 extends Demo1{
	private void add() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private1 p1=new Private1();
		p1.add();//error because it is not acessed because it is private
	}

}
