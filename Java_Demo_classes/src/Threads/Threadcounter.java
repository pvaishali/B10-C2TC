package Threads;

public class Threadcounter implements Runnable {
public void run() {
	int i=0;
	while(i<=2) {
		try {
			i++;
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(5);
			if(i==2) {
				i=0;}}
		catch(Exception e) {
			e.printStackTrace();}}}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threadcounter t=new Threadcounter();
Thread th1= new Thread(t);
Thread th2= new Thread(t);
th1.start();
th2.start();
	
}

}
