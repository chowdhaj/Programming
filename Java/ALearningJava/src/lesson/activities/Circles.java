/*
 * DEBUG THIS! Exercise - Circles!
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will calculate the Area and Circumference of a circle 
 * using user-defined functions 
 
 *
 * Examples:    Enter Circle Radius : 1.0
 *              Circumference : 6.283185; Area : 3.141593
 * 
 */

package lesson.activities;

import java.util.Scanner;

public class Circles {

    public static void main(String[] args) {    	
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Circle Radius : ");
        double radius = input.nextDouble();
        double circ = circleCircumference(radius); // The method 'circleCircumference()' only passes one argument
        double area = circleArea(radius);
        System.out.printf("Circumference: %f\nArea: %f\n", circ, area); // Missing a '.' after 'out' // Changed '%d' to '%f' // Slightly changed formatting
    } // Missing a closing brace
     
        public static double circleCircumference(double radius) { // Missing the 'static' keyword
            return 2*Math.PI*radius;
        }
    //} // This is an extra brace // Does not belong 
    
    public static double circleArea(double radius) { // Missing the end ')'
         return Math.PI*radius*radius; // Missing a 'return' statement
    }
}

/*

 					*** ORIGINAL CODE ***

public class Circles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Circle Radius : ");
        double radius = input.nextDouble();
        double circ = circleCircumference(radius,radius);
        double area = circleArea(radius);
        System.outprintf("Circumference : %d; Area : %f\n",circ, area);                
    
        public double circleCircumference(double radius) {
            return 2*Math.PI*radius;
        }
    }
    
    public static double circleArea(double radius {
         Math.PI*radius*radius;  
    }
}

*/