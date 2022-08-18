package lesson.examples.implementingticktactoe;

public class ImplementingTickTacToeRun {

    public static void main(String[] args) {
        Board b = new Board(); // Creates a new object of type Board called 'b'
        b.Place(Marker.X, 0, 0); // Places an 'X' at [0,0]
        b.Place(Marker.O, 1, 0); // Places a 'Y' at [1,0]
        b.Place(Marker.X, 1, 1); // Places an 'X' at [1,1]
        b.Place(Marker.O, 2, 0); // Places a 'Y' at [2,0]
        b.Place(Marker.X, 2, 2); // Places an 'X' at [2,2]
        b.Place(Marker.O, 2, 1); // Places a 'Y' at [2,1]
        b.Draw(); // Draws the board
    }
}
