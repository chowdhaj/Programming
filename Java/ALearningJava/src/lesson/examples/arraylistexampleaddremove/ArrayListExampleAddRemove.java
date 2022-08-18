/*
 * ArrayList Examples
 */

package lesson.examples.arraylistexampleaddremove; // Location of our class file

import java.util.ArrayList; // Imports the ArrayList class

public class ArrayListExampleAddRemove {

    public static void main(String[] args) {
    	
        ArrayList<Student> psy101 = new ArrayList<>(); // Creates an ArrayList of type object Student and calls it 'psy101'
        
        // Adds some students and their GPA's in the collection 'psy101'
        psy101.add(new Student("Bob",2.9));
        psy101.add(new Student("Dave",3.2));
        psy101.add(new Student("Sally",4.0));
        
        // The following demonstrates adding items to a collection // This can be extended to removing items as well
        printStudents(psy101); // Prints out 'psy101' to console
        Student tmp = psy101.remove(0); // Removes the 0th element from 'grades' // This removes "Bob" and his 2.9 GPA, but this information is now stored in 'Student tmp'
        printStudents(psy101); // Prints out 'psy101' to console // This list does not contain "Bob"
        psy101.add(tmp); // Adds "Bob" back in the collection, but he is now the 2nd element [last] in 'psy101'           
        printStudents(psy101); // Prints out 'psy101' to console and "Bob" is the last element
        psy101.add(new Student("Bill",3.7)); // Adds a new student, "Bill" to the collection and he is the 3rd element in the collection
        printStudents(psy101); // Prints out 'psy101' to console, 4 students' grades are printed
        
        // The following implements the swap pattern [switches elements in an array/collection]
        tmp = psy101.get(1); // Stores the 1st element in 'psy101' in a 'temporary' object called 'tmp'
        psy101.set(1, psy101.get(2)); // Replaces the 1st element in 'psy101' with the 2nd element in 'psy101' // This is where the swapping occurs [sort of]
        psy101.set(2, tmp); // The 2nd element in 'psy101' is now replaced by 'tmp'
        printStudents(psy101); // Prints out 'psy101' to console and the 1st and 2nd elements are swapped
    }
    
    // This method prints out the ArrayList that is passed as a parameter
    public static void printStudents(ArrayList<Student> al) {
        System.out.printf("Student\tGPA\n"); // Prints the titles of the header
        System.out.printf("-------\t-------\n"); // Prints a divider to console
        for(Student s : al) { // Can also be written as: for(int i=0;i< al.size();i++) {...}
            s.println(); // Prints the contents of 's' to console 
        }
        System.out.printf("\n"); // Adds a line
    }
}

/*

Here is a visual representation for the following line of code: 

	tmp = psy101.get(1); 
    psy101.set(1, psy101.get(2)); 
    psy101.set(2, tmp); 
    printStudents(psy101);

STEP 1

Dave	Sally	Bob		Bill
----	----	----	---- 
		  'psy101'

STEP 2

Dave	Sally	Bob		Bill 		Sally
----	----	----	----		----
		  'psy101'					tmp

STEP 3

Dave	Bob		Bob		Bill 		Sally
----	----	----	----		----
		  'psy101'					tmp

STEP 4

Dave	Bob		Sally	Bill 
----	----	----	----
		  'psy101'				

*/
