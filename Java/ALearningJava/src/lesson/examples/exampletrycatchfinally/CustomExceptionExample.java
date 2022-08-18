package lesson.examples.exampletrycatchfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionExample {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in); // Instantiates the Scaner
    	int i; // Creates an int named 'i'
    	System.out.print("Enter an integer between 1 and 10: "); // Prints text to console
    	
    	try {
    		i = input.nextInt(); // This is where the exception might occur
    		if (i < 1 || i > 10) throw new IntegerOutOfRangeException(); // If 'i' is less than 1 or greater than 10 then throw an exception
    	} catch ( InputMismatchException ex ) { // This exception is if the user inputs a different variable type
    		System.out.println("You didn't enter an Integer."); // Prints text to console
    	} catch (IntegerOutOfRangeException ex ) { // This is if 'i' is not in between 1 and 10
    		System.out.println("Your input value is not in the specified range"); // Prints text to console
    	}  
    }
}

