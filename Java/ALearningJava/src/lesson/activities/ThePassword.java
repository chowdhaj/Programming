/** Challenge Activity 1 - The Password
 * 
 * In this project folder you will find a text file called password.txt
 * inside the file is the password.
 * 
 * Write a program to load this password from the file into a string, 
 * then build a loop which asks the user to enter the password until they 
 * do so correctly 
 * 
 * Note: don't forget to close the file!
 * 
 * SAMPLE RUN: 
Enter Password: snake
Invalid Password!
Enter Password: testing
Invalid Password!
Enter Password: rhubarb
Password Accepted!
 */

package lesson.activities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThePassword {

    public static void main(String[] args) {
        	
    	// STEP 1. OPEN UP FILE
    	File secretFile = new File("password.txt");
    	String password = "password";
    	try {
			Scanner readFile = new Scanner(secretFile);
	    	password = readFile.nextLine(); // STEP 2: STORE PASSWORD FROM FILE INTO A STRING
		} catch (FileNotFoundException e1) {
			System.out.printf("\n***ERROR: File Not Found***\n");
		}
    	
    	// STEP 3: ACCEPT INPUT FROM USER
    	boolean passwordIsInvalid = true;    	
		while (passwordIsInvalid) {
    		try {
    			Scanner sc = new Scanner(System.in);
    			System.out.print("Enter Password: ");
    			String input = sc.nextLine();
    			if (input.equalsIgnoreCase(password)) { // STEP 4: CHECK INPUT AGAINST PASSWORD
    				System.out.printf("Password Accepted!\n"); // STEP 5: PRINTS CONFIRMATION MESSAGE
    				passwordIsInvalid = false;
    			} else {
    				System.out.printf("Invalid Password!\n"); 
    			}
    		} catch (Exception e) {
    			System.out.println("ERROR: " + e);
    		}
    	}
        
    }
}
