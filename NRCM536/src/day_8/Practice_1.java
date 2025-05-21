package day_8;

public class Practice_1  implements Runnable{
	public void run(){
		System.out.println("hi");
	}
	public static void main(String[] args) {
	Thread_class t=new Thread_class();
	Thread_class t1=new Thread_class();// if you miss this line then thread will run two times from the heap
	Thread p1=new Thread(t);
	Thread p2=new Thread(t1);//t

	System.out.println("hello");
	p1.start();//same output but one runnable method
	p2.start();
	
}

}



