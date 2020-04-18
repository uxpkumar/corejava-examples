
public class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside Runnable interface");
	}
	
	public static void main(String[] args) {
		ThreadRunnable tr = new ThreadRunnable();
		Thread t = new Thread(tr);
		t.start();	
	}

}

