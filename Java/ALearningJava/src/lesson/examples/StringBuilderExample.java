package lesson.examples; // Location of our 'StringBuilderExample' class

//import java.lang.StringBuilder; // You do not need to import it because it is already included similar to the Math class

public class StringBuilderExample {

    public static void main(String[] args) {
    	
    	// How To Use The StringBuilder Class //
  
    	String test = ("Testing 123"); // Variable type = String // Name = 'test' // Stores "Testing 123"
    	StringBuilder sb = new StringBuilder(); // Creates an object of type StringBuilder called 'sb'
        sb.append(test); // Converts the string 'test' into a StringBuilder type
        String forward = sb.toString(); // Variable type = String // Name = 'forward' // Value assigned = 'sb' converted from a StringBuilder to String
        String reverse = sb.reverse().toString(); // Variable type = String // Name = 'reverse' // Value assigned = 'sb' reversed and then converted to String
        System.out.println(forward); // Prints out the variable 'forward' to console
        System.out.println(reverse); // Outputs 'reverse' to console
        
        
       
    }
}

/*

 										*** NOTES ON STRINGBUILDER ***

* You must first convert the text from type String to object StringBuilder before you can do anything to it. i.e.: 
sb.append(test); // This converts the String 'test' to a StringBuilder object and stores it in 'sb'

* Appending more strings to 'sb' continues to add on to it, NOT replace the current string. i.e.:

sb.append("Test");
sb.append(" Was Hard");
// This will print out "Test Was Hard" to console, NOT " Was Hard"

* Instead of converting 'sb' to type String, you can directly print the output to console like this. i.e.:

System.out.println(sb);
System.out.println(sb.reverse());

* You can turn this line:

String reverse = sb.reverse().toString();

* Into these lines:

StringBuilder reverseSB = sb.reverse(); // Object type = StringBuilder // Name = 'reverseSB' // Holds the object 'sb' BUT reversed 
String reverse = reverseSB.toString(); // Variable type = String // Name = 'forward' // Stores the object 'reverseSB' AFTER it is converted to a string

*/
