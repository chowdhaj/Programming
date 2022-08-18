/**
 * 
 */
package main;

import java.util.Scanner;

import sections.Tutorial1;
import sections.Tutorial2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author chowdhaj
 *
 */
public class Selector {
	
	public static Scanner userInput = new Scanner(System.in);
	public static final boolean SIMPLE_OR_DETAILED_INSTRUCTIONS = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
        Random randInt = new Random();
		//Scanner loopInput = new Scanner(System.in);
		List<String> referenceList = new ArrayList<String>();
		
		printStartMessage();
		int option = getUserInput();
		if (exitDueToBadInput(option)) {
			System.exit(1);
		}
		
		referenceList = populateList(option);
        List<String> listOfNames = new ArrayList<>(referenceList);
		//int size = listOfNames.size();
		
		if (isListMalformed(referenceList)) {
			System.exit(2);
		}
		
		printSimpleInstruction(SIMPLE_OR_DETAILED_INSTRUCTIONS);
				
		// Loop through list of students
		while (true) {
			
			// Repopulate list of students
			if (listOfNames.isEmpty()) {
				listOfNames = new ArrayList<String>(referenceList);
			}
			
			printMoreInstructions(SIMPLE_OR_DETAILED_INSTRUCTIONS);
			
			if (userInput.nextLine().equalsIgnoreCase("!q")) {
				break; // Break if user input is "!q"
			} else {
				
				// Generate random number from 0 to size of list
				int randomPerson = randInt.nextInt(listOfNames.size());
				
				// Print random person
				System.out.println( ">>> " +
					listOfNames.get(randomPerson).toUpperCase() +
					" <<<\n");
				
				// Remove random person from list
				listOfNames.remove(randomPerson);
			}
			
		}
		
		userInput.close();
	}
	
	/**
	 * Print simple instructions, once, at the start of the loop
	 * 
	 * @param isPrintEnabled Boolean indicating whether simple
	 *        simple instructions should be printed or not
	 */
	public static void printSimpleInstruction(boolean isPrintEnabled) {
		
		if (!(isPrintEnabled)) {
			System.out.println("\nStart Pressing Enter!");
		}
	}
	
	/**
	 * Print more instructions at every iteration in the loop
	 *  
	 * @param isPrintEnabled Boolean indicating if instructions need to
	 *        be printed or not
	 */
	public static void printMoreInstructions(boolean isPrintEnabled) {
		
		if (isPrintEnabled) {
			System.out.println("Press <Enter> To Continue\n" + 
			    "\tOR\n" + "Type !Q To Exit");
		}
	}
	
	/**
	 * Checks if the list is bad, by checking if it is empty. If the
	 * list is empty, then an error has occurred
	 * 
	 * @param listOfNames The list to check 
	 * @return true if the list is empty; false otherwise
	 */
	public static Boolean isListMalformed(List<String> listOfNames) {
		
		if ((listOfNames.isEmpty()) || (listOfNames.size() == 0)) {
			System.out.println("There was a problem loading the list"
			    + "of names.");
			return true;
		}
		
		return false;
		
	}
	
	/**
	 * Adds all items from an array to the list
	 * 
	 * @param option Specifies which array to add
	 * @return The array as list object
	 */
	public static List<String> populateList(int option) {
		
		if (option == 1) {
			return Arrays.asList(Tutorial1.NAMES);
		}
		
		return Arrays.asList(Tutorial2.NAMES);
						
	}
	
	/**
	 * Checks if the input is not acceptable. The input must be an
	 * int that is 1 or 2
	 * 
	 * @param input The int to be checked
	 * @return true if the input satisfies the condition; false
	 *         otherwise
	 */
	public static Boolean exitDueToBadInput(int input) {
		
		if ((input == 1) || (input == 2)) {
			return false;
		}
		
		System.out.println("This number is not a valid option!");
		return true;
		
	}
	
	/**
	 * Gets user input from the console/terminal
	 * 
	 * @return An int corresponding to the user's input
	 */
	public static int getUserInput() {
		
		//Scanner optionInput = new Scanner(System.in);
		int option = 0;
	
		while(option == 0) {
			try {
				option = userInput.nextInt();
			} catch (Exception e) {
				System.out.print("Invalid entry try again!\n> ");
				//e.printStackTrace();
			}
			userInput.nextLine();
		}
		
		//userInput.close();
		
		return option;
		
	}
	
	/**
	 * Prints the start message (at the beginning)
	 */
	public static void printStartMessage() {
		
		System.out.println("Please select a tutorial section");
		printDivider();
		System.out.println(Tutorial1.SECTION);
		System.out.println(Tutorial2.SECTION);
		printDivider();
		System.out.print("> ");
		
	}
	
	/**
	 * Prints a divider (part of the start message)
	 */
	public static void printDivider() {
		System.out.println("--------------------------------");
	}

}
