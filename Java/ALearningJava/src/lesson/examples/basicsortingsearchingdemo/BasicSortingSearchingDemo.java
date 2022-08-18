package lesson.examples.basicsortingsearchingdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class BasicSortingSearchingDemo {

    public static void main(String[] args) {
        
        Random generator = new Random(3); // Creates a new object of type Random called 'generator' and passes 3 as a seed
        int found = - 1; // Assigns -1 to an int named 'found'
        ArrayList<Integer> numbers = new ArrayList<>(); // Creates a new collection of type ArrayList that holds Integer objects and is called 'numbers'
        Comparator c = new IntegerComparator(); // Creates a new Comparator called 'c'
        for(int i = 0; i < 20; i++) { // Using a for loop, 20 numbers are randomly generated and stored in 'numbers'
            numbers.add(generator.nextInt(100 + 1));
        }
        
        System.out.println("UNSORTED"); // Prints text to console
        printNumbers(numbers); // Prints the 'numbers to console // The unsorted random numbers are printed to console
        found = find(numbers, 50); // Executes the 'find()' method and looks for 50 // If found, 'found' is assigned a number greater than 0, -1 otherwise
        System.out.printf("The number %d was %s\n", 50, found < 0 ? "not found" : "found"); // Prints out if the number was found or not
 
        System.out.println("\nSORTED"); // Prints next to console
        Collections.sort(numbers, c); // Sorts 'numbers' using the method in Collections
        //numbers = sort(numbers); // Utilizes the 'sort()' method below to sort 'numbers'
        printNumbers(numbers); // Prints the sorted numbers to console
        //int found = find(numbers, 50); // Utilizes the 'find()' method below to find a specific number in 'numbers'
        found = Collections.binarySearch(numbers, 50, c); // Finds the specified number using binary search found in Collections
        System.out.printf("The number %d was %s\n", 50, found < 0 ? "not found" : "found"); // Prints out to console if the number was found or not
    }
    
    
    /**
     * Enumerates the ArrayList, printing out the numbers
     * @param nums the ArrayList to print.
     */
    public static void printNumbers(ArrayList<Integer> nums) {
        for(int i = 0; i < nums.size(); i++) {
            System.out.printf("%d ", nums.get(i));
        }
        System.out.println();
    }
    
    
    /**
     * This code implements a linear search algorithm
     * @param a the ArrayList to search
     * @param target the value to find
     * @return Returns the index of the target in the ArrayList, otherwise -1
     */
    public static int find( ArrayList<Integer> a, Integer target) {
        int found = -1;
        for(int i = 0; i < a.size(); i++) {
            if (a.get(i)==target) {
                found = i;
                break;
            }
        }
        return found;
    }
    
    /**
     * This code implements a bubble sort algorithm
     * @param a ArrayList to sort
     * @return Sorted ArrayList
     */
    public static ArrayList<Integer> sort( ArrayList<Integer> a) {
        boolean swapped = false;
        int tmp =0;
        for(int i = 0; i <a.size(); i++) {
            swapped = false;
            for(int j = a.size() - 1; j > i ; j--) {
                if (a.get(j) < a.get(j - 1)) {
                    tmp = a.get(j);
                    a.set(j, a.get(j - 1));
                    a.set(j - 1, tmp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return a;
    }
}
