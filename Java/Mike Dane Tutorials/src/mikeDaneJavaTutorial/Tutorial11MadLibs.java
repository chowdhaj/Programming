/*
 * * * * *
 * NOTES *
 * * * * *
 * 'println' adds a newline
 * 'print' does not add a newline
 * 'ln' stands for line
 */

// MAD LIBS GAME //
package mikeDaneJavaTutorial;

import java.util.Scanner;

public class Tutorial11MadLibs {
	
	public static void main(String[] args) {
	
		// Create a scanner called 'input'
		Scanner input = new Scanner(System.in);
		
		// Ask user for input and store response into 'color'
		System.out.print("Enter a color: ");
		String color = input.next();
		
		// Ask for a plural noun and store response into 'pluralNoun'
		System.out.print("Enter a plural noun: ");
		String pluralNoun = input.next();
		
		// Ask for celebrity and store input into 'celebrity'
		System.out.print("Enter a celebrity: ");
		String celebrity = input.next();
		
		// Print out madlibs story with user responses
		System.out.println("Roses are " + color + "\n" 
		                 + pluralNoun + " are blue \n" 
		                 + "I love " + celebrity);
		
		input.close(); // Closes the scanner
		// This prevents memory leaks
	}
}
