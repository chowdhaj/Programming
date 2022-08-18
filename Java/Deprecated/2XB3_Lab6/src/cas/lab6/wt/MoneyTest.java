/**
 * 
 */
package cas.lab6.wt;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jatin C.
 *
 */
public class MoneyTest {
	
	private Money f12CAD;
	private Money f14CAD;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//System.out.println("Initiating Testing...");
		f12CAD = new Money(12, "CAD");
		f14CAD = new Money(14, "CAD");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		//System.out.println("Finished Testing");
	}

	/**
	 * Test method for {@link cas.lab6.wt.Money#add(cas.lab6.wt.Money)}.
	 */
	@Test
	public void testAdd() {
		
		Money expected = new Money(26, "CAD");
		Money result = f12CAD.add(f14CAD);
		assertEquals(expected, result);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link cas.lab6.wt.Money#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		
		assertTrue(!(f12CAD.equals(null))); 
		assertEquals(f12CAD, f12CAD);
		assertEquals(f12CAD, new Money(12, "CAD"));
		assertTrue(!(f12CAD.equals(f14CAD)));
		
		//fail("Not yet implemented");
	}
}
