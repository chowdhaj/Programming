package lesson.examples; // Location of our class file

import java.util.ArrayList; // Imports the 'ArrayList' class from the package called 'util' in 'java'

public class ArrayListBasics {

    public static void main(String[] args) {

    	ArrayList<Integer> grades = new ArrayList<>(); // Creates a collection of type 'ArrayList' called 'grades' and it collects objects of type Integer
        
    	// Adds grades to our ArrayList, 'grades'
        grades.add(90); // Adds 90
        grades.add(85); // Adds 85
        grades.add(70); // Adds 70
        
        System.out.printf("First Grade : %d\n", grades.get(0)); // Prints out the 0th element in 'grades'
        System.out.printf("Second Grade : %d\n", grades.get(1)); // Prints out the 1st element in 'grades'
        System.out.printf("Third Grade : %d\n", grades.get(2)); // Prints out the 2nd element in 'grades'
        
        System.out.printf("\n"); // Functions as a spacer and adds a line
        
        for (int i = 0; i < grades.size(); i++) { // Enumerates the 'ArrayList
        	System.out.printf("Grade #%d = %d\n", i + 1, grades.get(i)); // Prints out every element in 'grades' starting from the 0th element
        }
        
        grades.remove(1); // Removes the 1st element in 'grades' // The 85 is removed
        
        System.out.printf("\n"); // Adds a line
        
        for (Integer i : grades) { // Enumerates 'grades' using an enhanced for loop
        	System.out.printf("Grade = %d\n", i, i); // Prints every element in 'grade'
        }
    }
}

/*

You can only remove elements in collections, not in arrays

 */

