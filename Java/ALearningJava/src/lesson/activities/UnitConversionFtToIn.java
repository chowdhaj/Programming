/*
 * DEBUG THIS! Exercise
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will convert an input value in Inches to Feet and Inches.
 * There are 12 inches in a foot. 
 * The remainder are the leftover inches
 * Examples:    15 inches = 1 foot 3 inches.
 *              29 inches = 2 feet 5 inches.
 */
package lesson.activities;

import java.util.Scanner;

public class UnitConversionFtToIn {

    public static void main(String[] args) { // Requires an opening brace
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value in inches: ");
        int inputInches = input.nextInt();
        int ft, in; // Removed semicolon with a comma to declare all variables in one line
        ft = inputInches / 12; // Changed modulo sign to divide sign
        in = inputInches % 12; // Changed divide sign to module sign
        System.out.printf("%d inches = %d %s %d inches.\n" // The first 's' in System must be capital // Added a period after inches // Changed %s to %d that appears after feet
                , inputInches, ft, ((ft == 0) ? "foot" : "feet"), in); // Added a ternary operator to check if 'ft' is 1, and if so, use foot instead of feet
    }
}

/*
ORIGINAL CODE

public static void main(String[] args) 
	Scanner input = new Scanner(System.in);
    System.out.print("Enter a value in inches : ");
    int inputInches = input.nextInt();
    int ft; in;
    ft = inputInches % 12;
    in = inputInches / 12;
    system.out.printf("%d inches == %d feet %s inches\n"
            , inputInches, ft, in);
    }

*/

//REFER TO COMMENTS ABOVE TO SEE WHAT IS WRONG WITH IT