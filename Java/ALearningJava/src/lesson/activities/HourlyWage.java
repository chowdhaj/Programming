/** Challenge Activity 1 - Hourly Wage
 * 
 * Write a program which does the following
 * 
 *  Asks you to enter your hourly wage (double value)
 *  Until you enter a valid value
 *  Then prints out how much you will make weekly, at 40 hours / week.
 * 
SAMPLE RUN: 

* Enter your hourly wage : sfe
You didn't enter an a valid number.
Enter your hourly wage : 4r
You didn't enter an a valid number.
Enter your hourly wage : 7.85
You make $314.00 weekly.
 * 
 */

package lesson.activities;

// Imports classes
import java.util.InputMismatchException;
import java.util.Scanner;

public class HourlyWage {

    public static void main(String[] args) {
    	
    	double hourlyWage; // Creates a new variable of type double called 'hourlyWage'
    	while (true) { // While loop
    		try { // Try block
        		Scanner sc = new Scanner(System.in); // Instantiate the Scanner 
        		System.out.printf("How much are you making? "); // Prints text to console
        		hourlyWage = sc.nextDouble(); // Input from user is assigned to 'hourlyWage'
        		System.out.printf("You makin $%3.2f, weekly", hourlyWage * 40); // Prints out how much dough is made in a week
        		break; // Break outta the loop
        	} catch (Exception InputMisMatchException) { // Catch an InputMismatchException
        		System.out.printf("Woah, I can't handle this!?! [%s]\n\n", InputMisMatchException); // Print text to console
        	}
    	}
    }
}
