/**
 * 
 */
package cas.lab7.wt;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import cas.lab7.wt.SelectionSort;

/**
 * @author Jatin [TBE] Chowdhary
 *
 */
public class SelectionSortTest {
	
	private Comparable[] unsortedNumbers;
	private Comparable[] sortedNumbers;
	private Comparable[] edgeCaseNum;
	private Comparable[] negativeNum;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		unsortedNumbers = new Comparable[] {5,4,3,2,1}; 
		sortedNumbers   = new Comparable[] {1,2,3,4,5};
		edgeCaseNum     = new Comparable[] {1,1,2,2,0};
		negativeNum     = new Comparable[] {-1,1,-2,2,0,-100,100,0};
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		//System.out.println("Done Testing...");
	}

	/**
	 * Test method for {@link cas.lab7.wt.SelectionSort#sort(java.lang.Comparable[])}.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testSort() {
		//fail("Not yet implemented");
		SelectionSort.sort(unsortedNumbers);
		assertEquals(unsortedNumbers, sortedNumbers);
		
		SelectionSort.sort(edgeCaseNum);
		assertEquals(edgeCaseNum, new Comparable[] {0,1,1,2,2});
		
		SelectionSort.sort(negativeNum);
		assertEquals(negativeNum, new Comparable[] {-100,-2,-1,0,0,1,2,100});	
	}

	/**
	 * Test method for {@link cas.lab7.wt.SelectionSort#isSorted(java.lang.Comparable[])}.
	 */
	@Test
	public void testIsSorted() {
		//fail("Not yet implemented");
		assertTrue(SelectionSort.isSorted(sortedNumbers));
		assertFalse(SelectionSort.isSorted(unsortedNumbers));
		assertFalse(SelectionSort.isSorted(edgeCaseNum));
		assertFalse(SelectionSort.isSorted(negativeNum));
	}

}
