/*
 * DEBUG THIS! Exercise
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will generate a random number between 1 and 5 then as you to
 * "guess" the number. It will tell you if you're right or not.
 *
 * Examples:    Pick a number between 1 and 5 : 4
 *              You guessed it!
 * 
 *              Pick a number between 1 and 5 : 4
 *              So close it was 2.
 */

package lesson.activities;

import java.util.Random; // The random class was missing
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) { // Missing bracket at the end of 'args'
        int number, guess;
        Scanner input = new Scanner(System.in);
        Random generator = new Random(); // Missing 'new' and 'r' in random must be UPPERCASE
        number = generator.nextInt(5); // Changed 'nextInteger(5)' to 'nextInt(5)' // 'nextInteger' is not a method in the random class
        System.out.print("Pick a number between 1 and 5: "); // Missing a semicolon at the end of the line // 's' in system must be CAPITALIZED
        guess = input.nextInt();
        String result = guess == number ? "You guessed it!\n" : "So close it was %d\n"; // 's' in string must be CAPITALIZED
        System.out.printf(result,number); // Missing semicolon at the end of statement
    }
}


/*

			ORIGINAL CODE

package lesson.activities;

import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args {
        int number, guess;
        Scanner input = new Scanner(System.in);
        Random generator = random();
        number = generator.nextInteger(5);
        system.out.print("Pick a number between 1 and 5 : ")
        guess = input.nextInt();
        string result = guess == number ? "You guessed it!\n" : "So close it was %d\n";
        System.out.printf(result,number)
    }
}

*/