package lesson.examples; // Location of our class file

import java.util.Scanner; // Imports the Scanner class

public class MultiplesofN {

    /**
     * this program lists the first 10 multiples of the input value
     */
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); // Instantiates the Scanner
        System.out.print("Enter the number you want multiples of: "); // Asks user to input a number
        int multiplesOf = input.nextInt(); // Assigns input given from user to a variable of type int called 'multiplesOf'
        
        for (int i = 1; i <= 10; i++) { // As long as 'i' is less than 10, 'answer' gets 'i' multiplied by '10', and the result gets printed out to console
            int answer = i * 10; // int 'answer' gets 'i' multiplied by 10
            System.out.printf("%d * %d == %d\n", i, multiplesOf, answer); // Prints out the first 10 multiplies to console
        }
    }
}
