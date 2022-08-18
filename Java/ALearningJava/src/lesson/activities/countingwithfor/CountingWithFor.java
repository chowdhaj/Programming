/** Challenge Activity 1 - Counting with a for loop
 * 
 * In this activity you will use a for loop to roll a die 5000 times and count
 * the number of times a 1 comes up on the die. This is a fairly common practice 
 * in "data processing" style computer programs.
 * 
 * Do this 5000 times
 *  roll a die
 *  if it comes up 1 then increase the count
 * 
 * After the loop is over display the number of rolls, count of 1's and 
 * percentage of rolls which came up 1. (Should be close to 0.167)
 * 
 * Make sure to "block out" your code correctly. 
 * Sloppy code is as bad as incorrect code!
 * 
 * SAMPLE RUN:
 * 
 */

package lesson.activities.countingwithfor; // Location of our class file

import lesson.activities.countingwithfor.Die; // Imports our die class

public class CountingWithFor {

    public static void main(String[] args) {
    	
        // In this example we are using a six sided die
   
    	Die d6 = new Die(6); // Creates a six sided die // Instantiates the 'Die' class
    	int oneCounter = 0; // Creates an int, calls it 'oneCounter' and assigns it a value of 0
    	
    	for (int counter = 0; counter <= 5000; counter++) { // This for loop checks if 'counter' is less than 5000
        	d6.roll(); // Rolls our six sided die
        	if (d6.getValue() == 1) { // If the value rolled is 1 then:
        		oneCounter++; // Increment our variable 'counterOne' by one
        	}
        	System.out.printf("%d, ", d6.getValue()); // Prints out rolls to console
    	}
    	
    	System.out.printf("\n\nWe got %d ones after 5000 rolls\nThis is %3.2f%% of the time\nWe anticipated 16.7%%", // Summarizes the results and prints it to console
    			oneCounter, ((oneCounter/5000.0) * 100));
    }    
}
