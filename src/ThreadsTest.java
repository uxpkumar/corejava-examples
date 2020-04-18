
public class ThreadsTest extends Thread{

	public void run(){
		System.out.println("Thread Start->>"
				+ ""+Thread.currentThread().getName());
		System.out.println("Run() method is called");
		
	}
	
	public static void main(String[] args) {
		
		ThreadsTest t1 = new ThreadsTest();
		t1.start();
	}
}
