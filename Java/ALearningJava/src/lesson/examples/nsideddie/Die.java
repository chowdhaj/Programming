package lesson.examples.nsideddie; // Location of our class file

import java.util.Random; // Imports the Random class

/**
 * Different sided die simulation
 */
public final class Die {
    
    private int sides; // Creates a private variable of type int called 'sides'
    private int value; // Initializes a private variable of type int called 'value'
    private Random generator; // Creates a private object of type Random and calls it 'generator'
       
    // This is the constructor // It's called when you instantiate the object 'Die' using the 'new' keyword // Requires 1 argument of type int
    public Die(int sides) {
        this.sides  = sides; // Sets the number of sides the die has
        this.generator = new Random(); // Generates a pseudo-random number
        this.roll(); // Calls the roll method
    }
    
    // This is method overloading // This constructor is called when you pass 2 arguments of type int
    public Die(int sides, int seed) {
        this.sides  = sides; // Sets the number of sides the die has
        this.generator = new Random(seed); // Generates a seeded-random number
        this.roll(); // Calls the roll method
    }
    
    // This method gets the number of sides on the die
    public int getSides() { return sides; }
    
    // This method changes the number of sides on the die
    public int setSides(int sides) {
        this.sides = sides;
        return sides;
    }
    
    // This method simulates a die roll // It generators a random number between 1 and the number of sides the die has
    public int roll() {
        value = generator.nextInt(sides) + 1;
        return value;
    }
    
    // Sets the value of the die to whatever is passed as an argument
    public int setValue(int value) {
    	this.value = value;
    	return value;
    }
    
    // Returns the current value of the die
    public int getValue() { return value; }
        
}
