/** Challenge Activity 2  - RectangleClassTests
 * 
 * In this activity, you will write unit tests for all the methods in 
 * the rectangle class. Your goal is to write code which makes the tests pass
 * and verified the methods of the class were written correctly.
 * 
 * You want to open this file:
 * Test Packages >> shapes >> RectangleTest.java 

 */

package lesson.activities.rectangleclasstests;

import java.util.Scanner;
import lesson.activities.rectangleclasstests.Rectangle;

/**
 *
 * Demonstrates use of the Rectangle class
 * 
 * SAMPLE OUTPUT:
 * Enter Rectangle Length : 5
 * Enter Rectangle Width : 3
 * Area : 15; Perimeter : 16
 */

public class RectangleClassRun {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        //System.out.printf("Area : %d | Perimeter : %d\n", rect.area(),rect.perimeter()); // If you don't pass anything in the constructor, width and length = 0 by default              
        System.out.print("Enter Rectangle Length : ");
        rect.setLength(input.nextInt());
        System.out.print("Enter Rectangle Width : ");
        rect.setWidth(input.nextInt());        
        System.out.printf("Area : %d | Perimeter : %d\n", rect.area(),rect.perimeter());               
    }
}
