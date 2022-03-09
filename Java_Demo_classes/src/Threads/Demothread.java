package Threads;

public class Demothread implements Runnable  {
	public void run() {
		int i=0;
		while(i<=2) {
			
				i++;
				System.out.println(Thread.currentThread().getName());
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demothread dt=new Demothread();
		Thread th1= new Thread(dt);
		Thread th2= new Thread(dt);
		th1.start();
		th2.start();
	}

}
