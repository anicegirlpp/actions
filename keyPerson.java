package actions;

public class keyPerson extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+"¿ªÊ¼Õ½¶·");
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"×óÍ»ÓÒÉ±£¬¹¥»÷Ëå¾ü");
		}
		
		
		
		System.out.println(Thread.currentThread().getName()+"½áÊøÕ½¶·");
		
	}

}
