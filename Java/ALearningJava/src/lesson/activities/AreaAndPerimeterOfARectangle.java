/* Challenge Activity 1
 * 
 *  This program should take two integer inputs:
 *  length and width of a rectangle. 
 *  using those inputs it should calculate and display the 
 *  the area and perimeter of the rectangle. 
 * 
 *  Area = Length x Width
 *  Perimeter = 2 x (Length + Width)
 * 
 *  SAMPLE RUN: 
 * 	  	Enter Length: 7
 *    	Enter Width: 5
 *    	Perimeter : 24
 *    	Area : 35
 */

package lesson.activities; // Location of package [it's inside package activities, which is inside package lesson]

import java.util.Scanner; // Imports the Scanner class

public class AreaAndPerimeterOfARectangle {

    public static void main(String[] args) {
    	
    	Scanner userInput = new Scanner(System.in); // Initializes the Scanner class and calls it 'userInput'
    	int x, y, result; // Declares and initializes 3 variables of type int, but DOES NOT give them a value
    	
    	//String units = " Units", units2 = "Units^2"; // Uncomment if you want to add 'units' at the end of perimeter/area
    	
    	System.out.print("Please enter a length: "); // Asks user to enter length								
        x = userInput.nextInt(); // Assigns length to 'x'
        
        System.out.print("Please enter a width: "); // Asks user to enter width
        y = userInput.nextInt(); // Assigns width to 'y'
        
        if (x == y) {
        	System.out.printf("Since %d is equal to %d, this is a square", x, y);
        } else {
        	System.out.printf("Since %d and %d are different, this is a rectangle", x, y);
        }
        
        result = (2 * x) + (2 * y); // Result gets [(2 times x) plus (2 times y)]
        System.out.printf("Perimeter: %d\n", result); // Prints out perimeter of rectangle
        
        result = x * y; // Result gets x times y
        System.out.printf("Area: %d\n", result); // Prints out area of rectangle
 
    }
}
