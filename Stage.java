package actions;

public class Stage extends Thread{
	
	public void run() {
		Army armysui=new Army();
		Army armynongmin=new Army();
		Thread sui=new Thread(armysui,"隋军");
		Thread nongmin=new Thread(armynongmin,"农民军");
		sui.start();
		nongmin.start();
	}
	
	
	public static void main(String[] args) {
		Stage s=new Stage();
		s.start();
		
	}

}
