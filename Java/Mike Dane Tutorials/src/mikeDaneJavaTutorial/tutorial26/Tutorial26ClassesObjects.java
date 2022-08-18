/*
 * * * * *
 * NOTES *
 * * * * * 
 * A class allows you to model a real world attribute inside
 *     of your program
 * Classes allow you to create a custom data type, such as a
 *     real world object
 * Classes in Java should start with a capital letter
 * Attributes are used to define an object
 * An Object is an Instance of a class; it has values
 * A Class is a blueprint for an object. The attributes define
 *     the object
 */

// Classes & Objects
package mikeDaneJavaTutorial.tutorial26;

public class Tutorial26ClassesObjects {
	
	public static void main(String[] args) {
		
		// Creates a new Student Object
		Student myStudent = new Student();
		myStudent.firstName = "Jim"; // student 1 first name
		myStudent.lastName = "Brown"; // student 1 last name
		myStudent.major = "Business"; // student 1 major
		myStudent.gpa = 2.5; // student 1 gpa
		myStudent.age = 24; // student 1 age
		myStudent.onProbation = true; // student 1 is not on probation
		
		// Prints out student 1's first name
		System.out.println(myStudent.firstName);
		// Prints out student 1's last name
		System.out.println(myStudent.lastName);
		
		// Creates another Student Object
		Student myStudent2 = new Student();
		myStudent2.firstName = "Pam"; // student 2 first name
		myStudent2.lastName = "Beasley"; // student 2 last name
		myStudent2.major = "Art"; // student 2 major
		myStudent2.gpa = 3.5; // student 2 gpa
		myStudent2.age = 17; // student 2 age
		myStudent2.onProbation = false; // student 2 is on probation
		
		System.out.println(); // Prints a newline
		
		// Prints out student 2's information
		System.out.println("First Name   : " + myStudent2.firstName + "\n" +
				           "Last Name    : " + myStudent2.lastName  + "\n" +
				           "Age          : " + myStudent2.age       + "\n" +
				           "Majoring In  : " + myStudent2.major     + "\n" +
				           "Current GPA  : " + myStudent2.gpa       + "\n" +
				           "On Probation : " + myStudent2.onProbation);
	}
}