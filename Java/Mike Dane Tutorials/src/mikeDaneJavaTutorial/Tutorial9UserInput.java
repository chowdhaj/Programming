/*
 * * * * *
 * NOTES *
 * * * * * 
 * A Scanner is used to get user input
 * The Scanner class is imported:
 *     import java.util.Scanner;
 * Remember to close the scanner after you're
 *     done using it
 */

// GETTING USER INPUT //
package mikeDaneJavaTutorial;

import java.util.Scanner;

public class Tutorial9UserInput {
	
	public static void main(String[] args) {
		
		// Create a Scanner called 'input'
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Name: "); // Prompt user for input - name
		
		// Stores user input into a String 
		String name = input.nextLine();
		System.out.print("Enter Your Age: "); // Prompts user for input - age
		
		// Stores input into an int
		int age = input.nextInt();
		System.out.println("\nYo, " + name + "!"); // Prints user's name
		System.out.println("You are " + age  + " years old"); // Prints user's age
		
		input.close(); // Closes the scanner
		// This prevents memory leaks
	}
}
