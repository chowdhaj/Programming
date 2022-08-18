/**
 * Author: Jatin Chowdhary
 * Revised: March 16, 2020
 *
 * Description: Generic 2D Sequence Module For 'T' (ADT)
 */
package src;

import java.util.ArrayList;
import src.PointT;

/**
 * @brief Generic module used to create an ADT for a 2D Sequence of 'T'
 */
public class Seq2D<T> {

	protected ArrayList<ArrayList<T>> S;
	protected double scale;
	protected int nRow;
	protected int nCol;
	
	/**
	 * @brief Creates a sequence of 'T' using Multi-ArrayList
	 * @param s Sequence of a sequence of 'T'
	 * @param scl Scale; represents the length of each side in the grid
	 */
	public Seq2D(ArrayList<ArrayList<T>> s, double scl) {
		
		// Throws an error if scale is less than or equal to 0
		if (scl <= 0) throw new IllegalArgumentException("Scale must be greater than 0!");
		this.scale = scl;
		
		// Throws an error if size/len of rows is 0
		if (s.size() == 0) throw new IllegalArgumentException("Size of rows cannot be 0");
		this.nRow = s.size();
		
		// Throws an error if size/len of columns is 0
		if (s.get(0).size() == 0) throw new IllegalArgumentException("Size of columns cannot be 0");
		this.nCol = s.get(0).size();
		
		// Iterates through the sequence and checks each row with the first row, for equality
		for(int i = 1; i < s.size(); i++) {
			if (!(s.get(i).size() == s.get(0).size())) { // Subsequent rows must equal row[0] in size/len
				throw new IllegalArgumentException("Number of columns in rows are not equal to each other");
			}
		}
		this.S = s;
	}
	
	/**
	 * @brief Sets/changes a PointT in the sequence of T
	 * @param p Point that will be modified
	 * @param v Value it will be changed to
	 */
	public void set(PointT p, T v) {
		// If 'p' is a valid Point then:
		if (validPoint(p)) {
			// Change 'p' to 'v'
			this.S.get(p.row()).set(p.col(), v); 
		} else {
			// Throw exception if 'p' is not a valid point
			throw new IndexOutOfBoundsException("Not a valid point");
		}
	}
	
	/**
	 * @brief Returns a Point from the sequence
	 * @param p Point to be returned
	 * @return Returns the point from the sequence
	 */
	public T get(PointT p) {
		// Checks if point is valid
		if (validPoint(p)) {
			// Returns point
			return this.S.get(p.row()).get(p.col());
		} else {
			// Throw exception if point is not valid
			throw new IndexOutOfBoundsException("Not a valid point");
		}
	}
	
	/**
	 * @brief Returns number of rows in the sequence
	 * @return Returns the number of rows
	 */
	public int getNumRow() {
		return this.nRow;
	}
	
	/**
	 * @brief Returns number of columns in the sequence
	 * @return Returns the number of columns
	 */
	public int getNumCol() {
		return this.nCol;
	}
	
	/**
	 * @brief Returns the scale/length of the grid
	 * @return Returns the scale
	 */
	public double getScale() {
		return this.scale;
	}
	
	/**
	 * @brief Counts the number of times a value occurs in the sequence
	 * @param t Value to be checked for and counted
	 * @return Returns the number of times 't' is in the sequence
	 */
	public int count(T t) {
		
		// Counter keeps track of occurences
		int counter = 0;
		
		// Iterates through rows
		for(int i = 0; i < this.S.size(); i++) {
			// Iterates through columns
			for(int j = 0; j < this.S.get(i).size(); j++) {
				// Checks to make sure row and column number are valid
				if ((validRow(i)) && validCol(j)) {
					if (this.S.get(i).get(j) == t) {
						// Increment counter if 't' equals value at i,j index
						counter++;
					}
				}
			}
		}
		// Return counter to caller
		return counter; 
	}
	
	/**
	 * @brief Counts the number of times a value occurs in a specific row
	 * @param t Value to be counted for number of occurences
	 * @param i The row number to be checked
	 * @return Returns the number of occurences of 't' in row 'i'
	 */
	public int countRow(T t, int i) {
		
		// Counter to keep track of occurences
		int counter = 0;
		
		// 'i' must be a valid row number
		if (validRow(i)) {
			// +(j : N | validCol(j) ∧ s[i][j] = t : 1)
			for(int j = 0; i < this.S.get(i).size(); j++) {
				if (this.S.get(i).get(j) == t) {
					// Increment counter if values are same
					counter++;
				}
			}
		} else {
			// Throw exception if 'i' is not a valid row number
			throw new IndexOutOfBoundsException("Not a valid row");
		}
		// Return counter
		return counter; 
	}
	
	/**
	 * @brief Calculates total area taken up by a cell 't'
	 * @param t The cell
	 * @return Returns the total area 
	 */
	public double area(T t) {
		return count(t) * scale * scale;
	}

	/**
	 * @brief Local function that checks if input is a valid row
	 * @param i Row number to be checked
	 * @return Returns true if 'i' is between 0 and max row
	 */
	private boolean validRow(int i){
		if ((i >= 0) && (i <= (this.nRow - 1))) {
			return true;
		}
		return false;
	}
	
	/**
	 * @brief Local function that checks if input is a valid column
	 * @param i Column number to be checked
	 * @return Returns true if 'i' is between 0 and max column
	 */
	private boolean validCol(int i) {
		if ((i >= 0) && (i <= (this.nCol - 1))) {
			return true;
		}
		return false;
	}
	
	/**
	 * @brief Local function that checks if a point is valid on the grid
	 * @param p Point to be checked and verified
	 * @return Return true if the point is valid
	 */
	private boolean validPoint(PointT p) {
		return (validRow(p.row())) && validCol(p.col());
	}
}
