/*
 * * * * *
 * NOTES *
 * * * * * 
 * If Statements allow programs to make decisions and respond to
 *     different situations
 * Operators allow you to check multiple conditions in your
 *     if statement. For example:
 *         AND (&&) - Both conditions must be true
 *         OR  (||) - Only one condition has to be true
 *         NOT (!)  - Negates/flips the condition
 * The conditions in if statements must be boolean values, directly
 *     or indirectly
 * Comparisons and comparison operators can be used. For example:
 *     if 3 is equal to 5, then...
 */

// If Statements
package mikeDaneJavaTutorial;

public class Tutorial15IfStatements {

	public static void main(String[] args) {
		
		// Create boolean variable called 'isMale'
		boolean isMale = true;
		
		// if 'isMale' is true, then:
		if (isMale) {
			// Print you are a male
			System.out.println("You are a male");
		} else { // Otherwise
			// Print you are not a male
			System.out.println("You are not a male");
		}
		
		// Create boolean variable called 'isTall'
		boolean isTall = true;
		
		// If 'isMale' and 'isTall' are true, then:
		if (isMale || isTall) { 
			// Print statement
			System.out.println("You are either tall or a male, or both");
		} else {
			// Otherwise, print this statement
			System.out.println("You are not a male, and you are not tall");
		}
		
		/*
		 * This If-Statement structure covers all possible cases
		 * with the boolean variables 'isMale' and 'isTall' 
		 */
		if (isMale && isTall) {
			// Prints if both boolean are true
			System.out.println("You are a tall male");
		} else if (isMale && !(isTall)) {
			// Prints if only 'isMale' is true
			System.out.println("You are a male, but you are not tall");
		} else if (!(isMale) && isTall) {
			// Prints if only 'isTall' is true
			System.out.println("You are tall, but you are not a male");
		} else {
			// If both booleans are false, print this
			System.out.println("You are not tall, nor are you a male");
		}
	}
}