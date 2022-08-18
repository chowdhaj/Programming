package cas.lab8.wt;

import java.util.Random;

import cas.lab8.wt.algorithms.SelectionSort;
import cas.lab8.wt.tools.Stopwatch;
import cas.lab8.wt.tools.PrintArray;

public class ExperimentsSort {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		boolean debug = false;
	
		Random ranInt = new Random();
		
		if (debug) {
			Integer newNumber = new Integer(ranInt.nextInt(10000)); 
			System.out.println(newNumber);
		}
		
		Integer[] testArray = {9,8,7,6,5,4,3,2,1,1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1,0};
		
		int[] size = {10, 100, 1000, 10000, 100000, 1000000, 10000000}; 
		int[] times = new int[7];
		
		int arrSize = size[6];
		Integer[] array = new Integer[arrSize];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = ranInt.nextInt(10000);
		}
		
		//PrintArray.printArray(array);
		
		Stopwatch timer = new Stopwatch(); 
		
		double startTime = timer.elapsedTime();
		//System.out.println(startTime);
		
		SelectionSort.sort(testArray);
		
		double endTime = timer.elapsedTime();
		//System.out.println(endTime);
		
		if (debug) PrintArray.printArray(testArray);
		
		double runTime = endTime - startTime;
		System.out.println("Total execution time: "+ runTime);
		
		double constant = 1.66 * Math.pow(10, -6);
		double formulaAns = constant * (arrSize * arrSize);
		System.out.println("T(" + arrSize + "): " + formulaAns);
		
	}
}
/*
------------------------------------------------------------------
TABLE 1 :: SELECTION SORT TIMES ON INTEGER ARRAYS OF VARYING SIZES
------------------------------------------------------------------
|    N (SIZE)   				|	  T(N) (RECORDED TIME (S))   |
------------------------------------------------------------------
|    10						    |          0.001
|    100						|          0.001
|    1000						|          0.001
|    10000						|          0.001
|    100000						|          0.001
|    1000000					|          0.001
|    10000000					|          0.002
------------------------------------------------------------------
 
 This experiment can be further improved by using different types of data. For example:
 	- Chars, doubles, floats
 	- Objects: Strings, etc.
 This is because sorting should not be limited to primitive data types. When dealing with
 large applications, data is often in the form of objects.
 
 The measurements for runtime all seem to be 0.001. This is incorrect because the computation
 takes longer than a few milliseconds. More research and debugging is required to figure
 out why this is occuring.  
 
 */
