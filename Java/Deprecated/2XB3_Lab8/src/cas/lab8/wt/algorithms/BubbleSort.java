package cas.lab8.wt.algorithms;

public class BubbleSort {

	private static boolean less(Comparable v, Comparable w){ 
		return v.compareTo(w) <  0; 
	}
	
	private static void exch(Comparable[] a, int i, int j) { 
		Comparable t = a[i]; 
		a[i] = a[j]; 
		a[j] = t; 
	}
	
	public static void sort(Comparable[] num) {
		int j;
		boolean sorted = true; // set flag to true to begin first pass
		while(sorted) {
			sorted = false; // set flag to false awaiting a possible swap
			for(j = 0; j < num.length - 1; j++) {
				if(less(num[j+1],num[j])) { 
					exch(num, j , j + 1); 
					sorted = true; // shows a swap occurred
				}
			}
		}
	}
	
	public static boolean isSorted(Comparable[] a) { 
		// Test whether the array entries are in order.
		for(int i = 1; i < a.length; i++)
			if(less(a[i], a[i-1])) {
				return false; 
			}
		return true; 
	}	
	
	private static String toString(Comparable[] a) {
		String comString = "";
		for (int i = 0; i < a.length; i++) {
			comString += a[i];
			if (i != (a.length - 1)) {
				comString += ",";
			}
		}
		return comString;
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Comparable[] sortedList = {1,2,3,4,5};
		System.out.printf("Is {" + toString(sortedList) + "} sorted?\nANS: %s", 
				isSorted(sortedList) ? "YES" : "NOOO");
		
		Comparable[] unsortedList = {10,9,8,7,6,5,4,3,2,1,0};
		System.out.printf("\n\nIs [" + toString(unsortedList) + "] sorted?\nANS: %s",
				isSorted(unsortedList) ? "YES" : "NOOO");
		
		sort(unsortedList);
		System.out.println("\n\nOnce sorted, it is: " + toString(unsortedList));
		
		/*
		 * The JUnit for BubbleSort.java is almost identical to the 
		 * unit test for SelectionSort.java. 
		 */
		
	}
}
