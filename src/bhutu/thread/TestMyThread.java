package bhutu.thread;

public class TestMyThread {

	public static void main(String[] args) {


		MyThread th=new MyThread();
		MyThread th1=new MyThread();		
		th.run();
		th1.run();
		MyRunnable runnable1=new MyRunnable();
		
		Thread thread2=new Thread(runnable1);
		
		thread2.run();
		
		
		
				
		
		

	}

}
