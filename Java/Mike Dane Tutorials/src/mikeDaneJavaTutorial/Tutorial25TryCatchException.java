/*
 * * * * *
 * NOTES *
 * * * * * 
 * Try-Catch statements are used to handle errors, instead of
 *     exiting the program
 * Exceptions cause programs to terminate
 * An Exception is a special type of class/object
 * There are different types of Exceptions and they can be caught
 * You can specify what type of Exception you want to catch and deal
 *     with it differently
 * Some Exceptions need to be imported before they can be used
 * In addition to Exceptions, you can also catch Errors
 * Errors are more serious than Exceptions
 * The keyword 'Throwable' catches both Errors and Exceptions
 * The Java documentation does not recommend programmers to catch errors
 */

// Try, Catch & Exceptions
package mikeDaneJavaTutorial;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Tutorial25TryCatchException {

	public static void main(String[] args) {
		
		// Creates a Scanner object
		Scanner keyboardInput = new Scanner (System.in);
		
		// Prompts user
		System.out.print("Enter A Number: ");
		
		// Try catch block to handle invalid input
		try {
			// Stores keyboard input into a double
			double num = keyboardInput.nextDouble();
			System.out.println(num); // Prints value
		} catch (InputMismatchException e) { // Exception
			System.out.println("Invalid Input");
		}
		
		// Closes Scanner to prevent memory leaks
		keyboardInput.close();
		
		// Creates an array of integers
		int num[] = {1, 2, 3};
		
		// Try catch block
		try {
			// Prints out 5th element in array
			System.out.println(num[5]);
		} catch (ArrayIndexOutOfBoundsException e) { // Exception
			System.out.println(e); // Print Exception
		} catch (Exception e) { // General Exception
			e.printStackTrace(); // Print more details on Exception 
		}
		
		// Try catch block that handles errors and exceptions
		try {
			// Print 5th element in array
			System.out.println(num[5]);
		} catch(Throwable e) { // Handles errors and exceptions
			e.printStackTrace(); // Print more details on what went wrong
		}
	}
}