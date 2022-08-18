package lesson.examples.enumeration;

/**
 * Enumerations are custom data types with their own distinct set of values.
 * They're akin to a class with constant, pre-defined set of objects.
 */

public enum Direction {
	
    North (0), South (180), East (90), West (270); // Creates the data type
    
    private final int degrees; // Creates a private integer of type int called 'degrees'
    
    // This is the constructor
    Direction(int degrees) {
        this.degrees = degrees;
    }
    
    // This returns the degrees for the direction
    public int Degrees() { 
    	return this.degrees; 
    }
}
