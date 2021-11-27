package bhutu.thread;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i=25; i>0;i--) {
			
			System.out.println("My Runnable :" +i);
			
			try {
			
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		

	}
	
		System.out.println("Runnable thread ends. ");	

	}
	
}
