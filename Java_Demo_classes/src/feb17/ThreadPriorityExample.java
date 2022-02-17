package feb17;
public class ThreadPriorityExample extends Thread {
public void run() {
	System.out.println("inside the run method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriorityExample th1 = new ThreadPriorityExample();
		ThreadPriorityExample th2 = new ThreadPriorityExample();
		ThreadPriorityExample th3 = new ThreadPriorityExample();
		System.out.println("priority of the thread th1 is : "+ th1.getPriority());
		System.out.println("priority of the thread th2 is : "+ th2.getPriority());
		System.out.println("priority of the thread th3 is : "+ th3.getPriority());
 th1.setPriority(Thread.MIN_PRIORITY);
 th1.setPriority(Thread.NORM_PRIORITY);
 th1.setPriority(Thread.MAX_PRIORITY);
 System.out.println("priority of the thread th1 is : "+ th1.getPriority());
	System.out.println("priority of the thread th2 is : "+ th2.getPriority());
	System.out.println("priority of the thread th3 is : "+ th3.getPriority());
	System.out.println("current thread : "+Thread.currentThread().getName());
	System.out.println("priority of the main thread is :"+Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(10);
	System.out.println("priority of the main thread is :"+Thread.currentThread().getPriority());
	}

}
