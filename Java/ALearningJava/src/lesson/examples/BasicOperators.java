package lesson.examples; // Class is found in package 'lessons', and 'lessons' is inside package 'examples'

import java.util.Scanner; // Imports the Scanner class from the Java library

public class BasicOperators {

	// This is the main method and is first to execute because Java always looks for the main method
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); // Initializes and declares our Scanner, giving it a name of 'input'
        int x,y, result; // Declares and initializes three variables of type int, named 'x', 'y', and 'result', respectively
        
        System.out.print("Enter value for X : "); // Asks the user to input a number
        x = input.nextInt(); // Assigns 'x' whatever number the user inputs
        
        System.out.print("Enter value for Y : "); // Asks user to input a value for 'Y'
        y = input.nextInt(); // Assigns 'y' to number input by user
        
        result = x + y; // Result gets 'x' plus 'y'
        System.out.printf(" X + Y = %d\n", result ); // Prints out the result to console
        
        result = x - y; // Result gets 'x' minus 'y'
        System.out.printf(" X - Y = %d\n", result ); // Prints out the result to console
        
        result = x * y; // Result gets 'x' times 'y'
        System.out.printf(" X * Y = %d\n", result ); // Prints out the result to console
        
        result = x / y; // Result gets 'x' divided by 'y'
        System.out.printf(" X / Y = %d\n", result ); // Prints out the result to console
        
        result = x % y; // Result gets 'x' mod 'y'
        String mod = "%";
        System.out.printf(" X %s Y = %d\n", mod, result ); // Prints out the result to console
        
        // Notice how you cannot write X % Y, and are forced to write X Mod Y OR X %s Y and have another argument at the end. To get by this you can do these:
        //System.out.println(" X % Y = " + result); // This outputs the result as: X % Y = , similar to X %s Y
        //System.out.printf(" X %% Y = %d\n", result ); // When you want to print '%' to console, use two of them back-to-back like this: '%%'

    }
}

// \n goes to the next line, similar to 'println'
// %s = String, %d = int, %f = double
// Avoid creating many variables as it takes up space in memory and can eventually slow down the PC. Notice how we used 'result' over and over again. In this entire program we used 3 variables, as opposed to 7