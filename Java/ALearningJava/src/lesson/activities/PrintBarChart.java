/** Challenge Activity 2 - Print Bar Chart
 * 
 * In this activity you will implement a text mode bar chart.
 * For example, if you enter a value of 3 the bar chart will
 * contain three #'s ex. ###
 * The implementation is best explained through a sample run.
 * 
 * SAMPLE RUN(S):
 * 
 * Enter value for A : 4
 * Enter value for B : 13
 *  4 : [####]
 * 13 : [#############]
 * 
 * Enter value for A : 15
 * Enter value for B : 1
 * 15 : [###############]
 *  1 : [#]
 * 
 * 
 * your main() method should call the drawBarChart() method for a and b
 * the heavy lifting is done in the drawBarChart() method which requires a for loop
 */

package lesson.activities; // This is the location of our file

import java.util.Scanner; // Imports the Scanner class

public class PrintBarChart {

    public static void main(String[] args) {   
    	
    	Scanner userInput = new Scanner(System.in); // Instantiates the Scanner
    	System.out.print("Enter value for A: "); // Asks user to enter value
    	int numOne = userInput.nextInt(); // Value entered from user is assigned to an int named 'numOne'
    	System.out.print("Enter value for B: "); // Asks user to enter a number
    	int numTwo = userInput.nextInt(); // Number entered from user to assigned to an int named 'numTwo'
    	
    	System.out.printf("%d = [%s]\n%d = [%s]", // Prints out text to console
    			numOne, drawBarChart(numOne), numTwo, drawBarChart(numTwo)); 
    }

	public static String drawBarChart(int number) {
		String giveBack = ""; // Creates a new variable of type String called 'giveBack'
		for(int i = 0; i != number; i++) { // This for loop checks is our counter 'i' does not equal 'number'. If it doesn't then:
			giveBack = giveBack + "#"; // Add a '#' to the string 'giveBack'
		}
		return giveBack; // Return the string 'giveBack'
	}
}
