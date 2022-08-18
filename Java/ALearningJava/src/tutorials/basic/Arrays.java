package tutorials.basic;

public class Arrays {
	public static void main(String[] args) {
		
		/*/
		 * An array is a data structure
		 * Data is stored in variables that we can use. Examples include 'int x, int y, person John', etc. A data structure is ...
		 * ... a way to organize/structure the data in a particular way to efficiently solve problems. One way to organize data ...
		 * ... is to use an array. An array consists of multiple data of a singular type (i.e. double, string, objects  etc.).  An array ...
		 * ...  an object, and has a list of methods you can call on that object
		/*/
		
		int x; // Creates one "box" in memory that stores one integer value
		int[] myArray; // Declaring an array named 'myArray' that will store 'ints'
		myArray = new int[4]; // Initializing our array to be capable of holding 4 'ints' (4 'boxes' in memory)
		
		x = 5; // Sets the value of 'x' to 5
		myArray[0] = x; // Sets 'x' as the ZERO'TH element in the array (x = 5)
		myArray[1] = 3; // Sets '3' as the FIRST element in the array
		myArray[2] = 0; // Sets '0' as the SECOND element in the array
		myArray[3] = 1; // Sets '1' as the THIRD element in the array
		
		// Trying to access a 'box' that is not in our array will cause an exception and the program will crash
		//myArray[4] = 0; // Exception: ArrayIndexOutOfBoundsException
		
		System.out.println(myArray[0]); // Prints the FIRST 'box' in the array. The FIRST box holds a value of 'x' (x = 5)
		
		// Using a for loop to iterate over an array
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]); // Prints out the contents of 'myArray'
		}
		
		// This is an enhanced for loop designed to iterate over a collection/array
		for (int number:myArray) {
			System.out.println(number); // Prints out the contents of 'myArray'
		}
		
		int newArray[] = new int[50000]; // Initializing an array of 'ints' named 'newArray' to be capable of holding 50000 'ints'
		
		// Using a for loop to store 'ints' from 0 to 49999 in 'newArray'
		for (int y = 0; y < 50000; y++) {
			newArray[y] = y; // Explained below >.>
			
			/*/
			 * Position [0] of array holds a value of 0
			 * Position [1] of array holds a value of 1 
			 * Position [10] of array holds a value of 10
			 * 						...
			 * Position [10000] of array holds a value of 10000
			 * 						...
			 * Position [40000] of array holds a value of 40000
			 * 						...
			 * Position [49999] of array holds a value of 49999
			 * 
			/*/
		}
		
		// This is an enhanced for loop used to print the contents of 'newArray'
		for (int counter:newArray) {
			System.out.println(counter);
		}
		
		// This is another way of declaring and initializing arrays
		int xArray [] = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Using an enhanced for loop to output the contents of 'xArray' to console
		for (int xy:xArray) {
			System.out.println(xy);
		}
	}
}
