/*
 * * * * *
 * NOTES *
 * * * * * 
 * Comparison operators can be used to check numerical values
 * Comparisons operators are:
 *     >   - Greater Than
 *     >=  - Greater Than Or Equal To
 *     <   - Less Than
 *     <=  - Less Than Or Equal To
 *     ==  - Equals
 *     !=  - Not Equal To
 * Comparison statements resolve down to a boolean statement; a
 *     true or false value
 */

// If Statements & Comparisons
package mikeDaneJavaTutorial;

public class Tutorial16Comparisons {

	public static void main(String[] args) {
	
		// Prints the last number, 5
		System.out.println(max(3,4,5));
		
		// Prints the second number, 40
		System.out.println(max(3,40,5));
		
		// Prints the third number, 300
		System.out.println(max(300,40,5));
	}
	
	/**
	 * Calculates the maximum value of three numbers
	 * 
	 * This function takes three integers as arguments
	 * and calculates the greatest number of the three.
	 * It does this by using comparison operators and 
	 * If-Statements to check which number is greater.
	 * 
	 * @param num1 Any number given/passed as an argument
	 * @param num2 Any number given/passed as an argument
	 * @param num3 Any number given/passed as an argument
	 * @return The max of the three numbers
	 */
	public static int max(int num1, int num2, int num3) {
		
		if (num1 >= num2 && num1 >= num3) {
			// If num1 is greater than both num2 and num3, then:
			return num1; // return num1
		} else if (num2 >= num1 && num2 >= num3) {
			// If num2 is greater than both num1 and num3, then:
			return num2; // return num2
		} else { // If both num1 and num2 are not greater than num3, then:
			return num3; // return num3
		}
	}
}