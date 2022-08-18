package lesson.examples;

import java.io.File; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {

    public static void main(String[] args) throws FileNotFoundException {
        
    	File file = new File("test.txt"); // Creates a new file called 'test.txt' // This is a text file and can be opened in notepad
        
    	// This block attempts to write to the file above
        try { // The try block: 
            PrintWriter output = new PrintWriter(file); // Creates a new object of type 'PrintWriter' called 'output' and writes in 'file' from above
            output.println("Testing"); // Writes in the text file
            output.println("123"); // Writes to text file
            output.close(); // Closes the file
        } catch (IOException ex) { // Catches an IO Exception
            System.out.printf("ERROR: %s!\n", ex);
        }
        
        // This block tries to read the file from above
        try {
            Scanner read = new Scanner(file); // Creates a new object of type Scanner called 'read' and opens the 'file' and reads from it
            String message1  = read.nextLine(); // Reads the first line of 'file' and assigns it to a string called 'message1'
            String message2  = read.nextLine(); // Reads the second line of 'file' and assigns it to a string called 'message2'
            System.out.println(message1); // Prints 'message1' to console
            System.out.println(message2); // Prints 'message2' to console
        } catch (FileNotFoundException ex) { // Catches an exception if the file, 'file' is not found
            System.out.printf("ERROR: %s!\n", ex);
        }
    }
}

/*

This program demonstrates basic file IO. It demonstrates how to create a file, write to it, save it, and then read from it

The code is commented to follow along the process seaminglessly

*/