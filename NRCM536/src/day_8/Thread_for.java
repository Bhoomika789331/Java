package day_8;

public class Thread_for extends Thread {
	public void run() {
		for (int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
	}
	public static void main(String[] args) {
		Thread_for  t1=new Thread_for ();
		/*for(int i=0;i<=10;i++) {
			System.out.println(i);
			
		}*/
		t1.start();	}
	

}
