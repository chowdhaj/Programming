package threads;

public class ThreadImp {
	
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new ThreadOne());
		//t1.run(); // t1.start()
		//t1.join();
		
		// Remember to add throws - because of "join()". But why?
		
		// TODO: Create and run ThreadTwo
		Thread t2 = new Thread(new ThreadTwo());
		//t2.start();
		//t2.join();
		
		// TODO: "start()" VS. "run()"
		
		/*
		 * Questions:
		 *   What if "start()" is removed?
		 *   What does "join()" do? What if "join()" is removed?
		 */
		
		t1.run();
		t2.run();
		t1.join();
		t2.join();
        
		System.out.printf("The counter is: %d", counter);
		
	}
	
	public static class ThreadTwo implements Runnable {

		@Override
		public void run() {
			System.out.println("I am ThreadTwo");
			System.out.println(ThreadTwo.class.getName());	
			
			for (int i = 0; i < 50000; i++) {
				counter++;
			}
		}
	}
	
	public static class ThreadOne implements Runnable {

		@Override
		public void run() {
			System.out.println("I am ThreadOne");
			for (int i = 0; i < 50000; i++) {
				counter++;
			}
		}
	}
}
