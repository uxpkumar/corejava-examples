
public class DaemonThreadExample implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(Thread.currentThread().isDaemon())
			System.out.println("Thread is running and Daemon");
		else
			System.out.println("Thread is running and not a Daemon");
	}
	
	public static void main(String[] args) {
		
		DaemonThreadExample dt = new DaemonThreadExample();
		
		Thread t1 = new Thread(dt, "Thread1");
		Thread t2 = new Thread(dt, "Thread2");
		Thread t3 = new Thread(dt, "Thread3");
		
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
