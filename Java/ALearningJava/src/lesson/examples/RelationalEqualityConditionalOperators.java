package lesson.examples; // Location of our class file is inside two packages [examples + lesson (in that order)]

import java.util.Scanner; // Imports the Scanner class to be able to accept input from user

public class RelationalEqualityConditionalOperators {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); // Initializes the Scanner
        System.out.print("Enter an integer value for X : "); // Asks for an integer
        int x = input.nextInt(); // Stores integer entered by user in a variable of type int called 'x' 
        System.out.print("Enter an integer value for Y : "); // Asks for an integer       
        int y = input.nextInt(); // Stores integer provided by user in an int called 'y'
        
        // The '%s' in the statements below accepts a string, and the string is either true or false and depends if the condition is met or not (i.e. X > Y)
        System.out.printf(" X == Y ? %s\n", x == y); // Prints out true if X == Y, and false if X != Y
        System.out.printf(" X != Y ? %s\n", x != y);
        System.out.printf(" X > Y ? %s\n", x > y); // Prints out true if X > Y, and false if Y < X
        System.out.printf(" X <= Y ? %s\n", x <= y);
        System.out.printf(" X >= Y ? %s\n", x >= y); // Prints out true if X >= Y, and false if X <= Y
        System.out.printf(" X < Y ? %s\n", x < y);
        
        // If X == Y then it prints out booyah, and if X != Y then it prints out no-dice [accomplished using the ternary operator] 
        System.out.printf(" X == Y ? booyah : no-dice ? %s\n", (x==y) ? "booyah" : "no-dice");
        
        // A better way to format the above is like this:
        //System.out.printf(" Is %d == %d ? %s\n", x, y, (x == y) ? "Yes" : "No");
        //System.out.printf(" Is %d > %d ? %s\n", x, y, (x > y) ? "Yes" : "No");
        //System.out.printf(" Is %d <= %d ? %s\n", x, y, (x <= y) ? "Yes" : "No");
    }
}

/*

In the following line of code:

System.out.printf(" X == Y ? %s\n", x == y);

%s expects an argument of type string. This is either true or false and depends on the (x == y) expression. If x == y...
... then the argument supplied is true, and if x does not equal y, then the argument supplied is false.

* * * * * * * * * * * * * * * * * * * * * * * * * 

To be fair, my method of formatting the output is better: 

System.out.printf(" Is %d <= %d ? %s\n", x, y, (x <= y) ? "Yes" : "No");

*/