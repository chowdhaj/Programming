
package lesson.examples.sortingsearchstudentsusingcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingSearchingStudentsUsingComparator {

    public static void main(String[] args) {
    	
        // ArrayList are dynamic collections of objects (reference types only)
        ArrayList<Student> psy101 = new ArrayList<Student>();
        
        // Adds students to our ArrayList, 'psy101'
        psy101.add(new Student("Sally",4.0));
        psy101.add(new Student("Dave",3.6));
        psy101.add(new Student("Alice",3.15));
        
        System.out.println("UNSORTED LIST"); // Prints text to console 
        printStudents(psy101); // Prints out 'psy101' to console
        
        System.out.println("SORT BY NAME"); // Prints text to console
        Collections.sort(psy101, new StudentNameComparator()); // Sorts 'psy101' by name
        printStudents(psy101); // Prints 'psy101' to console
        
        System.out.println("SORT BY GPA"); // Prints text to console
        Collections.sort(psy101, new StudentGpaComparator()); // Sorts 'psy101' by GPA
        printStudents(psy101); // Prints 'psy101' to console 
        
    }
    
    // This method prints out the ArrayList that is passed as an argument to console
    public static void printStudents(ArrayList<Student> students) {
        System.out.printf("Student\tGPA\n");
        for( Student s : students) {
            System.out.printf("%s\n",s);
        }
        System.out.println();
    }
}
