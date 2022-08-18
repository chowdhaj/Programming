package src;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Jatin Chowdhary
 * @brief JUnit Testing For PointT ADT
 */
public class TestPointT {
	
	PointT test1 = new PointT(10,5);
	PointT test2 = new PointT(6,9);
	PointT test3 = new PointT(-123, -234);

	/**
	 * Test method for {@link src.PointT#row()}.
	 */
	@Test
	public void testRow() {
		//fail("Not yet implemented");
		assertEquals(test1.row(), 10);
		assertEquals(test2.row(), 6);
		assertEquals(test3.row(), -123);
	}

	/**
	 * Test method for {@link src.PointT#col()}.
	 */
	@Test
	public void testCol() {
		//fail("Not yet implemented");
		assertEquals(test1.col(), 5);
		assertEquals(test2.col(), 9);
		assertEquals(test3.col(), -234);
	}

	/**
	 * Test method for {@link src.PointT#translate(int, int)}.
	 */
	@Test
	public void testTranslate() {
		//fail("Not yet implemented");
		equals(test1.translate(0, 0).equals(test1));
		equals(test2.translate(4, -4).equals(test1));
		equals(test3.translate(123, 234).equals(new PointT(0, 0)));
	}
}
