package lesson.examples; // Location of our class file

import java.util.Scanner; // Imports the Scanner class

public class MethodBasics {

    public static void main(String[] args) {

    	int length, width; // Creates two variables, 'length' and 'width', respectively, of type int
        Scanner input = new Scanner(System.in); // Creates a new object of type Scanner and calls it 'input'
        System.out.print("Enter Length : "); // Asks user to enter a length
        length = input.nextInt(); // Stores user's input into the variable 'length'
        System.out.print("Enter Width : "); // Asks the user width
        width = input.nextInt(); // Stores user's input into the variable 'width'
        int perimeter = rectanglePerimeter(length, width); // Variable type = int // Name = 'perimeter' // Stores a value of the return of 'rectanglePermimeter'
        int area = rectangleArea(length, width); // Variable type = int // Name = 'area' // Stores a value of the return of 'rectangleArea'
        System.out.printf("Area: %d\nPerimeter: %d\n", area, perimeter); // Prints out 'area' and 'perimeter' to console
    }
    
    // This is the 'rectangleArea' method // It is public // Does not need to be instantiated // Takes two parameters and returns the multiplication of them
    public static int rectangleArea( int someLength, int someWidth) {
        return someLength*someWidth; // Returns someLength times someWidth and that value is stored into 'int area'
    }
    
    // This is the 'rectanglePerimeter' method // It is public // Does not need to be instantiated // Takes two parameters adds them up, multiples that by two, and returns the product
    public static int rectanglePerimeter( int someLength, int someWidth) {
        return 2*(someLength + someWidth); // Returns the product of 2 times ('someLength' + 'someWidth') and that value is stored into 'int permimeter'
    }
}

/*
									GENERAL NOTES

You can have as many methods as you need or want, and they can be placed anywhere, as long as...
... they are inside the public class braces. You can have different methods that precede the main method, and...
... they will function as normal

All methods within the public class MethodBasics's braces do not need to be instantiated (i.e. no need to create an object), but...
... methods outside of this class file, WILL need to be instantiated, imported, and treated as an object (i.e. Random gen = new Random();)

*/