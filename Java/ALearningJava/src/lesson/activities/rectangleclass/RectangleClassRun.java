/*
 * DEBUG THIS! Exercise - Rectangle Class
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program is similar to a previous exercise only you will calculate 
 * area and perimeter using a Java class. Be sure to correct the syntax 
 * and semantic errors in both the Rectangle.java and main 
 * RectangleClassRun.java files
 * 
 * SAMPLE OUTPUT:
 * 
 * Enter Rectangle Length : 5
 * Enter Rectangle Width : 3
 * Area : 15; Perimeter : 16

*/
package lesson.activities.rectangleclass;

import java.util.Scanner;

public class RectangleClassRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle(10,10);
        System.out.print("Enter Rectangle Length: ");
        rect.setLength(input.nextInt());
        System.out.print("Enter Rectangle Width: "); // 's' in system needs to be capital
        rect.setWidth(input.nextInt());        
        System.out.printf("Area: %d; Perimeter: %d\n", rect.area(), rect.perimeter()); // Added arguments at the end        
    }
}
