/* 
 * DEBUG THIS! Exercise
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will accept an integer as input and display 
 * whether the number is ODD or EVEN.
 * By definition, an even number has no remainder when divided by 2.
 *
 * Examples:    Enter an integer : 15
 *              15 is ODD
 * 
 *              Enter an integer : -24
 *              -24 is EVEN
 */

package lesson.activities;

import java.util.Scanner; // Missing a semicolon

public class OddOrEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 's' in scanner needs to be in UPPERCASE
        System.out.print("Enter an integer : "); // Missing brackets around string to be output to console
        int i = input.nextInt();
        String result = (i % 2 == 0 ? "EVEN" : "ODD"); // 's' in string needs to be CAPITALIZED // i%3 --> i%2 // Added brackets around assigned value
        System.out.printf("%d is %s\n", i, result); // 'println' changed to 'printf' because arguments are provided
    }
}

/* 						
 					ORIGINAL CODE
 				   ----------------

import java.util.Scanner

public class OddOrEven {

    public static void main(String[] args) {
        Scanner input = new scanner(System.in);
        System.out.print "Enter an integer : ";
        int i = input.nextInt();
        string result =  i%3 == 0 ? "EVEN" : "ODD";
        System.out.println("%d is %s\n",i,result);
    }
}

*/