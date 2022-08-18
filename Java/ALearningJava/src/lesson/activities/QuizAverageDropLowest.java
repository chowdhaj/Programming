/** Challenge Activity 2 - Quiz Average Drop Lowest Score
 *
 * This program, similar to the Debug This! Exercise, will ask you to enter 
 * a series of quiz grades with acceptable values between 0 and 100. 
 * When you're done entering grades input a -1.
 * As you accept grades you should keep track of the lowest score.
 * At the end of the program it will report the total points earned,
 * count of quizzes taken and display the average grade of all quizzes,
 * with and without OMITTING THE LOWSEST SCORE.
 * 
 * Your task is to modify this existing code to accommodate this scenario.
 * 
SAMPLE RUN(S):

	Enter Quiz 1 grade (a value between 0 and 100 or a -1 to quit) => 80
	Enter Quiz 2 grade (a value between 0 and 100 or a -1 to quit) => 90
	Enter Quiz 3 grade (a value between 0 and 100 or a -1 to quit) => -1

Raw Scores :
Quiz Count :	2
Total Points:	170
Average Grade:	85.000000

Scores With Lowest Dropped :
Dropped Score :	80
Quiz Count :	1
Total Points:	90
Average Grade:	90.000000

 * Enter Quiz 1 grade (a value between 0 and 100 or a -1 to quit) => 75
 * Enter Quiz 2 grade (a value between 0 and 100 or a -1 to quit) => -2
 * Invalid Grade!
 * Enter Quiz 2 grade (a value between 0 and 100 or a -1 to quit) => 0
 * Enter Quiz 3 grade (a value between 0 and 100 or a -1 to quit) => 100
 * Enter Quiz 4 grade (a value between 0 and 100 or a -1 to quit) => -1

 * Raw Scores :
 * Quiz Count :	3
 * Total Points:	175
 * Average Grade:	58.333333

 * Scores With Lowest Dropped :
 * Dropped Score :	0
 * Quiz Count :	2
 * Total Points:	175
 * Average Grade:	87.500000
 * 
 * 
 * Enter Quiz 1 grade (a value between 0 and 100 or a -1 to quit) => -1
 * No Quiz Grades Entered!
 */

package lesson.activities; // Location of our class file

import java.util.Scanner; // Imports the Scanner class

public class QuizAverageDropLowest {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); // Instantiates the Scanner class
        int quizNumber = 1, quizGrade = 0, totalAverage = 0, minimumMark = 100; // Declares and creates 4 variables of type int
        double average = 0.0; // Creates a variabe of type double, calls it 'average', and assigns it a value of 0.0
        
        while (true) { // While [true] do the following: 
        	System.out.printf("Enter Quiz %d Grade [1 - 100 [And -1 To Quit] inclusive] ==> ", quizNumber); // Print text to console
        	quizGrade = input.nextInt(); // User input is assigned to 'quizGrade'
        	if (quizGrade == -1) { // If 'quizGrade' is '1' then:
        		quizNumber--; // Decrement 'quizNumber by 1
        		break; // Jump out of the loop
        	}
        	if (quizGrade >= 0 && quizGrade <= 100) { // If 'quizGrade' is greater than or equal to 0 and 'quizGrade' is less than or equal to 100
        		quizNumber++; // Increase 'quizNumber' by 1
        		totalAverage += quizGrade; // Add 'quizGrade' to 'totalAverage'
        		if (quizGrade < minimumMark) { // If 'quizGrade' is less than 'minimumMark' then:
        			minimumMark = quizGrade; // 'minimumMark' gets 'quizGrade'
        		}
        	} else { // If 'quizGrade' is less than 1 or greater than 100, then:
        		System.out.println("\nERROR: INVALID RESPONSE\nTRY AGAIN PLEASE\n"); // Print text to console
        	} 
        }
        if (quizNumber > 0) { // If 'quizNumber' is greater than 0 then print the following to console:
        	System.out.printf("\n\nINFORMATION\nQuiz Count: %d\nTotal Points: %d\nAverage Grade: %3.2f\n"
        		+ "\nOUTLIERS DROPPED\nDropped Score: %d\nQuiz Count: %d\nTotal Points: %d\nAverage Grade: %3.2f\n", 
        		quizNumber, totalAverage, (totalAverage / (quizNumber * 1.0)), 
        		minimumMark, (quizNumber - 1), (totalAverage - minimumMark), 
        		((totalAverage - minimumMark)/(quizNumber - 1.0)));
        } else { // If 'quizNumber is less than 0 then print the following to console:
    		System.out.println("No Quiz Grades Entered");
        }
    }
}
