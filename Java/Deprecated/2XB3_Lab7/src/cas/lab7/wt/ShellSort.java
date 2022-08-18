package cas.lab7.wt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
		 * Bogobogosort is a recursive implementation of bogosort that is more inefficient
		 *     and takes much more time. Both sorting algorithms are extremely inefficient,
		 *     slow and laggy, because they randomize the list and check to see if it is
		 *     sorted.
		 *         Reference: https://www.dangermouse.net/esoteric/bogobogosort.html
		 *     
		 * Brick sort is a sorting algorithm, related to bubble sort, developed for use on
		 *     parallel processors. It is also called odd-even sort, because it compares
		 *     the odd and even indexed pairs of adjacent elements in the list and, if a pair 
		 *     is in the wrong order (the first is larger than the second) the elements are 
		 *     switched. The next step repeats this for even/odd indexed pairs (of adjacent 
		 *     elements). Then it alternates between odd/even and even/odd steps until the 
		 *     list is sorted.
		 *         Reference: https://en.wikipedia.org/wiki/Odd%E2%80%93even_sort
		 *         
		 * Sorting in computer science is very popular, because it indexes lists, making them
		 *     easier to traverse and speeds up computational time in the long run. Being able
		 *     to sort a very large list is a key part of computer science. Companies are 
		 *     always finding ways to sort a list as quickly as possible. 
		 *     
		 * SelectionSort VS. BubbleSort VS. ShellSort [COMPARISONS]
		 * 
		 *                Best Case    Average Case   Worst Case    
		 * BubbleSort      O(n)           O(n^2)        O(n^2)         
		 * SelectionSort   O(n^2)         O(n^2)        O(n^2)
		 * ShellSort       O(n log n)                   O(n^2)
		 * 
		 * BubbleSort is the most inefficient algorithm, in this set
		 * ShellSort is the most efficient algorithm, in this set
		 * SelectionSort is in between the two.
		 * 
		 * References: 
		 * 		https://en.wikipedia.org/wiki/Selection_sort
		 * 		https://en.wikipedia.org/wiki/Bubble_sort
		 * 		https://en.wikipedia.org/wiki/Shellsort
		 */
	}
}