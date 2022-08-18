/**
 * 
 */
package src;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author chowdhaj
 *
 */
public class TestSeq2D {
	
	ArrayList<PointT> p1 = new ArrayList<>();
	ArrayList<PointT> p2 = new ArrayList<>();
	ArrayList<PointT> p3 = new ArrayList<>();
	ArrayList<ArrayList<PointT>> main = new ArrayList<>();
	public Seq2D<PointT> points;

	@Before
	public void setUp() throws Exception {
		
		p1.add(new PointT(1,1));
		p1.add(new PointT(2,2));
		p1.add(new PointT(3,3));
		
		p2.add(new PointT(1,1));
		p2.add(new PointT(2,2));
		p2.add(new PointT(3,3));
		
		p3.add(new PointT(1,1));
		p3.add(new PointT(2,2));
		p3.add(new PointT(3,3));
		
		main.add(p1);
		main.add(p2);
		main.add(p3);
		
		points = new Seq2D<PointT>(main, 1.0);
	}
	
	/**
	 * Test method for {@link src.Seq2D#set(src.PointT, java.lang.Object)}.
	 */
	@Test
	public void testSet() {
		//fail("Not yet implemented");
		points.set(new PointT(1,1), new PointT(0,0));
		equals(points.get(new PointT(1,1)).equals(new PointT(2,2)));
		//System.out.println(points.get(new PointT(1,1)));
	}

	/**
	 * Test method for {@link src.Seq2D#get(src.PointT)}.
	 */
	@Test
	public void testGet() {
		//fail("Not yet implemented");
		equals(points.get(new PointT(1,1)).equals(new PointT(2,2)));
	}

	/**
	 * Test method for {@link src.Seq2D#getNumRow()}.
	 */
	@Test
	public void testGetNumRow() {
		//fail("Not yet implemented");
		//System.out.println(points.getNumRow());
		equals(points.getNumRow() == 3);
	}

	/**
	 * Test method for {@link src.Seq2D#getNumCol()}.
	 */
	@Test
	public void testGetNumCol() {
		//fail("Not yet implemented");
		//System.out.println(points.getNumCol());
		equals(points.getNumCol() == 3);
	}

	/**
	 * Test method for {@link src.Seq2D#getScale()}.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testGetScale() {
		//fail("Not yet implemented");
		//equals(points.getScale(), 1.0);
		//System.out.println(points.getScale());
		assertEquals(points.getScale(), 1.0, 0.000001);
	}

	/**
	 * Test method for {@link src.Seq2D#count(java.lang.Object)}.
	 */
	@Test
	public void testCount() {
		//fail("Not yet implemented");
		assertEquals(points.count(new PointT(5,5)), 0);
		assertEquals(points.count(new PointT(9,9)), 0);
	}

	/**
	 * Test method for {@link src.Seq2D#countRow(java.lang.Object, int)}.
	 */
	@Test
	public void testCountRow() {
		//fail("Not yet implemented");
		//System.out.println(p1.get(0).c);
		//System.out.println(points.countRow(p1.get(0), 1));
	}

	/*
	 * Test method for {@link src.Seq2D#area(java.lang.Object)}.
	 */
	@Test
	public void testArea() {
		//fail("Not yet implemented");
		assertEquals(points.area(new PointT(0,0)), 0, 0.00001);
	}
}
