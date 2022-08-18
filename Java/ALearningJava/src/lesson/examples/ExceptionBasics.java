package lesson.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasics {

    public static void main(String[] args) {
    	
       int i = 0; // Creates an int called 'i'
       boolean userFailedToEnterInput = true;
       while (userFailedToEnterInput) {
       		try {    
       			Scanner input = new Scanner(System.in); // Instantiates the Scanner
        	   	System.out.print("Enter an integer: "); // Asks user to enter an integer
       			i = input.nextInt(); // This is where the exception can occur because the user might enter a String when asked for an integer
       			userFailedToEnterInput = false; // This will break out of the loop when the user enters an integer
       		} catch ( InputMismatchException ex ) { // Catches the InputMismatchException
       			System.out.println("You didn't enter an Integer."); // Prints text to console
       		} finally { // This line executes no matter what
       			System.out.println("This happens whether the exception occurs or not"); // Prints text to console
       		} 
       	}
       
       System.out.printf("You entered %d", i); // Prints out the number the user entered to console
    }
}
