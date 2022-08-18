package lesson.examples; // This class belongs in the package 'lesson', which is found inside the package 'examples'

import java.util.Scanner; // Imports the scanner class so we can take input from the user

public class InteractiveHello {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in); // Initializes the scanner to take input
        System.out.print("Enter your name ==> "); // Prints out a line, asking user to input their name
        String yourName = input.nextLine(); // Declares and initializes a variable of type string and assigns it a value of the users name
        System.out.printf("Hello, %s!!!!!\n", yourName); // Prints out 'Hello' followed by the user's name
        
        /*/
         * Printf is used to format the string/output
         * The %s is replaced by 'yourName'
         * The \n goes to the next line, similar to 'println'
        /*/
        
        // Below is an example of using 'printf'
        
        String greeting = "Greetings ";
        String firstName = "Harvey ";
        String lastName = "Specter";
        int x = 12;
        
        System.out.printf("%s%s%s!!!", greeting, firstName, lastName);
        
        // Each time there is a %s, a VARIABLE is expected
    }
}
