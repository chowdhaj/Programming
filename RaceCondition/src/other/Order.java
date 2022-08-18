package other;

public class Order {
		
	public static final int HUGE = 50000; 
	
	public static void main(String[] args) throws InterruptedException {
				
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < HUGE; i++) {
				System.out.print("1");
			}
		});
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < HUGE; i++) {
				System.out.print("2");
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();		
		
	}
}

		// Is this a problem?
		// How to solve?
		// Hint:
		// import java.util.concurrent.Semaphore;
		// static Semaphore s = new Semaphore(1);
	 	// s.acquire(); s.release();

/*

	// Next time, on DBZ...
	public static class IncrementCounter implements Runnable {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("#" + counter);
				counter++;
			}	
		}	
		
	}

*/