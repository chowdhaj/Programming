/* Challenge Activity 2
 * 
 * When I was in college my MET100 Professor only gave us 3 exams. 
 * There were 150 questions on each exam. 
 * Your final grade in the course was the sum of the number of questions
 * you got right on each of exam1, exam2 and exam3 divided by 450 (the 
 * maximum possible points) 
 * 
 * Write a program which given 3 exam scores displays your total of all 3
 * exam scores and percentage (as a whole number). 
 * 
 * * * * * ALSO, YOU CAN ONLY USE INTEGERS, NO DOUBLES!!!!! * * * * * 
 * 
 * SAMPLE RUN: 
 *  Exam 1 Score : 120
 *  Exam 2 Score : 135
 *  Exam 3 Score : 130
 *  Total points : 385
 *  Percentage : 85
 *  
 */

package lesson.activities; // Location of our class file

import java.util.Scanner; // Imports the Scanner class so we can accept input from user

public class FinalGradeInMET100 {

	// This is the main method - first to run in Java
    public static void main(String[] args) {
    	
    	Scanner userInput = new Scanner(System.in); // Initializes the Scanner and calls it 'userInput' to refer to it
    	int scoreOne, scoreTwo, scoreThree, totalPoints, percentage; // Declares and initializes 5 ints but does not assign a value to any of them
    	
    	System.out.print("Exam 1 Score: "); // Asks for first exam score
    	scoreOne = userInput.nextInt(); // 'scoreOne' gets first exam score
    	
    	System.out.print("Exam 2 Score: "); // Asks for second exam score
    	scoreTwo = userInput.nextInt(); // 'scoreTwo gets second exam score
    	
    	System.out.print("Exam 3 Score: "); // Asks for third exam score
    	scoreThree = userInput.nextInt(); // 'scoreThree' gets third exam score
    	
    	totalPoints = scoreOne + scoreTwo + scoreThree; // 'totalPoints' gets 'scoreOne' plus 'scoreTwo' plus 'scoreThree'
    	percentage = (100 * totalPoints) / 450; // 'percentage' gets 100 times 'totalPoints' and the product of that divided by 450
    	System.out.printf("Total Points: %d\n", totalPoints); // Outputs 'totalPoints' to console
    	System.out.printf("Percentage: %d\n", percentage); // Outputs 'percentage' to console
    	
    	// Another way you can output Total Points is like this:
    	//System.out.println("Total Points: " + (scoreOne + scoreTwo + scoreThree));
    }
}

/*/
 * The secret sauce to successfully completing this is: percentage = (100 * totalPoints) / 450;
 * Multiply test score by 100 then divide by total number of points to get the percentage without any decimals
 * If you used a double to do this, then you would have gotten 86 as a percentage, not 85
/*/
