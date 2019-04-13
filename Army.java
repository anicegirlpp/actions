package actions;

public class Army implements Runnable {
	public void run() {
		boolean keeprunning=true;
		while(keeprunning) {
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+"½ø¹¥["+i+"]´Î");
			    Thread.yield();
				
			}
			
		}
	}

}
