package lesson.examples;

public class UnderstandingTypeCasting {

    public static void main(String[] args) {
    	
    	// This program will help explain casting // Read the comments thoroughly and carefully
    	
    	int x = 20; // Variable type = int // Name = 'x' // Stores a value of 20
        int y = 15; // Variable type = int // Name = 'y' // Stores a value of 15
        
        // Variable type = int // Name = 'i' 
        int i = x / y; // Stores 'x / y' = 20/15, which is 1 because an int divided by an int yields an int and ints cannot store floating point values    

        // Variable type = double // Name = 'd1'
        double d1 = x / y; // Does NOT store 1.33333 because (int / int == int) and yields 1, which is casted to double and is converted to 1.0

        // IMPLICIT TYPE CASTING
        double d2 =  x / (y * 1.0); // Variable type = double // Name = 'd2' // Stores a value of 1.3333333... 
        // double d2 is able to store the decimal because 'y' is being multiplied by 1.0. When this happens, Java automatically converts 'y' from ...
        // ... an int to a double. Now, we have int x divided by double y, and Java automatically converts 'x' to a double. So the calculation looks like ...
        // ... this: 20.0 / 15.0, which equals 1.3333333... 
        // In short, int * double = double && int / double = double
                
        // EXPLICIT TYPE CASTING
        double d3 = x / (double) y; // Variable type = double // Name = 'd3' // Stores a value of 1.333333....
        // double d3 is able to store a value of 1.33333... because before 'x' is divided by 'y', 'y' is converted from an int to a double, because of ...
        // ... the keyword 'double' that precedes 'y'. It's value changes from 15 to 15.0. Then, 'x' (an int) is divided by 'y' (a double), and when this ...
        // ... happens, Java automatically converts 'x' to a double too. Finally, Java divides 15.0 by 20.0 and stores the answer (1.3333...) in 'd3'
        // In short, int / double = double and don't forget to use the keyword 'double' to explicitly cast an int to a double
        
        
        System.out.println(i); // Prints out 1 to console because int 20 / int 15 = 1 because ints cannot store floating point values
        System.out.println(d1); // Prints out 1.0 to console because 20 / 15 = 1, and 1 is converted to 1.0 when stored in a double
        System.out.println(d2); // Prints out 1.3333... to console because 20.0 / 15.0 = 1.3333....
        System.out.println(d3); // Prints out 1.3333... to console because 20.0 / 15.0 = 1.3333....
    }
}

/*
								NOTES
								
An int divided by an int will yield an int, similar to double / double = double

You can convert types by implicit type casting or explicit type casting

Implicit Type Casting: When you don't tell Java to convert types. i.e.:
double d = x / (y * 1.0); // Java automatically converts y to a double when divided by 1.0

Explicit Type Casting: When you tell Java to convert types. i.e. 
double d = x / (double) y // Java converts y to a double because of the keyword 'double' preceding it


*/
