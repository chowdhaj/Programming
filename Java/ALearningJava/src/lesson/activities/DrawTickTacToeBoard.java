
/* Challenge Activity 2
 * Write a java program which uses System.out to draw this tic-tac-toe board:
 * 
 *     |   |
 *   X | X | O
 *  ---+---+---
 *   O | O |    
 *  ---+---+---
 *   X |   |   
 *     |   |
 */
package lesson.activities;

public class DrawTickTacToeBoard {

    public static void main(String[] args) {

    	// The following lines of code prints out a Tick-Tac-Toe Board like above 
    	firstLines(); // System.out.println("   |   |");
    	System.out.println(" X | X | O");
    	secondlines(); // System.out.println("---+---+---");
    	System.out.println(" O | O |");
    	secondlines(); // System.out.println("---+---+---");
    	System.out.println(" X |   |");
    	firstLines(); // System.out.println("   |   |");
    }
    
    // Creates a method called 'firstLines()'
    public static void firstLines() {
    	System.out.println("   |   |");
    }
    
    // Creates a method called 'secondLines()'
    public static void secondlines() {
    	System.out.println("---+---+---");
    }
}

/*
 * Our additional methods are static and void
 * This means that they do not return anything and they do not need to be instantiated or declared to be created
 * When called upon, the code inside the method executes and done
 */
