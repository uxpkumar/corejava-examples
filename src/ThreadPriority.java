
public class ThreadPriority implements Runnable{

	@Override
	public void run() {

		System.out.println("Thread is Running "+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		
		ThreadPriority tp = new ThreadPriority();
		Thread t1 = new Thread(tp,"Thread 1");
		Thread t2 = new Thread(tp,"Thread 2");
		Thread t3 = new Thread(tp,"Thread 3");

		
		System.out.println("Thread Priority::t1  "+t1.getPriority());
		System.out.println("Thread Priority::t2 "+t2.getPriority());
		System.out.println("Thread Priority::t3 "+t3.getPriority());
		
		t1.setPriority(3);
		t2.setPriority(10);
		t3.setPriority(6);
		
		
				
		System.out.println("After Thread Priority::t1  "+t1.getPriority());
		System.out.println("After Thread Priority::t2 "+t2.getPriority());
		System.out.println("After Thread Priority::t3 "+t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("After Sleep Thread Priority::t1  "+t1.getPriority());
		System.out.println("After Sleep Thread Priority::t2 "+t2.getPriority());
		System.out.println("After Sleep Thread Priority::t3 "+t3.getPriority());
		
	}

}
