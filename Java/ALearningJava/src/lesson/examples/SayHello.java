package lesson.examples; // This means that the class is located in a package called 'examples', which is located in another package called 'lesson'

public class SayHello {
	
    public static void main(String[] args) {
        String yourName; // This initializes and declares a variable named 'yourName' of type String and puts it somewhere in memory  
        yourName = "Tony"; // Assigns the string "Tony" to our variable 'yourName' in memory
        System.out.printf("Hello, %s!!!\n", yourName); // Prints out "Hello, Tony!!!" to console
    }
}

// Take note of the '%s' in the last line above. It is replaced by 'yourName' when the program is run. This is because of 'printf'
