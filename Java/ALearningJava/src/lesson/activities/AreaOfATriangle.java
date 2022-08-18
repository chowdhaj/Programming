/* Challenge Activity 1 - Area of a triangle
 * 
 * The area of a triangle is (base * height) /2
 * 
 * Write a program to accept the base and height as integer values,
 * then calculate the area of the triangle, as a double..
 * 
 * Use either an explicit or implicit cast to obtain an accurate answer.
 * Remember to format the area output to 1 decimal place.
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter triangle base : 5
 *   Enter triangle height : 3
 *   Triangle area : 7.5
 */

package lesson.activities; // Location of our class file [inside two packages - 1. activities, 2. lesson]

import java.util.Scanner; // Import the Scanner [So we can take input from user]

public class AreaOfATriangle {

	// This is the main method [our entire program is written here]
    public static void main(String[] args) {
    	
    	Scanner userInput = new Scanner(System.in); // Initializes the Scanner so we can use it
    	
    	System.out.print("Enter Base Of Triangle: "); // Asks user to enter base of triangle
    	int base = userInput.nextInt(); // Variable type = int // Name = 'base' // Value assigned = Input from user
    	
    	System.out.print("Enter Height Of Triangle: "); // Asks user to enter height of triangle
    	int height = userInput.nextInt(); // Variable type = int // Name = 'height' // Value assigned = Input from user
    	
    	// Variable type = double // Name = 'area' //
    	double area = (base * height) / 2.0; // 'area' stores (int 'base') * (int 'height') divided by (double) 2.0
    	System.out.printf("Area Of The Triangle Is: %3.2f\n", area); // Prints out the area of triangle to console and formats it to 1 decimal place (%2.1f)        	
    }
}

/* 

This demonstrates implicit type casting. I don't need to tell Java to convert the int base, and height to a double, because it ...
... automatically does it when I divide them by a double (2.0). I could have also used explicit type casting. i.e.:

double aye = ((base * (double)height)) / 2; // And this would work just as well

In the above line of code, 'height' is converted to a double before being multiplied by 'base'. Then the whole thing is divided by 2

*/
