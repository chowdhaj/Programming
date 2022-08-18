/*
 * * * * *
 * NOTES *
 * * * * * 
 * You can create an array of objects - any object!
 */

// Building A Multiple Choice Quiz
package mikeDaneJavaTutorial.tutorial29;

import java.util.Scanner;

public class Tutorial29MultipleChoiceQuiz {
	
	public static void main(String[] args) {
		
		// String that contains a question and its options
		String q1 = "What color are apples?" + "\n" +
					"a) Red/Green"           + "\n" +
				    "b) Blue"                + "\n" +
					"c) Yellow"              + "\n" +
				    "d) Purple";
		
		// String that contains a question and its options		
		String q2 = "What color are bananas?" + "\n" +
				"a) Red"                      + "\n" +
			    "b) Blue"                     + "\n" +
				"c) Yellow"                   + "\n" +
			    "d) Purple";
		
		// Creates an array of questions
		// Each question object will store a question and answer
		Questions question[] = {
				new Questions(q1, "a"),
				new Questions(q2, "c")
		};
		
		// Calls a method which will simulate a test
		takeTest(question);
	}
	
	public static void takeTest(Questions question[]) {
		
		int mark = 0; // Holds score/mark
		Scanner input = new Scanner(System.in);
		
		// Iterates through all the questions in the Questions object array
		for (int i = 0; i < question.length; i++) {
			System.out.println(question[i].question); // Prints question
			System.out.print("> ");
			String answer = input.nextLine(); // Stores user input
			
			// Compares input with answer
			if (answer.equalsIgnoreCase(question[i].answer)) {
				// If they are equal, then increase mark by 1
				mark++;
			}
			
			System.out.println(); // Print new line
		}
		
		// Prints final mark
		System.out.println("You got " + mark + "/" + question.length);
		
		input.close(); // Closes scanner to prevent memory leaks
	}
}