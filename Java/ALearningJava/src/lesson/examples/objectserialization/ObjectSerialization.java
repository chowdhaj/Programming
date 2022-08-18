
package lesson.examples.objectserialization;

import java.io.*;
import java.util.ArrayList;

public class ObjectSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException { // Specifies that the main method might throw an exception when called
    	
        File file = new File("students.txt"); // Creates a new file called 'test.txt' // This is a text file and can be opened in notepad
        ArrayList<Student> students = new ArrayList<Student>(); // Creates an ArrayList of type Students called 'students'
        
        // Adds the name and grade of some students to our ArrayList 'students'
        students.add(new Student("Tom",3.921));
        students.add(new Student("Dave", 4.0));
        students.add(new Student("Bill",2.0));
        
        // The following code writes content to files in a binary format // Content is treated as binary instead of text // Serialize the collection of students
        FileOutputStream fo = new FileOutputStream(file); 
        ObjectOutputStream output = new ObjectOutputStream(fo);
        
        // This for loop writes the data into the file
        for ( Student s : students) {
            output.writeObject(s);
        }
        output.close();
        fo.close();
        
        FileInputStream is = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(is);

        // This try-catch block of code reads the contents of 'file' and prints it to console
        try {
            while(true) {
                    Student s = (Student)input.readObject();
                    System.out.println(s);
            }
        } catch (EOFException ex) { }        
    }
}
