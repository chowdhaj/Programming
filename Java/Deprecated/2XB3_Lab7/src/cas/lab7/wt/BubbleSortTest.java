/**
 * 
 */
package cas.lab7.wt;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jatin [TBE] Chowdhary
 *
 */
public class BubbleSortTest {
	
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
		// 
	}

	/**
	 * Test method for {@link cas.lab7.wt.BubbleSort#sort(java.lang.Comparable[])}.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testSort() {
		//fail("Not yet implemented");
		BubbleSort.sort(unsortedNumbers);
		assertEquals(unsortedNumbers, sortedNumbers);
		
		BubbleSort.sort(edgeCaseNum);
		assertEquals(edgeCaseNum, new Comparable[] {0,1,1,2,2});
		
		BubbleSort.sort(negativeNum);
		assertEquals(negativeNum, new Comparable[] {-100,-2,-1,0,0,1,2,100});
	}

	/**
	 * Test method for {@link cas.lab7.wt.BubbleSort#isSorted(java.lang.Comparable[])}.
	 */
	@Test
	public void testIsSorted() {
		//fail("Not yet implemented");
		assertTrue(BubbleSort.isSorted(sortedNumbers));
		assertFalse(BubbleSort.isSorted(unsortedNumbers));
		assertFalse(BubbleSort.isSorted(edgeCaseNum));
		assertFalse(BubbleSort.isSorted(negativeNum));
	}

}
