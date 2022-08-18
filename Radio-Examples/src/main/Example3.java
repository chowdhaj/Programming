/**
 * One of the many (bad) ways to model a Radio
 */
package main;

import java.util.Scanner;

/**
 * @author chowdhaj
 * 
 * Another way to create a Radio; not the best way
 */
public class Example3 {
	
	/*
	 * Represents the state of the Radio
	 * 
	 * 0 = OFF
	 * 1 = ON
	 * ...
	 */
	public static int state = 0;
	
	// Determines if the user wants to exit the program
	public static boolean isProgramRunning = true; 
	
	// Scanner object for this class
	private static Scanner userInput = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printStartStatement();
		
		while (isProgramRunning) {
			
			printOptions();
			acceptInput();
		}
		
		printEndStatement();
		

	}
	
	public static void acceptInput() {
		
		String unsanitizedInput = "";
		
		System.out.print("> ");
		
		unsanitizedInput = userInput.next();
		
		System.out.println();
		
		
		if (unsanitizedInput.equalsIgnoreCase("0")) {
			state = 0;
		} else if (unsanitizedInput.equalsIgnoreCase("1")) {
			state = 1;
		} else if (unsanitizedInput.equalsIgnoreCase("2")) {
			state = 2;
		} else if ((unsanitizedInput.equalsIgnoreCase("!Q")) ||
			(unsanitizedInput.equalsIgnoreCase("q"))) {
				isProgramRunning = false;
		} else {
			
		}
		
	}
	
	public static void printEndStatement() {
		
		System.out.println("\nThe Radio Program Has Been Terminated!");
		
	}
	
	public static void printStartStatement() {
				
		System.out.println(
			"-------------\n" +
			"Radio Program\n" + 
			"-------------\n");
		
		System.out.println("The Radio Program Has Started!\n");
	}
	
	public static void printOptions() {
		
		System.out.println(
			"Options:\n" +
			"--------");
		calculateOptions();
	}
	
	public static void calculateOptions() {
		
		if (state == 0) {
			System.out.println(
				"1 - Turn On Radio\n" +
				"Q - Quit Program");
		} else if (state == 1) {
			System.out.println(
			"0 - Turn Off Radio\n" + 
			"1 - (Some Action)\n" + 
			"2 - (Another Action)\n" + 
			"3 - ...\n" +
			"4 - ...\n" + 
			"Q - Quit Program");
		}	
	}
}
