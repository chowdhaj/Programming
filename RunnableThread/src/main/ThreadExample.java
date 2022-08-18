/**
 * DON'T WORRY ABOUT THE CODE
 * FOCUS ON OUTPUT 
 */
package main;

/**
 * @author chowdhaj
 *
 */
public class ThreadExample implements Runnable {
	
	static int x = 10;
		
	public void run() {
		System.out.printf("1. This is a thread, x = %d\n", x);
		//int myvar = 5;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		(new Thread(new ThreadTwo())).start();
		
		(new Thread(new ThreadTwo())).start();
		
		(new Thread(new ThreadExample())).start();
		
		
		System.out.printf("0. I am main method, x = %d\n", x);
	}
	
	public static class ThreadTwo implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			System.out.printf("2. I am the second thread, x = %d\n", x);
			//myvar++;
		}
		
	}

}
