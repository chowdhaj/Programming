/*
 * * * * *
 * NOTES *
 * * * * * 
 * This calculator takes 3 inputs from the user:
 *     1. First number
 *     2. Mathematical operator
 *     3. Second number
 * Then, it performs the calculation and returns
 *     the answer to the user
 */

// Building A Better Calculator
package mikeDaneJavaTutorial;

import java.util.Scanner;

public class Tutorial17BetterCalculator {
	
	public static void main(String[] args) {
		
		// Creates a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompts user for a number
		System.out.print("Enter A Number: ");
		
		// Stores user input as a double
		double num1 = input.nextDouble();
		
		// Prompts user for an operator
		System.out.print("Enter An Operator: ");
		
		/*
		 *  Stores the first character of user input. If
		 *  the user enters in "+asdf", then input.next()
		 *  only returns the "+"
		 */
		String operator = input.next();
		
		// Prompts user for another number
		System.out.print("Enter Another Number: ");
		
		// Stores user input as a double
		double num2 = input.nextDouble();
		
		// Prints out the mathematical statement (i.e. "3 + 4 = ")
		System.out.print(num1 + " " + operator + " " + num2 + " = ");
		
		/*
		 * If-Else-If ladder determines what math operator to use based on
		 * the variable 'operator'. It checks it using the equals function
		 * that is available in the String library
		 */
		if (operator.equals("+")) {
			// If operator equals "+" then add the two numbers
			System.out.println(num1 + num2);
		} else if (operator.equals("-")) {
			// If operator equals "-" then subtract the two numbers
			System.out.println(num1 - num2);
		} else if (operator.equals("*") || operator.equalsIgnoreCase("x")) {
			// If operator equals "*" or "x" then multiply the two numbers
			System.out.println(num1 * num2);
		} else if (operator.equals("/")) {
			// If operator equals "/" then divide the two numbers
			System.out.println(num1 / num2);
		} else if (operator.equals("%")) {
			// If operator equals "%" then compute the modulus
			System.out.println(num1 % num2);
		} else {
			// Anything else is invalid 
			System.out.println("Invalid Operator");
		}
		
		// Close the scanner to prevent memory leaks
		input.close();
	}
}