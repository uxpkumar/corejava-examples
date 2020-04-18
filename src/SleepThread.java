
public class SleepThread implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread starts");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After Sleep");
	}

	public static void main(String[] args) {
		SleepThread st = new SleepThread();
		
		Thread t1 = new Thread(st);
		t1.start();
		
	}
}
