/** Challenge Activity 2 - Letter Grades with Enumerations
 * 
 * Solve the same problem as the previous challenge activity, but
 * this time use the custom java Enum in the Grade.java so rather than writing:
 * 
 *         if (finalGrade >=90) {
 *           finalLetter = "A";
 *         }
 * 
 *  You'll use this more readable version with enums:
 * 
 *         if (finalGrade >=Grade.A.Min()) {
 *            finalLetter = Grade.A;
 *       }
 * 
 * Same input and output as before:
 
 * PROGRAM OUTPUT SAMPLES:
 *  Enter your final average [0-100] : 67.8
 *  A final average of 67.800000 translates to a letter grade of D
 * 
 *  Enter your final average [0-100] : 90.0
 *  A final average of 90.000000 translates to a letter grade of A
 * 
 * Enter your final average [0-100] : 89.999999
 * A final average of 89.999999 translates to a letter grade of B
 */

package lesson.activities.lettergradeenums;

import java.util.Scanner;

public class LetterGradeEnumsRun {

    public static void main(String[] args) {
        // TODO: Implement programming logic here
        
    	Scanner userInput = new Scanner(System.in); // Instantiates the Scanner
    	System.out.print("Enter your final average [0 - 100]: "); // Asks user to input a final average
    	double finalAverage = userInput.nextInt(); // User's input is assigned to a variable of type double called 'finalAverage'
    	Grade letterGrade;
    	
    	// This is the if-else ladder that translates the percentage to a letter grade
    	
    	if (finalAverage >= Grade.A.Min()) {
    		letterGrade = Grade.A;
    	} else if (finalAverage >= Grade.B.Min()) {
    		letterGrade = Grade.B;
    	} else if (finalAverage >= Grade.C.Min()) {
    		letterGrade = Grade.C;
    	} else if (finalAverage >= Grade.D.Min()) {
    		letterGrade = Grade.D;
    	} else {
    		letterGrade = Grade.F;
    	} 
    	
    	System.out.println(letterGrade);
    	
    	System.out.printf("Your %3.2f translates to a %s", finalAverage, letterGrade); // Outputs the results from above to console
    	
    }
}