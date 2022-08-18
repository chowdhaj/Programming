/*
 * DEBUG THIS! Exercise - Drawing the Tic-Tac-Toe Board
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program uses the classes in the ticktactoe package to draw a Tic-Tac-Toe
 * board. Use these classes to write a program which draws these two boards
 * in one execution of the program.
 * 
 * NOTE: you will need to debug the main() method 
 *       and the draw() method in Board.java
 * 
 * 
 * PROGRAM OUTPUT:
 * 
  0 1 2
0  | | 
  -+-+-
1  | | 
  -+-+-
2  | | 

  0 1 2
0  | | 
  -+-+-
1  |X| 
  -+-+-
2 O| | 

 */

package lesson.activities.drawtictactoeboard;

public class DrawTicTacToeBoardRun {

    public static void main(String[] args) {
        Board ttt = new Board(); // Moved this line up // Added 'new' // Capitalized the 'b' in Board // Removed the 'draw'
        ttt.Draw(); // Added this
        ttt.Place(Marker.X, 1, 1); // Fixed arrangement of parameters
        ttt.Place(Marker.O, 2, 0); // Fixed arrangement of parameters // Changed '1 2' to '2 0'
        ttt.Draw();        
    }
}
