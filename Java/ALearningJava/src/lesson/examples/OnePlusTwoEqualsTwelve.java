package lesson.examples; // Location of our 'OnePlusTwoEqualsTwelve' class file

public class OnePlusTwoEqualsTwelve {

    public static void main(String[] args) {
    	
        String x = "1"; // Variable = string | Name = 'x' | Assigned value = "1"
        String y = "2"; // Variable = string | Name = 'y' | Assigned value = "2"
        System.out.println(x + y); // Prints out the concatenation of string 'x' and 'y'. You would expect it to output 3 to console, but instead, it outputs 12
        
        String first = "Harvey "; // Variable = string | Name = 'first' | Holds "Harvey "
        String last = "Specter"; // Variable = string | Name = 'last' | Holds "Specter"
        System.out.println(first + last ); // Prints out "Harvey Specter" to console by concatenating string first and last together using the plus operator ( + )
        
        int i = Integer.parseInt(x); // Declares a variable of type int and assigns it a value of String x by casting it to an int type
        int j = Integer.parseInt(y); // Creates a variable named 'j of type int and gives it a value of String y by parsing it to int
        System.out.println(i + j); // Adds together int i and int j and prints it out to console. The output is 3, as expected
        
        String areYouHappy = "true"; // Variable = string | Name = 'areYouHappy' | Assigned value = "true"
        boolean ishappy = Boolean.parseBoolean(areYouHappy);  // Declares a variable of type boolean and names it 'isHappy', and assigns it a value of  (String) 'areYouHappy' by casting/converting it
        System.out.println(ishappy); // Prints out the variable 'isHappy' to console - prints out "true"
        
        String gpa = "3.96"; // Variable = string | Name = 'gpa' | Assigned value = "3.96"
        Double realgpa = Double.parseDouble(gpa); // Create a variable of type double, call it 'realgpa' and assign to a value of (String) 'gpa' - which is 3.96
        System.out.println(realgpa - 1.0 ); // Prints out 'realgpa' minus 1.0, which is 2.96 [3.96 - 1.0]
        // Double minus a double = double
    }
}
