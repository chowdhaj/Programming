package cas.lab8.wt.algorithms;

import java.io.FileNotFoundException;

public class ShellSort {

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static boolean isSorted(Comparable[] a) {
		// Test whether the array entries are in order.
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1])) {
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

	public static void sort(Comparable[] a) { // Sort a[] into increasing order.
		int N = a.length;
		int h = 1;
		while (h < N / 3)
			h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
		while (h >= 1) { // h-sort the array.
			for (int i = h; i < N; i++) { // Insert a[i] among a[i-h], a[i-2*h],
											// a[i-3*h]... .
				for (int j = i; j >= h && less(a[j], a[j - h]); j -= h)
					exch(a, j, j - h);
			}
			h = h / 3;
		}
	} // See page 245 for less(), exch(), isSorted(), and main().
	
	public static void main(String[] args) throws FileNotFoundException {
		
//		// TODO Auto-generated method stub
//		Comparable[] sortedList = {1,2,3,4,5};
//		System.out.printf("Is {" + toString(sortedList) + "} sorted?\nANS: %s", 
//				isSorted(sortedList) ? "YES" : "NOOO");
//		
//		Comparable[] unsortedList = {10,9,8,7,6,5,4,3,2,1,0};
//		System.out.printf("\n\nIs [" + toString(unsortedList) + "] sorted?\nANS: %s",
//				isSorted(unsortedList) ? "YES" : "NOOO");
//		
//		sort(unsortedList);
//		System.out.println("\n\nOnce sorted, it is: " + toString(unsortedList));
	}
}
