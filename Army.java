package actions;

public class Army implements Runnable {
	volatile boolean keeprunning=true;

	public void run() {
		
		while(keeprunning) {
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+"����["+i+"]��");
			    Thread.yield();
				
			}
			
		}
	}

}
