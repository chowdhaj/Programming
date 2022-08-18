package lesson.examples; // Class is located inside a package named 'lesson' and 'lesson' is inside a package named 'examples'

public class CommonDataTypes {

    /** 
     * This program demonstrates common variable type usage and
     * how to format output of variables.
     */
	
    public static void main(String[] args) {
        String studentName = "Jam Jam"; // Declare and initialize a variable of type String called 'studentName' and store "Jam Jam" inside of it
        int age = 22; // Declare and initialize a variable of type int called 'age' and have it hold 22
        double gpa = 3.75; // Declare and initialize a variable of type double called 'gpa' and have it hold 3.75
        boolean isFemale = false; // A boolean named 'isFemale' is declared/initialized, and is set to false
        
        // This prints out all the information from above into the console and nicely formats it like this: NAME is AGE years old. HE has a gpa of GPA
        System.out.printf("%s is %d years old. %s has a gpa of %4.3f.\n", // %s = String, %d = double, %f = floating point values (i.e. doubles)
                studentName,
                age,
                (isFemale ? "She" : "He"), // This is the ternary operator and evaluates an binary expression
                gpa);
    }
}

/*/
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * THE CODE BELOW CALCULATES THE GREATER NUMBER USING THE TERNARY OPERATOR *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 	int a = 10, b = 12;													   *
 * 	int greater = ( a > b ) ? a : b;									   *
 * 	System.out.println(greater);				 						   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * THE CODE BELOW OUTPUTS A YES OR A NO BASED ON THE BOOLEAN VARIABLE	   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 	boolean needsSleep = false;											   *
 * 	String ans = (needsSleep ? "Yes" : "No");							   *
 * 	System.out.println(ans);											   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 
/*/