package day_8;

public class Runnable_interface implements Runnable {//=> symbol for instead of this code
	public void run(){
		System.out.println("hi");
	}//upto this
	public static void main(String[] args) {
		Runnable_interface t=new Runnable_interface();
	Thread t1=new Thread(t);//here creating object for the thread class
	System.out.println("hello");//it completes start method then finds for run method
	t1.start();//if this start method is not written then the run method is not executed
}

}
