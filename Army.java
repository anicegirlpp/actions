package actions;

public class Army implements Runnable {
	public void run() {
		boolean keeprunning=true;
		while(keeprunning) {
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+"����["+i+"]��");
			    Thread.yield();
				
			}
			
		}
	}

}
