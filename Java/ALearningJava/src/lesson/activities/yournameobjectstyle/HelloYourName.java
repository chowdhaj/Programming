/* Challenge Activity 3 - Hello your name, object style

In this challenge activity, You'll write the familiar "hello your name" program
only using an object of the custom class YourName. 

The main program should:
1) ask for your first name
2) ask for your last name
3) create a YourName object using first and last name
4) print "Hello (your full name)"
5) print "Or should I say: (your name last, first)

NOTE: before you complete this program you must first implement YourName.java!!!

EXAMPLE:

Enter your FIRST name: Michael
Enter your LAST name: Fudge
Hello, Michael Fudge!
Or should I say: Fudge, Michael

 */

package lesson.activities.yournameobjectstyle; // Location of our class file

import java.util.Scanner; // Imports the Scanner class

public class HelloYourName {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in); // Initializes the Scanner class
    	
    	System.out.print("Enter Your FIRST Name: "); // Asks user to input first name
    	String firstName = input.nextLine(); // Stores user's first name into 'firstName'
    	
    	System.out.print("Enter Your LAST Name: "); // Asks user to input last name
    	String lastName = input.nextLine(); // Stores user's last name into 'lastName'
    	
    	YourName fullName = new YourName(firstName, lastName); // Creates a new object of type YourName with the arguments firstName, and lastName
    	System.out.printf("Hello, %s!\nOr should I say: %s", fullName.getFullName(), fullName.getReverseName()); // Prints out full name and full name with last name first
    }
    
}
