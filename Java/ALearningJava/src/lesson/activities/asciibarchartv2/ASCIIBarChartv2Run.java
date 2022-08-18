/** Challenge Activity 2 - ASCII Bar Chart v2.0
 * 
 * In this challenge activity, you will implement an array-based text 
 * (ASCII) bar chart. In order to complete this activity you must do the 
 * following:
 * 
 *  1) In DataPoint.java:
 *  - Implement the plot() method which will draw plot one data point like this:
 *      Apple : [#####################] (21)
 * 
 *  2) In this java file:
 *  - complete the 2 sections of the main() method below
 * 

 *  SAMPLE OUTPUT:
 * 
 
Enter 5 data points to be plotted :
Data point 1 : Enter Label : Microsoft
Data point 1 : Enter Value : 9
Data point 2 : Enter Label : Apple
Data point 2 : Enter Value : 21
Data point 3 : Enter Label : Oracle
Data point 3 : Enter Value : 4
Data point 4 : Enter Label : Google
Data point 4 : Enter Value : 24
Data point 5 : Enter Label : Facebook
Data point 5 : Enter Value : 6

Plotting Bar Chart:
 Microsoft : [#########] (9)
     Apple : [#####################] (21)
    Oracle : [####] (4)
    Google : [########################] (24)
  Facebook : [######] (6)
  
  * 
 */
package lesson.activities.asciibarchartv2; // Location of our class

import java.util.Scanner; // Imports the Scanner class

public class ASCIIBarChartv2Run {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); // Instantiates the Scanner
        DataPoint[] dp = new DataPoint[5]; // Creates a new array of type DataPoint called 'dp' and it holds 5 elements
        int count = 1; // Creates an int called 'count' and it holds 1
        System.out.printf("Enter 5 Data Points To Be Plotted\n"); // Prints text to console
        String dataLabel; // Initializes a String called 'dataLabel'
    	int dataValue; // Initializes an int called 'dataValue'
        
    	// The following 'for loop' accepts data from the user (a string and an int) and stores it in 'dp'
        for (int i = 0; i < dp.length; i++) {
        	System.out.printf("[Data Point %d] Enter Label ==> ", (i + 1)); // Asks user to enter label
        	dataLabel = input.next(); // Stores response into 'dataLabel'
        	System.out.printf("[Data Point %d] Enter Value ==> ", (i + 1)); // Asks user to enter value
        	dataValue = input.nextInt(); // Stores number into 'dataValue'
        	dp[i] = new DataPoint(dataLabel, dataValue); // 'dataLabel' and 'dataValue' are stored in i(th) element of 'dp'
        }
        
       // This is an enhanced for loop used to iterate over arrays
       for (DataPoint d : dp) { // Creates a new DataPoint called 'd' and uses it to iterate over 'dp'
    	   d.plot(); // Runs the 'plot()' method on 'd'
       }
    }
}

/*

The enhanced for loop above does something very similar to this:

for (int x = 0; x < dp.length; x++) {
	dp[x].plot();
 
 */










