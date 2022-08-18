package lesson.examples.implementingticktactoe;

/**
 * Tic-Tac-Toe Board
 * @author mafudge
 */
public class Board {
    
    private Marker[][] board; // Creates a private array of type Marker, called 'board'
    
    /**
     * Initializes a new Tic-Tac-Toe board (which is a 2-d array 
     * of Markers (X, O, or EMPTY)
     */
    public Board(){ // This is the default constructor and creates a 2D array which is our TicTacToe Board
        board = new Marker[3][3];
        this.Clear(); // Calls the 'Clear' method on the board
    }
    
    /**
     * Initializes a new Tic-Tac-Toe board using the given array 
     * @param board the 2d array for the board
     */
    public Board(Marker[][] board) { // This is the overloaded constructor and creates an X * Y array where X, and Y are specified by the user [used when you don't want to load an empty board]
        this.board = board;
    }
    
    /**
     * Erases the board, called with the constructor of the class.
     */
    public final void Clear() { // This method erases/clears the entire TicTacToe board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Marker.EMPTY; // Replaces all indices in array with ' '
            }           
        }
    }
    
    /**
     * Draws the current state of the board to System.out
     */
    public void Draw() {
        System.out.printf("\n  0 1 2\n"); // Prints out the numbers on the top
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ",i); // Prints out the numbers on the side
            for (int j = 0; j < 3; j++) {
                if (j < 2) {
                    System.out.printf("%s|", board[i][j]); // Prints the 0th and 1st column of the TicTacToeBoard
                } else {
                    System.out.printf("%s", board[i][j]); // Prints the 2nd column of the TicTacToe board       
                }
            }
            System.out.printf("\n"); // Makes cursor go to the next line [ensures the dividers align properly]
            if (i < 2) System.out.printf("  -+-+-\n"); // Prints the dividers
        }
    }
    
    /**
     * Places the marker on the board at position row and column
     * @param marker the marker to place (X or O)
     * @param row the row (0, 1 or 2)
     * @param column the column (0,1 or 2)
     * @return true if the marker was placed
     */
    public boolean Place(Marker marker, int row, int column) { // This method places a Marker at the specified location
        if (this.board[row][column] == Marker.EMPTY) { // A Marker is only placed if the location is unoccupied
            this.board[row][column] = marker;
            return true;
        } else {
            return false;
        }
    }    
    
}
