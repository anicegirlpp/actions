package actions;

public class keyPerson extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+"��ʼս��");
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"��ͻ��ɱ���������");
		}
		
		
		
		System.out.println(Thread.currentThread().getName()+"����ս��");
		
	}

}
