package lesson.examples; // Location of our class

import java.util.Random; // Imports the Random class
import java.util.Scanner; // Imports the Scanner class

public class MidTestLoop {

    public static void main(String[] args) {
    	
        /* Guess a number between 1 and 10! [Mid-Test Loop Edition]
         * Mid-Test loops are the most flexible but with great power comes great 
         * responsibility YOU must determine when the loop should complete.
         */
    	
        Scanner input = new Scanner(System.in); // Instantiates the Scanner
        Random generator = new Random(); // Instantiates the Random
        int number = generator.nextInt(10) +1; // An int called 'number' gets a pseudo random value from 1 - 10
        int guess = 0; // An int named 'guess' gets 0
        int attempt = 1; // An int called 'attempt' gets 1
        System.out.println("I'm thinking of a number between 1 and 10. What is it?!?!?"); // Prints text to console
        
        while(true) { // The while loop // This is an infinite loop because true will always be true, hence the loop will always run
             System.out.printf("Attempt %d : Your Guess ==> ",attempt); // Prints text to console // Prints the user's attempt number to console
             guess = input.nextInt(); // The number guessed by the user gets assigned to int 'guess'
             attempt++; // Increments the variable 'attempt' by 1
             if ( guess > 10 || guess < 1) { // If 'guess' is greater than 10 OR less than 1, then: 
               System.out.printf("Come on! That's not between 1 and 10!\n"); // Prints text to console
             } else if (guess != number ) { // Else if 'guess' is NOT equal to 'number' then: 
                 System.out.printf("Nope. That's not it!\n"); // Prints text to console
             } else  { // Else (if 'guess' is between 1 and 10 AND is equal to 'number' then:)
                 System.out.printf("Finally! You guessed it. It was %d.\n",guess); // Prints text to console
                 break; // This exists the loop
             }
         }
    }
}
