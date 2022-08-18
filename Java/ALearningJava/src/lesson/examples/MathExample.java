package lesson.examples; // Location of our class file

import java.util.Scanner; // Import Scanner

public class MathExample {

    public static void main(String[] args) {

    	// How To Use The Math Class
    	
    	Scanner input = new Scanner(System.in); // Initializes the scanner
         
    	System.out.print("Enter Circle Radius: "); // Asks user to input a radius for a circle
        
        double radius = input.nextDouble(); // Variable type = double // Name = 'radius' // Assigned 'input' as value as entered by user
        double circ = 2 * Math.PI * radius; // Variable type = double // Name = 'circ' // Holds 2 * PI * radius
        double area = Math.PI * radius * radius; // Variable type = double // Name = 'area' // Holds PI * radius * radius
        
        System.out.printf("Circumference: %3.2f\nArea: %3.2f\n", circ, area); // Prints out circumference and area of circle to console
    }
}

/*

GENERAL NOTES

You do not need to import the Math class because it is already included - nor do you have to instantiate it because...
... it is static [you can use it immediately without having to declare or initialize anything]

Math.PI = 3.1415972... 
You can assign this value to a string. i.e.:
int pi = Math.PI; // 'pi' holds a value of 3.1415972...

Circumference of Circle = (2)(PI)(Radius)
Area Of Circle = (PI)(Radius)(Radius) 

The advantage of using the class library is to reuse code instead of having to create it yourself. In this example...
... we don't have to know what PI is, we can use it from the Math class library

*/