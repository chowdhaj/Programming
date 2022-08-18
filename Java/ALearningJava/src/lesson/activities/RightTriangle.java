/* Challenge Activity 3 - Area and Perimeter of a right triangle

This activity is similar to the video lesson. You will take input for lengths of 
sides a and b of of a right triangle, en.wikipedia.org/wiki/Right_triangle
then calculate the area and perimeter.

the area is easy:  0.5 x a x b
the permieter is: a + b + c where c is calculated by the pythagorean theorem
to be the square root of a squared + b squared

SAMPLE OUTPUT:

Enter Right Triangle Side A : 3
Enter Right Triangle Side B : 4
Area: 6.000000; Perimeter: 12.000000

*/

package lesson.activities; // Location of our 'RightTriangle' class [found in packages called: 'activities' and 'lesson']

import java.util.Scanner; // Imports the Scanner class from the Java library

public class RightTriangle {

    public static void main(String[] args) {
        // TODO code application logic here get input, 
        // calculate area, perimeter then display output.
    	Scanner input = new Scanner(System.in); // Creates a new object of type Scanner and refers to it by 'input'
    	
    	System.out.print("Enter Right Triangle Side A: "); // Asks user to input a side
    	int sideA = input.nextInt(); // Stores user's input into variable of type int called 'sideA'
    	
    	System.out.print("Enter Right Triangle Side B: "); // Asks to input a side
    	int sideB = input.nextInt(); // Stores input into an int variable called 'sideB'
    	
    	// Creates a variable of type double called 'area'
    	double area = triangleArea(sideA, sideB); // The value 'area' holds is determined by the 'triangleArea()' method, when 'sideA' and 'sideB' are passed as arguments
    	
    	// Variable type = double // Name = 'perimeter'
    	double perimeter = trianglePerimeter(sideA, sideB); // The value 'perimeter' holds is determined by the 'trianglePerimeter()' method, when 'sideA' and 'sideB' are passed as arguments
    	
    	System.out.printf("Area Of Triangle: %3.2f\nPerimeter Of Triangle: %3.2f\n", area, perimeter); // Prints out area and perimeter of the right triangle to console to 2 decimal places
    	
    }
    /**
     * Calculates the area of a right triangle
     * @param a side a length
     * @param b side b  length
     * @return the area as a double
     */
    // This is the 'triangleArea()' method // It is public // Does not need to be instantiated // Accepts two parameters of type int
    public static double triangleArea(int a, int b) {
        return 0.5 * a * b; // Returns 'int a' times 'int b' times a half to be stored in 'area'
    }
    
    /**
     * Calculates the perimeter of a right triangle
     * @param a side a length
     * @param b side b length 
     * @return the perimeter as a double
     */
    // This is the 'trianglePerimeter()' method // It is public // Does not need to be instantiated // Accepts two parameters of type int
    public static double trianglePerimeter(int a, int b) {
    	// Calculate 'sideC' by taking the square root of the sum of a^2 and b^2 // Stored in a variable of type double called 'sideC'
    	double sideC = Math.sqrt((a * a) + (b * b)); // The square root is calculated by the Math.sqrt() method found in the Math class
        return a + b + sideC; // Returns the sum of 'a', 'b', and 'sideC' to be stored in 'perimeter'
    }
}
