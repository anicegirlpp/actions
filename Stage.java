package actions;

public class Stage extends Thread{
	
	public void run() {
		Army armysui=new Army();
		Army armynongmin=new Army();
		Thread sui=new Thread(armysui,"���");
		Thread nongmin=new Thread(armynongmin,"ũ���");
		sui.start();
		nongmin.start();
	}
	
	
	public static void main(String[] args) {
		Stage s=new Stage();
		s.start();
		
	}

}
