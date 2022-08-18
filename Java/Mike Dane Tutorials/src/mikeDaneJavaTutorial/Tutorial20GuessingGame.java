/*
 * * * * *
 * NOTES *
 * * * * * 
 * Remember to close the scanner after you are done using it. 
 *     For example: input.close();
 */

// Building A Guessing Game
package mikeDaneJavaTutorial;

import java.util.Scanner;

public class Tutorial20GuessingGame {
	
	public static void main(String[] args) {
	
		// Creates a scanner object
		Scanner input = new Scanner(System.in);
		
		// String variables
		String secretWord = "java";
		String guessWord = "";
		
		// Integer variables
		int guessCounter = 0;
		int guessLimit = 10;
		
		// Boolean variable
		boolean outOfGuesses = false;
		
		// While 'guessWord' does not equal secretWord' and user has guesses
		while(!(guessWord.equals(secretWord)) && !(outOfGuesses)) {
			
			// If user still has guesses left, then:
			if (guessCounter < guessLimit) {
				// Prompt user to guess the secret word
				System.out.print("Guess my secret word\n" + 
			                     "You have " + (guessLimit - guessCounter) + 
			                     " tries remaining\n" + 
			                     "> ");
				guessWord = input.nextLine(); // Store input 
				guessCounter++; // Increase guess counter
				System.out.println(); // Print new line
			} else {
				// If user is out of guesses, set 'outOfGuesses' to true
				outOfGuesses = true;
			}
		} // End of while loop
		
		// If user is out of guesses
		if (outOfGuesses) {
			// Print you lose
			System.out.println("You Lose! No more guesses :(");
		} else {
			// Otherwise user wins
			System.out.println("Nice! You got it right :)");
		}	
		
		input.close(); // Close scanner to prevent memory leaks
	}
}