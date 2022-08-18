/*
 * * * * *
 * NOTES *
 * * * * * 
 * The Math library already has an exponent method:
 *     Math.pow(2, 3); // returns 2 ^ 3 = 8
 * The method below only works with positive exponents
 */

// Building An Exponent Method
package mikeDaneJavaTutorial;

public class Tutorial22ExponentMethod {

	public static void main(String[] args) {
	
		/*
		 * Calculates 2 to the power of 3 using the pow 
		 *     function in the Math library
		 */
		System.out.println(Math.pow(2, 3));
		
		// Calculates 2 to the power of 3 using the 'powerOf' function
		System.out.println(powerOf(2, 3));
	}
	
	/**
	 * Calculates the exponent of a number
	 * 
	 * @param base The base of the number
	 * @param exponent The exponent; the base will be raised to this power
	 * @return The final answer, where base ^ exponent
	 */
	public static double powerOf (double base, double exponent) {
		
		double result = 1; // Stores the final answer
		// While the counter is less than the exponent
		for (int i = 0; i < exponent; i++) {
			// Multiply result by base
			result = result * base;
		}
		return result; // Return result
	}
}
