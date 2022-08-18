/*  Student Information
 *  -------------------
 *  Student Name: Chowdhary, Jatin
 *  Student Number: 400033011
 *  Course Code: CS/SE 2XB3
 *  Lab Section: 02
 *  I attest that the following code being submitted is my own individual work. 
 */
package adt.set;

import adt.set.SetFunctions;

/**
 * @author Jatin [TBE] Chowdhary
 *
 */
public class Set {

	// Creates the instance variables for the ADT
	// The maximum size of the Array is 20
	// However, this can easily be changed in SetFunctions.java
	private String[] set = new String[SetFunctions.MAX_SIZE];
	
	// Method for constructor with no arguments
	// Creates the Empty Set
	public Set() {
		System.out.println("Empty Set Initialized");
	}

	// This constructor creates a set with values in it
	public Set(String[] setInput) {

		// Throws an exception if Set is to big
		if (SetFunctions.sizeTooBig(setInput)) {
			throw new IllegalArgumentException("SET CANNOT BE GREATER THAN " + SetFunctions.MAX_SIZE + " ELEMENTS!!!");
		}
		
		// Throws an exception if Set has non-unit string elements
		if (SetFunctions.hasBadElement(setInput)) {
			throw new IllegalArgumentException("SET CAN ONLY CONTAIN UNIT STRINGS!!!");
		}
		
		// Throws an exception if Set has duplicates
		if (SetFunctions.hasDupes(setInput)) {
			throw new IllegalArgumentException("SETS CANNOT HAVE DUPLICATES!!!");
		}
		
		// Copies the argument into Set
		this.set = setInput.clone();
	}
	
	// Adds an element to the Set
	private Set addElement(String a) { 
		
		// Checks if element is already in the Set
		// If it is then it returns the original Set
		if (SetFunctions.isInSet(a, this.set)) {
			System.out.println("The element '" + a +"' is IN the set:"+ this.toString()); // Prints out a message
			return this;
		} 
		
		// Checks if Set isn't full
		// If Set is full, then no element is added and the original Set is returned
		if (this.getCount() >= SetFunctions.MAX_SIZE) {
			System.out.println("There is no room in the set: " + this.toString()); // Prints message
			return this;
		}
		
		// Clones the set to a String array
		String[] addElemSet = this.set.clone();
		
		// Adds the element to the first available null spot
		for(int i = 0; i < addElemSet.length; i++) {
			if ((addElemSet[i]) == null) { // If the index at 'i' is null then replace it with element
				addElemSet[i] = a;
				break; // break out once element has been added
			}
		}
		
		// Returns a new Set with the added element - Does not modify the original Set
		return new Set(addElemSet);
	}
	
	// Deletes an element from the Set
	private Set deleteElement(String a) {
		
		// Checks to see if the element is NOT in the set
		// If element is NOT in the set, the original Set is returned and a message is printed
		if (SetFunctions.notInSet(a, this.set)) {
			System.out.println("The element '" + a +"' is NOT in the set:"+ this.toString()); // Prints message
			return this;
		}
		
		// Clones the Set to an Array
		String[] deleteElemSet = this.set.clone();
		
		// Iterates through the Array and finds the element to delete
		for(int i = 0; i < deleteElemSet.length; i++) {
			if (deleteElemSet[i].equals(a)) { 
				deleteElemSet[i] = null; // Deletes first occurance of the element by replacing it with null
				break;
			}
		}
		
		// Returns a new Set that does not contain the element
		// The original Set is untouched
		return new Set(deleteElemSet);
		
	}
	
	// Combines two sets together -> Takes the Union of two sets
	public Set union (Set other) {
		
		// Checks to make sure that the union does not exceed the maximum size limit
		if (SetFunctions.unionSizeCheck(this.set, other.set)) {
			// Throws error if it does
			throw new IllegalArgumentException("THE UNION OF THESE SETS IS TO BIG");
		}
		
		// Creates a new String array with size as Max limit 
		String[] uniSet = new String[SetFunctions.MAX_SIZE];
		//uniSet = this.set.clone(); // Clone shrinks the size of the set
			
		// Adds every non-null value from the first Set into the Array
		for(int i = 0; i < this.set.length; i++) {
			if (this.set[i] != null) { // If element is not null then append value to Array
				uniSet[i] = this.set[i];
			}
		}
	
		// Adds every unique non-null value from the second Set into the Array
 		for (int i = this.getCount(); i < uniSet.length; i++) {
			for (String os : other.set) {
				if (os != null) { // null values are ignored
				    if (SetFunctions.notInSet(os, uniSet)) { // If element is not in Array then add it
				    	uniSet[i] = os; 
				    }
				}
			}
		}
 		// Returns a new Set that is the Union of the other sets
		return new Set(uniSet);
	}
	
	// Calculates the intersection of two sets
	// Returns all elements that are IN both Sets
	public Set intersection(Set other) {
		int index = 0;
		//
		String[] interSet = new String[SetFunctions.MAX_SIZE];
		
		for(int i = 0; i < this.set.length; i++) { // Iterates through the first set
			if (set[i] != null) { // Ignore all null values
				if (SetFunctions.isInSet(set[i], other.set)) { // If an element is in both sets
					interSet[index] = set[i]; // Adds it to the Intersection array
					index++; // Increments Array counter
				}
			}
		}
		// Returns a Set that is the Intersection of the original Sets
		return new Set(interSet);
	}
	
	// Calculates the difference of two sets
	// Returns all elements in Set A that are NOT in Set B
	public Set difference(Set other) {
		int index = 0;
		String diffSet[] = new String[SetFunctions.MAX_SIZE];
		
		for(int i = 0; i < this.set.length; i++) { // Iterates through the first Set
			if (set[i] != null) { // ignores null values
				if (SetFunctions.notInSet(set[i], other.set)) { // If the element is not in the 2nd Set
					diffSet[index] = set[i]; // Add element to the Array
					index++; // Increment counter
				}
			}
		}
		// Returns a Set that is the difference of the original set
		return new Set(diffSet);
	}
	
	public String[][] product(Set other) {
		
		if ((this.set.length * other.set.length) >= (SetFunctions.PRODUCT_SIZE + 1)) {
			throw new IllegalStateException("THE CARTESIAN PRODUCT IS TO BIG!!!");
		}
		
		String[][] prod = new String[this.set.length * other.set.length][SetFunctions.COLUMN_SIZE];
		
		for(int i = 0; i < prod.length; i++) { }
		
		return prod;
	}
	
	// Calculates if two sets are equal to each other
	// Takes the subset of the sets and ensures their sizes are the same
	public boolean isEqual(Set other) {
		return (this.isSubset(other)  // setA is a subset of setB
				&& other.isSubset(this)) // AND setB is a subset of setA
				&& (this.getCount() == other.getCount()); // AND both sets are of the same length
	}
	
	// Calculates if a set is a subset of another
	// Subset = All values in setA are in setB
	public boolean isSubset(Set other) {
		boolean isSubset = false;
		for(int i = 0; i < this.set.length; i++) { // iterates through the first set
			for (String so : other.set) { // iterates through the second set
				if (so != null) { // ignores null values
					if (this.set[i].equals(so)) { // If the elements are equal
						isSubset = true;
						break;
					} else {
						isSubset = false;
					}
				}
			}
		}
		// Return result and checks to make sure setA is smaller than or equal to setB
		return isSubset && (this.getCount() <= other.getCount());
	}
	
	// Counts all non-null values in a Set and returns the counter
	public int getCount() {
		
		int count = 0;
		for(int c = 0; c < this.set.length; c++) { // iterates through the Set
			if (set[c] == null) { // ignores null values
				continue;
			} else {
				count++; // increment counter
			}
		}
		return count; // return counter
	}

	@Override
	public String toString() {
			
		String tempStr = ""; // temporary String that will hold the unfinished Set
		for(int i = 0; i < this.set.length; i++) { // iterates through the set
			if (this.set[i] == null) { // ignores null values
				continue;
			} else {
				tempStr += this.set[i]; // adds other values to the temp String
			}
		}
		
		String finalStr = "{"; // Opening brace of set
		for(int i = 0; i < tempStr.length(); i++) { // Iterates through the string and adds commas
			finalStr += tempStr.charAt(i) + ",";  // Adds commas after every element
		}
		
		if (finalStr.lastIndexOf(",") != -1) {  // Checks to see if String has a comma at the end
			finalStr = finalStr.substring(0, finalStr.lastIndexOf(",")); // Removes the comma at the end
		}
		return (finalStr + "}"); // Returns set and closing brace
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] empty_0 = {};
		String[] elem_11 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
		String[] elem_20 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"};
		String[] elem_21 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"};
		String[] elem_24 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] elem_04 = {"a", "b", "c"};
		String[] elem_05 = {"a", "b", "c", "5", "4", "d"};
		Set p = new Set();
		System.out.println(p);
		Set h = p.addElement("a");
		Set j = p.addElement("b");
		Set k = p.addElement("c");
		Set l = h.union(j).union(k); // Joins a,b,c into a Set
		System.out.println(l); // This set has a,b,c
		System.out.println(p); // This set is empty b/c Set is immutable
		p.deleteElement("c"); // Cannot delete 'c' b/c Set is empty
		System.out.println(p);
		System.out.println("");
		Set s = new Set(elem_11);
		Set t = new Set(elem_20);
		Set u = new Set(elem_04);
		Set v = new Set(elem_04);
		Set w = new Set(elem_05);
		Set x = new Set(elem_20);
		System.out.println(s.toString());
		System.out.println(s.getCount());
		System.out.println(s.isSubset(t));
		System.out.println(s.isEqual(t));
		//System.out.println(s.product(u)); // TODO
		System.out.println("");
		System.out.println(s.difference(u));
		System.out.println(v.difference(s));
		System.out.println(v.difference(w));
		System.out.println(w.difference(v));
		System.out.println(s.difference(u).difference(w.difference(v)));
		System.out.println("");
		System.out.println(s.intersection(u));
		System.out.println(v.intersection(u));
		System.out.println(w.intersection(s));
		System.out.println(s.intersection(u).intersection(v.intersection(u)));
		System.out.println("");
		System.out.println(s.union(u));
		System.out.println(s.union(w));
		System.out.println(v.union(w));
		Set vw = v.union(w);
		Set sw = s.union(w);
		System.out.println(vw.union(sw));		
	}
}


/*
 * THIS IS OLD CODE
 * YOU CAN IGNORE THIS

//	@Override
//	public String toString() {
//		String se = "{";
//		for(int i = 0; i < this.set.length; i++) {
//			if (set[i] == null) {
//				break;
//			} else {
//				se += set[i];
//				if (i != set.length - 1) {
//					se += ",";
//				}
//			}
//		}
//		se += "}";
//		return se;
//	}


// finalStr.substring(0, finalStr.length() - 1);


//		if (Tools.isEmpty(setInput)) {
//			throw new IllegalArgumentException("WRONG WAY TO CREATE EMPTY SET!!!");
//		}
 

//		for(int i = 0; i < diffSet.length; i++) {
//			System.out.print(diffSet[i] + " / ");
//		}
 
//		for (String strThis : this.set) {
//			if (Tools.notInSet(strThis, other.set)) {
//				diffSet[index] = strThis;
//				index++;
//			}
//		}
 

// 		for (int i = this.set.length; i < uniSet.length; i++) {
//			System.out.println(i + " --");
//			for (String os : other.set) {
//				if (os != null && Tools.notInSet(os, uniSet)) {
//					//System.out.println(i + " -- " + uniSet[i]);
//					uniSet[i] = os;
//				}
//			}
//		}
 
 
//		if ((this.set.length + other.set.length) > Tools.SIZE) {
//			throw new IllegalArgumentException("The Union Of These Sets Is To Big");
//		}
 
 		//System.out.println(vw);
		//System.out.println(sw);
		//System.out.println(x.union(w)); // Raises Union To Big Exception // Good stuff
		//System.out.println("\n\n\n");
		//System.out.println("this: " + this);
		//SetFunctions.printSingleArray(uniSet);
		//System.out.println("other:" + other);
		
		// USE PROPER GETCOUNT FUNCTION, DO NOT USE LENGTH!!!
		// ANYTIME U SEE this.set.length, replace with this.getCount()
		
		//System.out.println("!! " + this.set.length);
 
 */
