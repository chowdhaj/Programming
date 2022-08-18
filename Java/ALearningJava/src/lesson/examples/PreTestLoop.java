package lesson.examples;

import java.util.Random;
import java.util.Scanner;

public class PreTestLoop {

    public static void main(String[] args) {
    	
        /* Guess a number between 1 and 10! [Pre-Test Loop Edition]
         * Pre-Test loops are not guaranteed to execute at all
         */
        
    	Scanner input = new Scanner(System.in); // Instantiates the Scanner
        Random generator = new Random(); // Instantiates the Random
        int number = generator.nextInt(10) +1; // An int called 'number' gets a pseudo random value from 1 - 10
        int guess = 0; // An int named 'guess' gets 0
        int attempt = 1; // An int called 'attempt' gets 1
        System.out.println("I'm thinking of a number between 1 and 10. What is it?!?!?"); // Prints text to console
        
        while (guess != number) { // While 'guess' is NOT equal to 'number' do the following:
            System.out.printf("Attempt %d : Your Guess ==> ",attempt); // Print's attempt number to console
            guess = input.nextInt(); // Input from user to assigned to 'guess'
            attempt++; // The int 'attempt' gets incremented by 1
        }
        System.out.printf("Finally! You guessed it. It was %d.\n",guess); // Prints out text to console
    }
}
