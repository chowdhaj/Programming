/** Challenge Activity 1 - Min and Max
 * 
 * One common programming activity is to find the minimum and maximum values 
 * within a list. In this challenge activity we will do just that. It will also
 * demonstrate how arrays and for loops compliment each other nicely.
 * 
 * First, execute the main() method as is so you can understand how the for loop 
 * works with the array.  If you must, set a breakpoint and step through the code.
 * 
 * Notice the min and max values are not correct. That's where you come in your 
 * job is to write these methods. Regardless of min or max, your approach should
 * be the same: (Here's the pseudocode for min)
 * 
 * set min to the value of the first element in the array
 * for each element in the array
 *  if the current element is less than min
 *      set min to the current element
 * end for
 * return min
 */

package lesson.activities; // Location of our class file
 
import java.util.Scanner; // Imports the Scanner class

public class MinAndMax {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); // Instantiates the Scanner class
        int[] array = new int[10]; // Creates a new array of type int called 'array' and it holds 10 elements

        // Ask user for 10 integers and store them in our array, 'array'
        for(int i = 0 ; i < array.length; i++) { // Iterates over 'array' 
            System.out.printf("Enter Integer %d ==> ", i + 1); // Asks user to enter integer
            array[i] = input.nextInt(); // Input from user is assigned to the i(th) element in 'array'
        }
        // Prints out the array to console
        System.out.print("\nYou Entered: "); // Prints text to console
        for(int i = 0; i < array.length; i++) { // Iterates over 'array' 
            System.out.printf("%d ", array[i]); // Prints out all the numbers in 'array' to console
        }
        System.out.println("\n"); // Functions as '\n'
        
        System.out.printf("Min = %d\n", getMin(array)); // Prints out the min number in the array, 'array'
        System.out.printf("Max = %d\n", getMax(array)); // Prints out the max number in the array, 'array'

    }
    
    /** 
     * returns the smallest value in the array
     * @param array array of integer
     * @return integer representing the smallest
     */
    public static int getMin(int[] array) {
        int min = array[0]; // Sets the value of 'min' to the 0(th) element in 'array'
        for(int i = 0; i < array.length; i++) { // Iterates over 'array'
        	min = (min < array[i]) ? min : array[i]; // Checks to see if 'min' is larger or 'array[i], smaller value is assigned to 'min'
        }
    	return min; // Returns 'min'
    }
    
    /** 
     * returns the largest value in the array
     * @param array array of integer
     * @return integer representing the largest
     */
    public static int getMax(int[] array) {
    	int max = array[0]; // Sets the value of 'max' to the 0(th) element in the 'array'
        for(int i = 0; i < array.length; i++) { // Iterates over 'array'
        	max = (max > array[i] ? max : array[i]); // Checks to see if 'max' is larger or 'array[i], smaller value is assigned to 'max'
        }
        return max; // Returns 'max'
    }    
}