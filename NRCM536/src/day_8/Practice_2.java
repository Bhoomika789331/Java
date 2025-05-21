package day_8;
class Test2 extends Thread{
	public void run(){
		System.out.println("hi");
	
}
}
class Test1  implements Runnable{
	public void run(){
		System.out.println("gm");
	}
}
public class Practice_2{
	
    public static void main(String[] args) {
	  Test1 t2=new Test1();
	   Test2 t1=new Test2();
	 
	  t1.start();
	  Thread p2=new Thread(t2);
	p2.start();
	 

}
}


