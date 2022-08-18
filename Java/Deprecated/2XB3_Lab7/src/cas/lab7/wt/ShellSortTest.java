/**
 * 
 */
package cas.lab7.wt;

import cas.lab7.wt.ShellSort;
import static org.junit.Assert.*;

import java.io.File;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jatin [TBE] Chowdhary
 *
 */

public class ShellSortTest {
	
	private static final int SIZE = 14;
	private static final int LENGTH = 11;
	
	private Comparable[][] lists;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		lists = new Comparable[SIZE][LENGTH];
		Scanner input = new Scanner(new File("data/input.txt"));
		while(input.hasNextDouble()) {
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < LENGTH; j++) {
					lists[i][j] = input.nextDouble();
				}
			}
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		//System.out.println("Testing Completed");
	}

	/**
	 * Test method for {@link cas.lab7.wt.ShellSort#isSorted(java.lang.Comparable[])}.
	 */
	@Test
	public void testIsSorted() {
		//fail("Not yet implemented");
		
		assertEquals(ShellSort.isSorted(lists[0]),  false);
		assertEquals(ShellSort.isSorted(lists[1]),  false);
		assertEquals(ShellSort.isSorted(lists[2]),  false);
		assertEquals(ShellSort.isSorted(lists[3]),  false);
		assertEquals(ShellSort.isSorted(lists[4]),  false);
		assertEquals(ShellSort.isSorted(lists[5]),  false);
		assertEquals(ShellSort.isSorted(lists[6]),  false);
		assertEquals(ShellSort.isSorted(lists[7]),  false);
		assertEquals(ShellSort.isSorted(lists[8]),  false);
		assertEquals(ShellSort.isSorted(lists[9]),  false);
		assertEquals(ShellSort.isSorted(lists[10]), false);
		assertEquals(ShellSort.isSorted(lists[11]), false);		
		assertEquals(ShellSort.isSorted(lists[12]), true);
		assertEquals(ShellSort.isSorted(lists[13]), true);
	}

	/**
	 * Test method for {@link cas.lab7.wt.ShellSort#sort(java.lang.Comparable[])}.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testSort() {
		//fail("Not yet implemented");
		
		ShellSort.sort(lists[0]);
		assertEquals(lists[0], new Comparable[] {0.0, 1.0, 1.0, 2.0, 3.0, 4.0, 4.0, 5.0, 6.0, 6.0, 6.0});
		
		ShellSort.sort(lists[1]);
		assertEquals(lists[1], new Comparable[] {1.0, 2.0, 2.0, 2.0, 4.0, 4.0, 4.0, 4.0, 6.0, 9.0, 9.0});
		
		ShellSort.sort(lists[2]);
		assertEquals(lists[2], new Comparable[] {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 9.0});
		
		ShellSort.sort(lists[3]);
		assertEquals(lists[3], new Comparable[] {0.0, 1.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0});
		
		ShellSort.sort(lists[4]);
		assertEquals(lists[4], new Comparable[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 2.0, 2.0});
		
		ShellSort.sort(lists[5]);
		assertEquals(lists[5], new Comparable[] {1.0, 1.0, 1.0, 3.0, 3.0, 5.0, 5.0, 7.0, 7.0, 9.0, 9.0});
		
		ShellSort.sort(lists[6]);
		assertEquals(lists[6], new Comparable[] {2.0, 2.0, 2.0, 4.0, 4.0, 4.0, 6.0, 6.0, 6.0, 8.0, 8.0});
		
		ShellSort.sort(lists[7]);
		assertEquals(lists[7], new Comparable[] {0.0, 111.0, 222.0, 333.0, 444.0, 555.0, 666.0, 777.0, 888.0, 999.0, 1000.0});
		
		ShellSort.sort(lists[8]);
		assertEquals(lists[8], new Comparable[] {0.0, 9.0, 111.0, 124.0, 555.0, 666.0, 777.0, 789.0, 888.0, 999.0, 9823.0});
		
		ShellSort.sort(lists[9]);
		assertEquals(lists[9], new Comparable[] {-70.0, -60.0, -55.0, -50.0, -50.0, -32.0, -2.0, 23.0, 23.0, 89.0, 89.0});
		
		ShellSort.sort(lists[10]);
		assertEquals(lists[10], new Comparable[] {-9.0, -8.0, -4.0, -3.0, -2.0, 1.0, 2.0, 3.0, 4.0, 7.0, 13.0});
		
		ShellSort.sort(lists[11]);
		assertEquals(lists[11], new Comparable[] {-4.0, -3.0, -2.0, -1.0, 1.0, 1.0, 2.0, 2.0, 3.0, 3.0, 8.0});
		
		ShellSort.sort(lists[12]);
		assertEquals(lists[12], new Comparable[] {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 9.0, 9.0});
		
		ShellSort.sort(lists[13]);
		assertEquals(lists[13], new Comparable[] {1.0, 1.0, 2.0, 2.0, 3.0, 3.0, 6.0, 6.0, 7.0, 7.0, 8.0});
	}

}

/*
	
	-------------------------------
	TESTING CODE FOR SHELLSORT.JAVA
	YOU CAN IGNORE THIS!
	-------------------------------

		final int SIZE = 12;
		final int LENGTH = 11;
		
		Comparable[][] lists = new Comparable[SIZE][LENGTH];
		Scanner input = new Scanner(new File("data/input.txt"));
		while(input.hasNextDouble()) {
			//System.out.println(input.nextDouble());
			for(int i = 0; i < SIZE; i++) {
				for (int j = 0; j < LENGTH; j++) {
					lists[i][j] = input.nextDouble();
					//System.out.println(lists[i][j]);
				}
				
			}
		}
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < LENGTH; j++) {
				System.out.print(lists[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.printf("\nIs {" + toString(lists[0]) + "} sorted?\nANS: %s", 
				isSorted(lists[0]) ? "YES" : "NOOO");
		
		System.exit(0);
		
		
		
		
		for (Comparable i : lists[0]) {
			System.out.println(i);
		}

*/ 