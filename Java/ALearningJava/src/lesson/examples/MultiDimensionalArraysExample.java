
/*
 * This demonstrates multi-dimensional arrays in Java.
 * These structures are useful for representing real-world structures such
 * as game-boards and maps.
 */

package lesson.examples; // Location of our class file

public class MultiDimensionalArraysExample {
	
/* 	

Tic Tac Toe Board
	
	0   1   2
	-----------
0  | X |    |    |
   | --+---+-- |
 1  |   | X | 0 |
   | --+---+-- |
2  | X |   | 0 |
    -----------
    
*/

    public static void main(String[] args) {
    	
        char[][] board = new char[3][3]; // Creates a multidimensional array [2D] of type char called 'board'
        board[0][0] = 'X'; // The 0th row of the 0th column of 'board' gets X
        board[1][2] = 'O'; // The 1st row of the 2nd column of 'board' gets O   
        board[2][0] = 'X'; // The 2nd row of the 0th column of 'board' gets X
        board[2][2] = 'O'; // The 2nd row of the 2nd column of 'board' gets 0
        board[1][1] = 'X'; // The 1st row of the 1st column of 'board' gets X
        // Refer to the Tic Tac Toe Board above to get a visual idea of the code above
        
        for (int i = 0; i < 3; i++) { // This 'for loop' iterates the rows of our 2D array 'board'
            for (int j = 0; j < 3; j++) { // This iterates the columns of our 2D array 'board'
                    System.out.printf("[%d][%d] = %s ",i,j,board[i][j]); // Prints out the values 'board' holds 
            }
            System.out.printf("\n"); // Adds a line
        }
        
        System.out.println("\n"); // Adds two lines
        
        char[][] t3Board = new char[3][3]; // Creates a multidimensional array [2D] of type char called 't3Board'
        // Assign 'X' to specific indices in 't3Board'
        t3Board[0][0] = 'X';
        t3Board[1][1] = 'X';
        t3Board[2][2] = 'X';
        
        // Iterates the rows and columns of 't3Board'
        for (int x = 0; x < 3; x++) {
        	for (int y = 0; y < 3; y++) {
        		System.out.printf("[%d][%d] = %s   ", x, y, t3Board[x][y]); // Prints out the values 't3Board' holds 
        	}
        	System.out.println(""); // Adds a line
        }
    }
}

/*

The output of 't3Board' is: 

[0][0] = X [0][1] =    [0][2] =  
[1][0] =    [1][1] = X [1][2] =  
[2][0] =    [2][1] =    [2][2] = X

This looks looks like a TicTacToe Board if you visualize it like this:

	0   1   2
	-----------
0  | X |    |    |
   | --+---+-- |
 1  |   | X |   |
   | --+---+-- |
2  |   |   | X |
    -----------
    
You need a nested for loop to iterate over a multi-dimensional board

*/
