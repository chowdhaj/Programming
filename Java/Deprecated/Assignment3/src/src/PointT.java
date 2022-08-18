/**
 * Author: Jatin Chowdhary
 * Revised: March 16, 2020
 *
 * Description: Point ADT Class
 */
package src;

/**
 * @brief An ADT that represents a point on a grid
 */
public class PointT {
	
	protected int r;
	protected int c;
	
	/**
	 * @brief Initializes a point on a grid, object
	 * @param row The x-position/coordinate on the grid
	 * @param col The y-position/coordinate on the grid
	 */
	public PointT(int row, int col) {
		this.r = row;
		this.c = col;
	}
	
	/**
	 * @brief Gets the x-coordinate
	 * @return Returns the row index of the point
	 */
	public int row() {
		return this.r;
	}
	
	/**
	 * @brief Gets the y-coordinate 
	 * @return Returns the column index of the point
	 */
	public int col() {
		return this.c;
	}
	
	/**
	 * @brief Translates/Shifts a point
	 * @param r The number of units to shift in the row direction
	 * @param c The number of units to shift in the column direction
	 * @return Returns a new point with the translation/shift
	 */
	public PointT translate (int r, int c) {
		return new PointT (row() + r, col() + c);
	}
}
