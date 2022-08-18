package threads;

public class ThreadExt {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadOne t1 = new ThreadOne();
		t1.run();
		t1.join();
		
		// TODO: Create ThreadTwo, then instantiate it.
		
		ThreadTwo t2 = new ThreadTwo();
		
		// TODO: How to start/run thread? [start() OR run()]
		t2.run();
		System.out.println("Main has completed!");
		//t2.start();
				
		// TODO: How to finish thread? (join())
		t2.join();
				
		/*
		 * Questions:
		 *   Why do we need a throws declaration?
		 *   What if "start()" is removed?
		 *   What does "join()" do? What if "join()" is removed?
		 */
	}
	
	/**
	 * ThreadTwo
	 */
	public static class ThreadTwo extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am ThreadTwo");
			}
				
		}
	}
	
	/** 
	 * ThreadOne
	 */
	public static class ThreadOne extends Thread {

		@Override
		public void run() {
			System.out.println("I am ThreadOne");
		}
	}
}
