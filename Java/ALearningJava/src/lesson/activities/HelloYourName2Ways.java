
/* Challenge Activity 1

Write a java program to input your first name and last name, then say "hello"
two ways, like this:
 
Enter your first name: Michael
Enter your last name: Fudge

Hello, Michael Fudge!  
Or should I say: Fudge, Michael!

*/

package lesson.activities; // This class is located in the 'activities' package, which is inside the 'lesson' package

import java.util.Scanner; // Imports the Scanner class from the Java library

// The class is public and is called 'HelloYourName2Ways'
public class HelloYourName2Ways {

    public static void main(String[] args) {
    	
    	String greetingOne = "Hello, "; // This declares and initializes a variable of type String and assigns "Hello" to it 
    	String greetingTwo = "Or should I say: "; // This declares and initializes a variable of type String and assigns "Or should I say: " to it 
    	String blankSpace = " "; // This declares and initializes a variable of type String and assigns " " to it - this is our blank string
    	String exclamPoints = "!!!"; // This declares and initializes a variable of type String and assigns "!!!" to it - this is our exclamation points
    	
    	Scanner nameInput = new Scanner(System.in); // Declares and initializes the Scanner class and is referred to by 'nameInput'
    	System.out.print("What is your first name? ===> "); // Prints to console - asks user for their first name
    	String firstName = nameInput.nextLine(); // Declares and initializes a variable of type String called 'firstName' and assigns it a value of whatever the user inputs
    	System.out.print("What is your last name? ===> "); // Prints to console - asks user for their last name
    	String lastName = nameInput.nextLine(); // Declares and initializes a variable of type String called 'lastName' and assigns it a value of whatever the user inputs
    	
    	System.out.println("--------------------------"); // Prints out a bunch of '-' (In essence, this is a divider)
    	
    	// This is how you would use 'printf' to achieve the results
    	System.out.printf("%s%s%s%s!!!\n", greetingOne, firstName, blankSpace, lastName);
    	System.out.printf("%s%s%s%s!!!\n", greetingTwo, lastName, blankSpace, firstName);
    	
    	System.out.println("--------------------------"); // Prints out a bunch of '-' (In essence, this is a divider)
    	
    	// This achieves the same results using 'println'
    	System.out.println(greetingOne + firstName + blankSpace + lastName + exclamPoints);
    	System.out.println(greetingTwo + lastName + blankSpace + firstName + exclamPoints);
    	
    	System.out.println("--------------------------"); // Prints out a bunch of '-' (In essence, this is a divider)
    	
    	// You do not need to create and use 'greetingOne/greetingTwo/blankSpace/exclamPoints' you can do this: 
    	System.out.println("Hello, " + firstName + " " + lastName + "!!!");
    	System.out.println("Or should I say: " + lastName + " " + firstName + "!!!");
    	

    }   
}
