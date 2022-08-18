/* Challenge Activity 1 - Legal Drinking Age

Write a simple Java program to to do the following:

1) Input your age
2) if age less than 21 then
3)    Display a message about not being of legal drinking age
4) else
5)    Display a message about being legal drinking age

SAMPLE RUN #1: 
Enter your age : 34
You're legal. Enjoy a cold one!

SAMPLE RUN #2
Enter your age : 19
You're not of legal drinking age!

NOTE: be sure to "block out" your if else correctly! Style counts!

*/
package lesson.activities;

import java.util.Scanner; // Imports the Scanner class

public class LegalDrinkingAge {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in); // Instantiates the Scanner
    	System.out.print("Enter your age: "); // Asks user for their age
    	int age = sc.nextInt(); // Creates a new variable of type int called 'age' and assigns user input to it
    	
    	if (age < 21) { // If age is less than 21 then:
    		System.out.println("You're not of legal drinking!"); // Prints out 'you're not legal' to console
    	} else { // If age is NOT less than 21 (equal to or greater than 21) then:
    		System.out.println("You're legal. Enjoy a cold one!"); // Prints out 'you're legal' to console
    	}
    }
}
