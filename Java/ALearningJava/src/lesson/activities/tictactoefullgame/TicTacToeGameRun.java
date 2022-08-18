/** Challenge Activity 2 - complete the Tic-Tac-Toe game!
 * 
 * It's time to complete the tic tac toe game. Here's what you must do:
 * 
 *  In Board.java:
 *  - Implement the Full() method to detect when the board has no more empty spaces.
 * 
 *  Write a fully functional Tic-Tac-Toe Game: 
 *  - Two players can play and have their own names
 *  - Player1 goes first and is 'X', and Player2 is '0'
 *  - Program must detect a win, loss, tie, etc.
 *  - Output should say who won
 *  - Try to break your code up in methods
 *  
 */

package lesson.activities.tictactoefullgame; // Location of our class file

import java.util.Scanner; // Imports the Scanner class
import lesson.activities.tictactoefullgame.*; // Imports the Board and Marker class files

public class TicTacToeGameRun {
	
    public static void main(String[] args) {
    	
    	System.out.print("Welcome To Console Tic-Tac-Toe\n\nFollow the instructions to learn how to play."); // Prints a welcome message to the console
    	System.out.print(" Look at the board [see below] and type where you want to place your marker in the format 'r c'"); // Prints out some instructions to console
    	System.out.print("\nSo something like this: '0 0' OR '1 1' OR '2 2'. The first number represents row, and the second represents column.\n"); // Prints out more instructions to console
    	
        Scanner sc = new Scanner(System.in); // Instantiates the Scanner
        Board b = new Board();  // Creates a new object of type Board called 'b'
        b.Draw(); // Calls the 'Draw()' method on 'b'
        String playerOne = ""; // Initializes playerOne string
    	String playerTwo = ""; // Initializes playerTwo string
    	
        System.out.print("Would you like to play? [Yes/No] "); // Asks user if they would like to play a game
        String answer = sc.nextLine(); // Stores input from user into 'answer'
        if (answer.toLowerCase().equals("yes")) { // If 'answer' [once converted to lower case] is equal to 'yes' then:
        	String[] names = assignNames(); // Creates a new array of type String called 'names' and calls the 'assignNames()' method to initialize it
        	playerOne = names[0]; // 'playerOne' gets the 0th element in array 'names'
        	playerTwo = names[1]; // 'playerTwo' gets the 1st element in array 'names'
        	System.out.printf("Nice to meet you, %s\nNice to meet you, %s\n", playerOne, playerTwo); // Prints out a greeting to console
        	playGame(playerOne, playerTwo); // Starts the game by calling the 'playGame()' method and passes 'playerOne' and 'playerTwo' as parameters
        } else { // If the user does not want to play
        	someOtherTime(); // Calls the 'someOtherTime()' method which prints out a farewell to console
        	//System.exit(0);
        }
        
        
    }

    // This method prints out a farewell to console if the user does not want to play a game
	private static void someOtherTime() {
		System.out.print("\nCome Back & Play Later!");
	}

	// This method asks the user's for their names and stores them in variables
	private static String[] assignNames() {
	    Scanner sc = new Scanner(System.in); // Initializes the Scanner
		String[] nameOfPlayers = {"Player Uno", "Player Deux"}; // Creates an array of Strings and stores values
		System.out.print("\nWhat is your name comrade? "); // Asks player one for their name
		nameOfPlayers[0] = sc.nextLine(); // Stores the name provided into the 0th element in 'nameOfPlayers'
		System.out.print("What is your friend's name? "); // Asks player two for his name
		nameOfPlayers[1] = sc.nextLine(); // Stores name provided into the 1st element of 'nameOfPlayers'
		return nameOfPlayers; // Returns the array 'nameOfPlayers'
	}
	
	private static String playGame(String playerOne, String playerTwo) {
		
		Scanner sc = new Scanner(System.in); // Initializes the Scanner
        Board b = new Board(); // Initializes the Board 
		
		System.out.printf("\nSince %s is Player One, he gets to go first!", playerOne); // Prints out who gets to go first
        int row = 0, column = 0, counterForStatus = 1; // Creates 3 variables of type ints
        while (true) { // Initiates a while loop
        	System.out.printf("\n[Step %d of 9] Okay, %s (%s), pick your spot! ==> ", counterForStatus, playerOne, Marker.X.toString()); // Asks player one to pick a spot
        	row = sc.nextInt(); // The first number entered is the row
        	column = sc.nextInt(); // The second number entered is the column
        	b.Place(Marker.X, row, column); // Places a marker on the row and column specified by user
        	b.Draw(); // Draws the board
        	counterForStatus++; // Increments our counter by 1
        	if (b.Winner(Marker.X)) { // Checks to see if 'X' is the winner, if true then:
        		System.out.printf("%s WINS!", playerOne); // Prints out text to console
    			break; // Breaks out of the loop
        	}
        	if (b.Full()) { // Checks to see if the board is full, if true then:
        		System.out.print("\nOH NOES! It's a TIE!"); // Prints out text to console
        		break; // Breaks out of the loop
        	}
        	System.out.printf("\n[Step %d of 9] Okay, %s (%s), pick your spot! ==> ", counterForStatus, playerTwo, Marker.O.toString()); // Asks player two to pick a spot
        	row = sc.nextInt(); // The first number entered is the row
        	column = sc.nextInt(); // The second number entered is the column
        	b.Place(Marker.O, row, column); // Places a marker on the row and column specified by user
        	b.Draw(); // Draws the board
        	counterForStatus++; // Increments our counter by 1
        	if (b.Winner(Marker.O)) { // If 'O' is winner then:
        		System.out.printf("%s WINS!", playerTwo); // Prints text to console
    			break; // Breaks out of the loop
        	}
        }
        return "Good"; // Returns a string // However this is of no merit because we have to return something as our method accepts parameters
	}
}

/*

This is the code for checking if the board is full:

	int boardCounter = 0;
    	for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 3; j ++) {
    			if (board[i][j] == Marker.EMPTY) {
    				boardCounter++;
    			}
    		}
    	}
        return (boardCounter == 0);

*/