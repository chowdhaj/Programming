/*
 * ArrayList Example - basic creation and enumeration
 */

package lesson.examples.arraylistexample;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
    	// Creates an ArrayList of type 'Students' and calls/refers to it by 'psy101'
        ArrayList<Student> psy101 = new ArrayList<Student>();
        
        // Adds students and their respective GPA to our ArrayList 'psy101'
        psy101.add(new Student("Bob",2.9));
        psy101.add(new Student("Dave",3.2));
        psy101.add(new Student("Sally",4.0));
        psy101.add(new Student("Alice",3.15));
        
        System.out.printf("Student\tGPA\n"); // Prints out the top of the table to console 
        
        // The following is a different way to write a for loop when you have a collection - it is neater and cleaner
        for( Student s : psy101) { // For each Student which is called 's' in the collection 'psy101', do the following:
            System.out.printf("%s\n",s); // Prints out 's' to console
        }
        
        System.out.println(); // Prints a line
        
        // This for loop does the exact same thing as the one above it, it prints out the name and GPA stored in 'psy101' // However it does not enumerate, but indexes
        System.out.printf("Student\tGPA\n"); // Prints a header to console
        for(int i = 0; i < psy101.size(); i++) { // As long as 'i' is less than the size of 'psy101' print out the elements in 'psy101' and increment 'i'
            System.out.printf("%s\n",psy101.get(i)); // Prints out the i(th) element in 'psy101', then 'i' gets incremented by 1
        }           
    }
}

/*

Enhanced for loop iterates an array in an effective manner. The enhanced for loop was made to iterate an array. 

		It replaces this: 

for (int i = 0; i < grades.size(); i++) {

		To this:

for (Integer i : grades) {

*/