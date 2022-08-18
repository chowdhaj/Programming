package lesson.examples; // Location of our class file

import java.util.Scanner; // Imports the Scanner class

public class Factorial {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in); // Creates an object of type Scanner and calls it 'sc'
    	System.out.print("Gimme a number: "); // Asks user to enter a number
    	int n = sc.nextInt(); // Assigns input from user to a variable of type int called 'n'
    	// Creates a variable of type int, calls it 'result' a
    	int result = factorial(n); // The value assigned is return of the 'factorial()' method when 'n' is passed as a argument
        System.out.printf("%d factorial is %d\n", n,result); // Prints out the factorial of 'n' to console
    }
    
    /*
     * Calculates the factorial of a positive integer n
     * Example factorial(4) == 4*3*2*1 == 24
     */
    public static int factorial(int n) {
        int temp = 0; // Creates a variable of type int called 'temp' and assigns it a value of 0
        temp = (n < 2 ? 1 : n * factorial(n-1)); // Calculates the factorial of 'n' and assigns it to 'temp' // Read below for a better understanding
        return temp; // Returns the variable 'temp' to the 'main()' method // This is the number that is assigned to 'result'
    }
}

/*

The most confusing line in the entire program is:

temp = (n < 2 ? 1 : n * factorial(n-1));

This is what is happening in the line:

1. The variable 'temp' gets/is assigned the following value
2. Java checks if 'n' is less than 2, and if it is, 'temp' gets the value 1 , which makes ... 
... sense because 0! = 1, and 1! = 1, so 'temp' gets 1 and returns that value. In this ...
case, the first expression in the ternary operator is evaluated
3. If 'n' is greater than 2, the second expression in the ternary operator is evaluated, and... 
'n' is multiplied by 'n-1' until 'n' equals 1, and that value gets assigned to 'temp'. Think of it this way: 

Assume n = 4
Java checks if 4 < 2, and since it's not, it initiates the second expression in the ternary operator, and ...
... 'n' is multiplied by 'n-1'. So you get 4 x 3, and that value is assigned to 'temp'. So now, 'temp' holds 12. After ....
... that, Java checks if 'n' is less than 2, and since 3 is less than 2, 'temp' gets multiplied by 2, so you get ...
... 12 times 2 which is 24. Then, Java checks if 2 is less than 2, and since it is not, 24 is assigned to 'temp' and returned to 'main()'


*/