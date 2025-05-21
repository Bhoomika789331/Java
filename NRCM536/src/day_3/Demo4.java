package day_3;
abstract class Test4{
	abstract void add();
	
	static void mul() {
		System.out.println("mul");
	}
	static void div() {
		System.out.println("div");
	}
	void play() {
		System.out.println("play cricket");
	}
	void dance() {
		System.out.println("dance");
	}
}
class Sample2 extends Test4{
	public void add() {
		   System.out.println("add");
	}
	void mod() {
		System.out.println("mod");
	}
}
class Demo4 {

	public static void main(String[] args) {
		Sample2 d1=new Sample2();{
			 d1.add();
		     Test4.mul();
		     Test4.div();
		     d1.play();   
		     d1.dance();
		     d1.mod();
		        
		}

	}

}
