/*
 * * * * *
 * NOTES *
 * * * * * 
 * While loops allow us to execute a block of code, multiple times
 * A while loop is continuously executed until the condition is false
 * You can quickly add one to a variable using the following notation:
 *     i++; - Adds 1 to 'i'
 *     i--; - Subtracts 1 from 'i'
 * The condition must be true for the block of code to be executed
 * The condition is checked before any line of code is executed
 * 
 * Java also has 'Do While' Loops
 * In a do while loop, the condition is checked AFTER the block of code
 *     is executed
 */

// While Loops
package mikeDaneJavaTutorial;

public class Tutorial19WhileLoops {
	
	public static void main(String[] args) {
		
		// Creates a counter
		int i = 1;
		
		// While 'i' is less than or equal to 10
		while (i <= 10) {
			System.out.println(i); // Print the value of 'i'
			i++; // Increment 'i' by one
		}
		
		// Print a newline
		System.out.println();
		
		// Do while loop
		do {
			System.out.println(i); // Print the value of 'i'
			i++; // Increment 'i' by one
		} while (i <= 10); // Checks condition
		/* 
		 * In a do while loop, the condition is checked at the end
		 * So, the code will always execute AT LEAST once
		 */
	}
}