/*
 * * * * *
 * NOTES *
 * * * * * 
 * Nested Loops are a special structure with a loop inside of a loop
 * In a 2D array, every single element is an array. 2D arrays are 
 *     used to represent matrix structures and grids
 * Remember: Indexing for arrays start at zero
 */

// Nested Loops & 2D Arrays
package mikeDaneJavaTutorial;

public class Tutorial23NestedLoops {
	
	public static void main(String[] args) {
		
		// Example of two For Loops
		for (int i = 1; i < 3; i++) { // Iterate from 1 to 3
			for (int j = 1; j < 4; j++) { // Iterate from 1 to 4
				// Print the values of 'i' and 'j'
				System.out.println("i = " + i + " | " + 
						           "j = " + j);
			}
		}
		
		System.out.println(""); // Print new line
		
		// Initializes a 2D array of numbers
		int numberGrid[][] = {
				{1, 2, 3}, // Array at 0 index
				{4, 5, 6}, // Array at 1st index
				{7, 8, 9}, // 2nd index
				{0}        // 3rd index
		};
		
		// Iterates through the set of arrays
		for (int i = 0; i < numberGrid.length; i++) {
			// Iterates through each array in the set of arrays
			for (int j = 0; j < numberGrid[i].length; j++) {
				// Print the value at 'i' and 'j' in the 2D array
				System.out.print(numberGrid[i][j] + ", ");
			}
			// Print new line after 2nd loop is done
			System.out.println();
		}	
	}
}
