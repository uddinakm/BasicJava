package bhutu.thread;

public class MyThread extends Thread{

	@Override
	public void run() {
		
		for(int i=0; i<15;i++) {
			
			System.out.println("My Thread %d " +i);
			
			try {
			Thread.sleep(1000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
			
	}
		System.out.println("Finished MyThread");
	
}
}
