
package lesson.examples.enumeration;

public class EnumerationsRun {

    public static void main(String[] args) {
    	
        // This program demos the use of Enumerations [Enums] in Java
    	
    	Direction d = Direction.North; // Creates a new object of type 'Direction' calls it 'd' and it gets the Enum 'North'
        
        System.out.printf("%s is at %d degrees.\n",d,d.Degrees()); // Prints out 'North' along with its corresponding degrees [0]
        
        System.out.printf("%s is at %d degrees.\n",Direction.East,Direction.East.Degrees()); // Prints out 'East' along with its corresponding degrees [90]
        
        System.out.printf("%s is at %d degrees. \n", Direction.South, Direction.South.Degrees()); // Prints out 'South' with degrees
    }
}
