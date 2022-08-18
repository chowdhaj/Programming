import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Reimplements the algorithm for calculating primes using the Sieve
 * of Eratosthenes, but leaves the fault from before in place. This
 * causes new issues like false positives, where a number that is not
 * a prime is added to the list of primes.
 * 
 * The only change made to this lies in the for-loop. The condition
 * in the for loop, ``divisor <= number`` is changed to
 * ``(divisor * divisor) <= number`` to satisfy the Sieve of
 * Eratosthenes algorithm.
 * 
 * @author  hutchm6
 * @author  chowdhaj
 * @course  SFWRENG 3S03
 * @version 1.1
 * @date    March 11th, 2022
 */
public class PrimeNumbersEratosthenes implements Iterable<Integer> {

	private List<Integer> primes = new ArrayList<Integer>();

	public void computePrimes(int n) {

		int count = 1; // count of primes
		int number = 2; // number tested for primeness
		boolean isPrime; // is this number a prime
		
		while (count <= n) {
			
			isPrime = true;
			
			// NOTE: This is where the change is; it is the only change
			for (int divisor = 2; (divisor * divisor) <= number / 2;
				 divisor++) {
												
				if (number % divisor == 0) {
					isPrime = false;
					break; // for loop
				}
			}
			
			if (isPrime && (number % 10 != 9)) { // FAULT
				primes.add(number);
				count++;
			}
			
			number++;
		}
	}

	/**
	 * Overrides the ``iterator()`` method
	 */
	@Override
	public Iterator<Integer> iterator() {
		return primes.iterator();
	}

	/**
	 * Overrides the ``toString()`` method to print all primes in the
	 * List<Integer>
	 */
	@Override
	public String toString() {
		return primes.toString();
	}
}
	
/*

---------------
DEPRECATED CODE
---------------	

// NOTE: At the last minute I realized I did not need to over-
//       complicate the solution for "Sieve of Eratosthenes".
//       Shout-out to the TAs for their help!
//
//	boolean isPrime[] = new boolean[n]; // is this number a prime
//		Arrays.fill(isPrime, true);
//
//		for (int divisor = 2; divisor * divisor <= n; divisor++) {
//
//			if (isPrime[divisor]) {
//				for (int j = divisor; j * divisor < n; j++) {
//					isPrime[j * divisor] = false;
//				}
//
//			}
//
//			if (isPrime[divisor] && (divisor % 10 != 9)) { // FAULT
//				primes.add(divisor);
//				count++;
//			}
//		}
//	}
 
*/