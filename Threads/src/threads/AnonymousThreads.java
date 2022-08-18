package threads;

public class AnonymousThreads {
	
	private static int counter = 0;
	private static final int MAX = 50000;
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread threadName1 = new Thread(() -> {
			for (int i = 0; i < MAX; i++) {
				counter++;
			}
		});
		
		//System.out.printf("The value of counter is: %d", counter);
		
		// TODO: Another thread to increment counter
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < MAX; i++) {
				counter++;
			}
		});
		
		threadName1.run();
		
		t2.start();
		
		//threadName1.join();
		
		//t2.join();
		
		System.out.printf("\nThe value of counter is: %d", counter);
		
	}

}
