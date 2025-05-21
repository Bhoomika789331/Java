package day_3;

abstract class Test2{//concrete class//visible area
	abstract void add();//abstract
	void play() {//instance
		System.out.println("play cricket");
	}
	
}
class Demo2 extends Test2 {//base class//back end program
   public void add() {
	   System.out.println("hi");
   }
   

	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		d1.add();
		d1.play();

	}

}


