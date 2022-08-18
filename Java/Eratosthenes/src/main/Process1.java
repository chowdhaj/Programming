/**
 * 
 */
package main;

/**
 * @author chowdhaj
 *
 */
public class Process1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;
		System.out.print("Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		SieveOfEratosthenes g = new SieveOfEratosthenes();
		g.sieveOfEratosthenes(n);

	}

}
