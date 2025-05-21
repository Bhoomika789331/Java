package day_8;

public class Daemon_thread extends Thread{
	String s;
	public  Daemon_thread(String name) {
		s=name;
	}
	public void run()
	{
		//checking whether the thread is Daemon or not
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(s+"is Daemon Thread");
		}
		else
		{
			System.out.println(s+"is user Thread");
		}
	}
	public static void main(String[] args) {
		 Daemon_thread thread1=new  Daemon_thread("thread1");
		 Daemon_thread thread2=new  Daemon_thread("thread2");
		 Daemon_thread thread3=new  Daemon_thread("thread3");
		 
		 thread1.setDaemon(true);//set user thread1 to daemon
		 
		 thread1.start();//starting thread1
		 thread2.start();//starting thread2
		 thread2.setDaemon(false);
		 thread3.start();
		 
	}

}
