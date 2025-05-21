package day_8;

public class Thread_class extends Thread{
	public void run(){
		System.out.println("hi");
	}
	public static void main(String[] args) {
	Thread_class t1=new Thread_class();
	System.out.println("hello");
	t1.start();//here run method is not called but executed(multithreading)
}

}
