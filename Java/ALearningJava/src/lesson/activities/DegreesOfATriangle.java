/*Challenge Activity 2 - degrees of a triangle
 * 
 * The sum of the 3 angles of any triangle should total 180 degrees.
 * Any more or any less then the figure cannot be a triangle.
 * 
 * Write a program to accept 3 integer angles as input and checks 
 * whether it is a valid triangle by checking the sum against 180 degrees
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter degrees for angle 1 : 50
 *   Enter degrees for angle 2 : 40
 *   Enter degrees for angle 3 : 90
 *   180 degrees. That's a GOOD triangle!
 * 
 *   Enter degrees for angle 1 : 51
 *   Enter degrees for angle 2 : 40
 *   Enter degrees for angle 3 : 90
 *   181 degrees. That's a BAD triangle!
 */

package lesson.activities; // Location of our class file [inside a package named 'activities' and 'lesson'

import java.util.Scanner; // Imports Scanner class from Java library so we can accept user input

public class DegreesOfATriangle {

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in); // Initialize the scanner
    	
    	System.out.print(" Degrees For Angle 1 ===> "); // Ask for angle 1
    	int angle1 = input.nextInt(); // Assign user input to 'angle1'
    	
    	System.out.print(" Degrees For Angle 2 ===> "); // Ask for angle 2
    	int angle2 = input.nextInt(); // Assign user input to 'angle2'
    	
    	System.out.print(" Degrees For Angle 3 ===> "); // Ask for angle 3
    	int angle3 = input.nextInt(); // Assign user input to 'angle3'
    	
    	int sumOfAngles = angle1 + angle2 + angle3; // Variable type = int // Name = sumOfAngles // Value = angle1 + angle2 + angle3
    	System.out.printf(" %d degrees. That's a %s triangle!\n", sumOfAngles, (sumOfAngles == 180 ? "GOOD" : "BAD")); // Prints out result to console
    	// If sumOfAngles equals 180, then print: That's a GOOD triangle, and if it's not 180, then print: That's a BAD triangle
    }
}

/*

The trick with this assignment is to test the condition: sumOfAngles == 180
Any triangle whose angles do not add up to 180, is NOT a triangle

Also, to save memory usage, you can replace this line:

int sumOfAngles = angle1 + angle2 + angle3;

With this line:

angle1 = angle1 + angle2 + angle3;

This way, you are creating one less variable (3 instead of 4)

*/