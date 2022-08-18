package lesson.examples; // Location of our class file

import java.util.Scanner; // Import the Scanner class

public class IfElseStatement {

    /**
     * A Simple demonstration of the if and if else statements
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a new object of type Scanner
        System.out.print("Enter your grade a number between 0 and 100: "); // Ask the user to enter a grade between 0 - 100
        int grade = input.nextInt(); // Creates a variable of type int called 'grade' and it holds the users input
        
        if (grade > 100 || grade < 0) { // If grade is greater than 100 or less than 0
            System.out.printf("%d, eh? You're not very good following instructions!\n", grade); // Prints out text to console      
        } else { // If grade is in between 0 - 100 [inclusive]
        	if (grade < 70 ) { // If grade is less than 70
                System.out.println("Ouch. You're not a very smart student!"); // Prints text to console
            }
            System.out.println("Thank you for entering your grade."); // Prints text to console
        }
    }
}
