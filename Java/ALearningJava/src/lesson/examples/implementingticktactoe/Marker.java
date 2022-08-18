package lesson.examples.implementingticktactoe;

/**
 * An enumeration for the tic-tac-toe markers (X and O)
 * @author mafudge
 */

	// Creates a custom data type using enums // Data type is called 'Marker'
	public enum Marker {
    X('X'), O('O'), EMPTY(' '); // The three data types are: X, O, and EMPTY
	// X stores 'X' // O stores 'O' // EMPTY stores ' '
	
    private char ch; // Creates a private variable of type char called 'ch'

    // This is the constructor for the enums
    Marker(char ch) {
        this.ch = ch; 
    }
    
    // Returns the data type (ch) when called 
    public char toChar() {
        return this.ch;
    }
    
    @Override
    // This method converts the enums into a string
    public String toString() {
        return String.format("%c", this.ch);
    }
}
