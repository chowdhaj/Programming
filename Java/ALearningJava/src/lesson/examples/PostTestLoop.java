/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lesson.examples; // Location of our class file

import java.util.Random; // Imports the Random class
import java.util.Scanner; // Imports the Scanner class

public class PostTestLoop {

    public static void main(String[] args) {
    	
        /* Guess a number between 1 and 10! [Post-Test Loop Edition]
         * Post-Test loops will execute at least ONE TIME because the condition is tested at the end
         * Useful for "sanitizing input" because the user MUST input something
         */
    	
    	Scanner input = new Scanner(System.in); // Instantiates the Scanner
        Random generator = new Random(); // Instantiates the Random
        int number = generator.nextInt(10) +1; // An int called 'number' gets a pseudo random value from 1 - 10
        int guess = 0; // An int named 'guess' gets 0
        int attempt = 1; // An int called 'attempt' gets 1
        System.out.println("I'm thinking of a number between 1 and 10. What is it?!?!?"); // Prints text to console
    	
        do { // Starts the 'do-while' loop
            System.out.printf("Attempt %d : Your Guess ==> ",attempt); // Prints out user's attempt number to console
            guess = input.nextInt(); // User's attempt gets assigned to 'guess'
            attempt++; // Increments 'attempt' by 1
        } while (guess != number); // Checks the condition: if 'guess' is NOT equal to 'number'
        System.out.printf("Finally! You guessed it. It was %d.\n",guess); // Prints text to console
    }
}
