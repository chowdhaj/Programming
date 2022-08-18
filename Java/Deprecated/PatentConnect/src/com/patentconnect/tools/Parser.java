package com.patentconnect.tools;

import java.math.BigInteger;

public class Parser {
	
	public final static byte MIN_SIZE_PATENT_ID = 5; // Minimum size of String
	public final static byte MAX_SIZE_PATENT_ID = 7; // Maximum size of String
	
	/**
	 * Parses a String and returns an exit value (byte).
	 * 
	 * Checks to see if a String is a series of numbers that is greater than or equal to 5, and
	 * less than 7. Returns exit codes from 0 to 4 based on parsing result. 
	 * An exit value of 0 means that the String is empty
	 * An exit value of 1 means that the String is in the correct format
	 * An exit value of 2 means that the size of the String is not between 5 and 7 (inclusive)
	 * An exit value of 3 means that the String is not a number
	 * An exit value of 4 means that the String is of a completely different format or something went terribly wrong
	 * 
	 * @param parseString The string to be parsed and checked
	 * @return A byte that corresponds to an exit code. See description for more details.
	 */
	public static byte parseExitCode(String parseString) {	

		if (parseString.equals("")) {
			System.out.print("Please Enter A Patent ID");
			// Return 0 when String is empty
			return 0;
		} else {
			try {
				// Try to convert String into a Big Integer
				BigInteger parseNum = new BigInteger(parseString);
				if (Parser.isCorrectSize(parseString, MIN_SIZE_PATENT_ID, MAX_SIZE_PATENT_ID)) {
					System.out.print("This Format Is Correct");
					// If String is correct size then return 1
					return 1;
				} else {
					System.out.print("This Is Not A Valid Patent ID");
					// If String is not correct size then return 2
					return 2;
				}
			} catch (NumberFormatException invalidInput) {
				System.out.print("This Is Not A Number. Please Try Again.");
				// If String could not be converted into BigInteger, then return 3
				return 3;
			} catch (Exception genericException) {
				System.out.print("Something Went Terribly Wrong. Please Try Again.");
				genericException.printStackTrace();
				// Return 4 when all other cases are exhausted
				return 4;
			}
		}
	}
	
	/**
	 * Checks if a String is within the acceptable limits
	 * 
	 * @param s The String that will be checked
	 * @param min Minimum number of acceptable characters
	 * @param max Maxmimum number of acceptable characters
	 * @return True if length of String falls in between min and max, False otherwise
	 */
	private static boolean isCorrectSize(String s, byte min, byte max) {
		// If the length of 's' is greater than 'min' and less than 'max'
		if (s.length() >= min && s.length() <= max) { 
			return true; // Return true
		}
		// Return false when IF statement, above, is not satisfied
		return false;
	}
	
	public static void main(String[] args) {
		
		// TEST CODE: TO BE DONE BY VARUN
		// Put some test cases here and do the rest in JUNIT

	}
}

/*
	ROUGH CODE
	PLEASE IGNORE ME
	
if (parseField.equals("")) {
	System.out.println("Please Enter A Patent ID");
	lblStatus.setForeground(Color.GRAY);
	lblStatus.setText("Status: Waiting For User Input");
} else {
	try {
		// parseString = Integer.parseInt(parseField);
		BigInteger parseString = new BigInteger(parseField);
		if (parseField.length() >= 5 && parseField.length() <= 7) {
			System.out.println("This Format Is Correct");
			lblStatus.setForeground(Color.GREEN);
			lblStatus.setText("Status: Please stand by while we process your request...");
			// Go To Next Page
		} else {
			System.out.println("This Is Not A Valid Patent ID");
			lblStatus.setForeground(Color.GRAY);
			lblStatus.setText("Status: Invalid patent number");
		}
	} catch (NumberFormatException notNum) {
		System.out.println("The Inputted Field Is Not A Number.");
		lblStatus.setForeground(Color.RED);
		lblStatus.setText("Status: This is not a number. Please try again");
	} catch (Exception error) {
		System.out.println("This Error Is Undocumented.\nPlease Contact The Devs Of PatentConnect.");
		lblStatus.setForeground(Color.BLACK);
		lblStatus.setText("Status: Unknown error encountered. Please try again");
	}
}

 */