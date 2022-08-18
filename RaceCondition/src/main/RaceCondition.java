package main;

import java.util.concurrent.Semaphore;

public class RaceCondition {
	
	public static int counter = 0;
	
	public static final int BIG = 50000; // WHAT IF I MADE THIS SMALL?
									     // 50,000 VS. 50
	
	static Semaphore sema = new Semaphore(1); // sema = 1
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Counter is: " + counter); // 1. GUESS: 
		
		Thread t1 = new Thread(() -> {
			
			try {
				sema.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < BIG; i++) {
				counter++;
			}
			sema.release();
		});
		
		Thread t2 = new Thread(() -> {
			
			try {
				sema.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < BIG; i++) {
				counter++;
			}
			sema.release();
		});
	
		t1.start(); // WHAT DOES THIS DO?
		t2.start();
		
		t1.join();  // WHAT HAPPENS IF I REMOVE THIS?
		t2.join();
				
		System.out.println("Counter is: " + counter); // 2. GUESS: 
		
	}
}

		// Is this a problem?
		// How to solve?
		// Hint:
		// import java.util.concurrent.Semaphore;
		// static Semaphore s = new Semaphore(1);
	 	// s.acquire(); s.release();
