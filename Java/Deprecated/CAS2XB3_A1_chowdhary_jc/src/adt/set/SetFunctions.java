/*  Student Information
 *  -------------------
 *  Student Name: Chowdhary, Jatin
 *  Student Number: 400033011
 *  Course Code: CS/SE 2XB3
 *  Lab Section: 02
 *  I attest that the following code being submitted is my own individual work. 
 */
package adt.set;

/**
 * @author Jatin [TBE] Chowdhary
 *
 */
public class SetFunctions {

	// Max size of the set. This can easily be changed and the ADT will work flawlessly
	public static final int MAX_SIZE = 20;
	// Max number of elements in the Product set
	public static final int PRODUCT_SIZE = MAX_SIZE * 2;
	public static final int COLUMN_SIZE = 2;
	
	// Checks if the size of the Set is to big by comparing it to Max Size
	public static boolean sizeTooBig(String[] setSize) {
		if (setSize.length <= MAX_SIZE) {
			return false;
		}
		// If Set is to big then return true and an error can be thrown
		return true;
	}

	// Checks Set for bad elements like non-unit Strings
	public static boolean hasBadElement(String[] setElements) {
		for (String s : setElements) { // Iterates the string array
			if (s == null) { // null values are acceptable
				return false;
			} else if (s.length() == 1) { // checks length of string 
				return false;
			} else {
				return true;
			}
		}
		return true;
	}
	
	// Checks Set if it is empty or not
	public static boolean isEmpty(String[] emptySet) {
		for(int i = 0; i < emptySet.length; i++) { // Iterates through the string array
			if (emptySet[i] != null) { // If it finds a non-null value, set is not empty and return false
				return false;
			}
		}
		return true;
	}
	
	// Checks Set for duplicates
	public static boolean hasDupes(String[] checkDuplicates) {
		boolean hasDupes = false;
		for(int i = 0; i < checkDuplicates.length; i++) { // Iterates through string array
			if (checkDuplicates[i] == null) { // null values are ignored
				break;
			}
			for(int j = i + 1; j < checkDuplicates.length; j++) { // checks the i'th element with every element after it
				if (checkDuplicates[i].equals(checkDuplicates[j])) { // if the two elements are equal then return true
					hasDupes = true;
				}
			}
		}
		return hasDupes;
	}
	
	// Checks to see if a string is NOT in a String array; which is the Set
	public static boolean notInSet(String s1, String[] s2) {
		boolean doesNotContain = true;
		for(int i = 0; i < s2.length; i++) { 
			if (s1.equals(s2[i])) { // If the string equals any element in the array then return false
				return false;
			}
		}
		return doesNotContain;
	}
	
	// Checks to see if a String IS in a String array, which is the Set
	public static boolean isInSet(String s1, String[] s2) {
		boolean doesContain = false;
		for (int i = 0; i < s2.length; i ++) {
			if (s1.equals(s2[i])) { // If the string equals any element in the array then return True
				return true;
			}
		}
		return doesContain;
	}
	
	// This function checks to make sure that the union of two sets does not exceed the maximum length
	public static boolean unionSizeCheck(String[] a, String[] b) {
		
		// This counter will track all unique elements in both sets
		int numberOfUniqueElements = 0;
		
		// All non-null values in Set A are unique and added to the counter
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				numberOfUniqueElements++;
			}
		}
		
		// All values in Set B are checked against Set A
		for (int i = 0; i < b.length; i++) {
			if (b[i] != null) { // Ignores null values
				if (notInSet(b[i], a)) { // If an element in B is NOT in A
					numberOfUniqueElements++; // Increase uniqueElement counter
				}
			}
		}
		// If number of unique elements exceeds maximum length, then return false
		return ((numberOfUniqueElements > MAX_SIZE) ? true : false); 
	}
	
	// Prints a One-Dimensional String array in the form of a set
	public static void printSingleArray(String[] arr) {
		System.out.print("{");
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != null) { // Ignores null values
				System.out.print(arr[i] + ",");
			}
		}
		System.out.print("}\n");
	}
	
}

/*
		THIS IS OLD CODE.
		YOU CAN IGNORE THIS.

	public static void printMultiArray(String[][] arr) {
		System.out.print("{");
		// TODO
		System.out.print("}");
	}
	
*/