/*
 * * * * *
 * NOTES *
 * * * * * 
 * For Loop is a special type of loop
 * For Loops are special because they have indexing variables
 * Indexing variables keep track of the number of iterations
 * For Loops simplify the structure of loops by allowing you to
 *     initialize variables and increment them in the same line
 * For Loops are commonly used to print Arrays
 */

// For Loops 
package mikeDaneJavaTutorial;

public class Tutorial21ForLoops {
	
	public static void main(String[] args) {
	
		// Prints numbers from 0 to 10 using while loop
		whileLoop();
		System.out.println(); // Prints new line
		
		// Prints numbers from 0 to 10 using for loop
		forLoop();
		System.out.println(); // Prints new line
		
		// Creates a string of character names
		String suitsCharacters[] = {"Harvey", "Mike", "Louis", 
				                    "Donna", "Rachel", "Sheila"};
		
		// Prints items in a String
		printArrayForLoop(suitsCharacters);	
	}
	
	/**
	 * Prints numbers from 0 to 10 using a While Loop
	 */
	public static void whileLoop() {
		int i = 0; // Create counter
		while (i <= 10) { // While counter is less than or equal to 11
			System.out.println(i); // Print counter
			i++; // Increment counter by one
		}
	}
	
	/**
	 * Prints numbers from 0 to 10 using a For Loop
	 */
	public static void forLoop() {
		
		/*
		 * For Loops are special because they create the counter, and
		 *     increment it in the same line. For Loops can be divided 
		 *     into three parts: Initialization, Condition, & Increment.
		 *     
         * Initialization : int i = 0;
         * Condition      : i <= 10;
         * Increment      : i++
		 */
		for (int i = 0; i <= 10; i++) {
			System.out.println(i); // Print 'i'
		}
	}
	
	/**
	 * Iterates through a String array and prints each element
	 * 
	 * @param arr The String array to iterate through and print
	 */
	public static void printArrayForLoop(String[] arr) {
		
		/*
		 * The counter 'i' is created and given an intial value of 0
		 * Loop while 'i' is less than the size of the array, 'arr'
		 * Increase 'i' by one on each iteration
		 */
		for (int i = 0; i < arr.length; i++) {
			// Print the 'i' element in String array
			System.out.println(arr[i]); 
		}
	}
}