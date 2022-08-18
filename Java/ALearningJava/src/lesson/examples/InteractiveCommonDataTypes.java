package lesson.examples; // Class is found in the 'examples' package, which is found in the 'lesson' package

import java.util.Scanner; // Imports the Scanner class which will allow us to take and read user input

public class InteractiveCommonDataTypes {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Initializes the Scanner class by creating a new Scanner called 'input'
        String studentName; // Declares a variable named 'studentName' of type String
        int age; // Declares a variable named 'age' of type int
        double gpa; // Declares a variable named 'gpa' of type double
        boolean isFemale; // Declares a boolean variable named 'isFemale'
        
        System.out.print("Enter student's name : "); // Asks for student's name
        studentName = input.nextLine(); // Assigns 'studentName' to whatever name the user inputs
        System.out.print("Enter student's gpa : "); // Asks for student's GPA
        gpa = input.nextDouble(); // Assigns 'studentName' to whatever GPA the user inputs
        System.out.print("Enter student's age : "); // Asks for student's age
        age = input.nextInt(); // Assigns 'studentName' to whatever age the user inputs
        System.out.print("Is this student female? (true/false) : "); // Asks if student is a male or female
        isFemale = input.nextBoolean(); // Assigns a true OR false value based on the student's gender [Male = False | Female = True]
               
        // Outputs all data gathered previously in a nicely formatted string
        System.out.printf("\n%s is %d years old. \n%s has a %3.2f gpa.\n", // %3.2f means that there are going to be 3 digits, and two of them will be to the right of the decimal (i.e. 3.29, 3.38, etc.)
                studentName,
                age,
                (isFemale ? "She" : "He"), // This is the ternary operator and is used to correctly output the gender of the student
                gpa);
    }
}

/*
 * %s is used for Strings
 * %d is used for ints
 * %f is used for doubles
 * 
 * You can format doubles like this: %4.3f, which means that there will be ...
 * ... 4 digits, and three of them will be to the right of the decimal
 * i.e. 3.9000000 --> 3.900 [there are 4 digits (3, 9, 0, 0), and 3 of them are right of the decimal (9, 0, 0)]
 * 
 * \n is used to go the next line [similar to println in functionality]
 * The ternary operator checks for a binary condition [true/false | yes/no]
 * Format for ternary operator:		(ExpressionToEvaluate ? Option1 : Option2)
 */

