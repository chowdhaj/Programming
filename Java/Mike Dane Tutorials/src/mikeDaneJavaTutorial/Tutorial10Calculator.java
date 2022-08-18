/*
 * * * * *
 * NOTES *
 * * * * *
 * Bad input causes the program to crash
 */

// BUILDING A BASIC CALCULATOR // 
package mikeDaneJavaTutorial;

import java.util.Scanner;

public class Tutorial10Calculator {

	public static void main(String[] args) {
		
		// Creates a Scanner called 'input'
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in first number: "); // Prompts for input
		double num1 = input.nextDouble(); // Stores number
		System.out.print("Enter in second number: "); // Prompts for input
		double num2 = input.nextDouble(); // Stores number
		System.out.println(num1 + num2); // Adds both numbers and prints result
		
		input.close(); // Closes the scanner
		// This prevents memory leaks
	}
}
