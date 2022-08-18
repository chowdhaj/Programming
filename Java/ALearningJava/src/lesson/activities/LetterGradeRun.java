/** Challenge Activity 1 - Letter Grades
 * 
 * In this challenge activity, You'll ask the user to enter their final 
 * average and then output the corresponding letter grade based on 
 * the following scale:
 * 90 and above ==> A
 * 80 up to 90  ==> B
 * 70 up to 80  ==> C
 * 60 up to 70  ==> D
 * below 60     ==> F 
 * 
 * HINT: Use the "if else ladder pattern" to complete this task.
 * practice clean code blocking patterns! Neatness counts!
 * 
 * PROGRAM OUTPUT SAMPLES:
 *  Enter your final average [0-100] : 67.8
 *  A final average of 67.800000 translates to a letter grade of D
 * 
 *  Enter your final average [0-100] : 90.0
 *  A final average of 90.000000 translates to a letter grade of A
 * 
 *  Enter your final average [0-100] : 89.999999
 *  A final average of 89.999999 translates to a letter grade of B
 */

package lesson.activities;

import java.util.Scanner;

public class LetterGradeRun {

    public static void main(String[] args) {

    	Scanner userInput = new Scanner(System.in); // Instantiates the Scanner
    	System.out.print("Enter your final average [0 - 100]: "); // Asks user to input a final average
    	double finalAverage = userInput.nextInt(); // User's input is assigned to a variable of type double called 'finalAverage'
    	char letterGrade = 'E'; // Creates a variable of type char called 'letterGrade' and it holds 'E'
    	
    	// This is the if-else ladder that translates the percentage to a letter grade
    	if (finalAverage >= 90) {
    		letterGrade = 'A';
    	} else if (finalAverage >= 80) {
    		letterGrade = 'B';
    	} else if (finalAverage >= 70) {
    		letterGrade = 'C';
    	} else if (finalAverage >= 60) {
    		letterGrade = 'D';
    	} else if (finalAverage < 60) {
    		letterGrade = 'F';
    	}
    	
    	System.out.printf("A final average of %3.2f translates to a letter grade of %s", finalAverage, letterGrade); // Prints out conversion to console
    }
}
