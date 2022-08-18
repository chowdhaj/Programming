/** Challenge Activity 3 - Reading and Writing Students from a file
 * 
 * In this activity, we will write code to use methods which read / write 
 * student object data to / from a file. It demonstrates the use of object
 * serialization.
 * 
 * The Load() and Save() methods of the Student class have been written for you.
 * You task is to write the main() method which should do the following:
 * 
 * 1. Create File object for "student.txt
 * 2. Create two Students s1 and s2
 * 3. get input from user Name & GPA for Student s1
 * 4. Write s1 to the file.
 * 5. Read into s2 from the file
 * 6. print out student s2
 * 7. ??????
 * 8. PROFIT!!!! :-)

EXAMPLE OUTPUT FROM RUN:
Enter Student Name ==> Bill Melator
Enter Student GPA  ==> 3.42
Writing to student.txt...
Reading from student.txt...
Student: Bill Melator	3.420000
 
*/

package lesson.activities.studentfileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import lesson.activities.lettergradeenums.Grade;

public class StudentFileIORun {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException { // These are the exception declaration
    	
    	// STEP 1: Instantiate the Scanner, create the File, and create objects [s1, s2]
    	Scanner sc = new Scanner(System.in);
    	File file = new File("student.txt");
    	Student s1 = new Student();
    	Student s2 = new Student();

    	// STEP 2: Ask user to input name and gpa, and assign input to 's1'
    	System.out.printf("Enter Student's Name ===> ");
    	String name = sc.nextLine();
    	s1.setName(name); // Assigns name entered by user [Name] to 's2'
    	
    	System.out.printf("Enter Student's GPA ==> ");
    	double gpa = sc.nextDouble();
    	s1.setGPA(gpa); // Assigns value entered by user [GPA] to 's1'
    	
    	// STEP 3: Save the file
    	System.out.printf("Writing to student.txt\n");
    	s1.Save(file); // Saves the contents of 's1' to 'file'
    
    	
    	// STEP 4: Read the file by loading it in 's2'
    	System.out.printf("Reading from student.txt\n");
    	s2.Load(file); // The contents of 'file' are loaded/stored into 's2'
    	System.out.printf("Student: %s\tGPA: %s", s2.getName(), s2.getGPA()); // Prints 's2' to console
    	
    }
    
}

/*

File file = new File("student.txt");
Scanner sc = new Scanner(System.in);

System.out.printf("Enter Student Name ==> "); // STEP ONE: ASK USER FOR INFORMATION
String name = sc.nextLine();

System.out.printf("Enter Student GPA  ==> ");
String gpa = sc.nextLine();

System.out.printf("Writing to student.txt\n"); // STEP TWO: WRITE TO FILE
FileOutputStream fo = new FileOutputStream(file);
ObjectOutputStream output = new ObjectOutputStream(fo);

output.writeObject(name);
output.writeObject(gpa);

output.close();
fo.close();

System.out.printf("Reading from student.txt\n"); // STEP THREE: READ FROM FILE

FileInputStream bo = new FileInputStream(file);
ObjectInputStream input = new ObjectInputStream(bo);

String newName = (String) input.readObject();
String newGPA = (String) input.readObject();

input.close();
bo.close();

System.out.printf("Student: %s\t%s\n", newName, newGPA); // STEP FOUR: PRINT TO CONSOLE

*/