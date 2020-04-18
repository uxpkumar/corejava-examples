package ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorMain {
	 public static void main(String args[]) {
	  // Getting instance of ThreadPoolExecutor using  Executors.newFixedThreadPool factory method
	  ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
	  ThreadPoolExecutor threadPoolExecutor1 = (ThreadPoolExecutor) Executors.newCachedThreadPool();

	  for (int i = 0; i < 10; i++) {
	   FetchDataFromFile fdff = new FetchDataFromFile("File " + i);
	   System.out.println("A new file has been added to read : " + fdff.getFileName());
	   // Submitting task to executor
	   threadPoolExecutor1.execute(fdff);
	  }
	  threadPoolExecutor1.shutdown();
	 }
	}
	 