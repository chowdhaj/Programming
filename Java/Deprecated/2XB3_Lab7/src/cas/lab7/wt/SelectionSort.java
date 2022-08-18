package cas.lab7.wt;

public class SelectionSort {

	private static boolean less(Comparable v, Comparable w){ 
		return v.compareTo(w) <  0; 
	}
	
	private static void exch(Comparable[] a, int i, int j) { 
		Comparable t = a[i]; 
		a[i] = a[j]; 
		a[j] = t; 
	}
	
	public static void sort(Comparable[] a){ 
		// Sort a[] into increasing order.
		int N = a.length; // array length
		for(int i = 0; i < N; i++) { 
			// Exchange a[i] with smallest entry in a[i+1...N).
			int min = i; // index of minimal entr.
			for(int j = i + 1; j < N; j++)
				if(less(a[j], a[min])) {
					min = j;  
				}
			exch(a, i, min);
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
		 * * * * * * * * 
		 * WHILE LOOPS *
		 * * * * * * * *
		 * While loops can be replaced with For loops in selection sort. 
		 * The condition of the While Loop will be the same as the For
		 * Loop. i.e.: while (i < list.length) { code_goes_here }. 
		 * Also, the counter, 'i', will have to be initialized before
		 * the While Loop. The counter will be initialized to 0, same
		 * as the For Loop. The final thing to worry about is incrementing
		 * the counter. A For Loop takes care of it for you, but in a While
		 * Loop, you need to do it yourself. The trick is to increment
		 * the counter at the end of all the code, especially the
		 * If-Statements, especially in this particular case. DO NOT
		 * put the increment inside a conditional, because it may not be
		 * reached. 
		 * 
		 * * * * * * * * *
		 * JUNIT TESTING *
		 * * * * * * * * *
		 * The JUnit testing class is SelectionSortTest.java.
		 * It is in the cas.lab7.wt package.
		 * 
		 */
	}
}
