/**
 * Author: Jatin Chowdhary
 * Revised: March 16, 2020
 *
 * Description: Template Module for LandUseMap
 */
package src;

import java.util.ArrayList;

/**
 * @brief DEM Module that extends the Seq2D ADT
 */
public class DemT extends Seq2D<Integer> {

	/**
	 * @brief Constructor for the DEM Class
	 * @param s 2D sequence of sequences representing grid points
	 * @param scl The length of a square grid
	 */
	public DemT(ArrayList<ArrayList<Integer>> s, double scl) {
		super(s, scl);
	}
	
	/**
	 * @brief Calculates the sum of grid points/elements in the 2D sequence
	 * @return Returns the sum of all elements  
	 */
	public int total(){
		
		// totalValue starts off at 0
		int totalValue = 0;
		// Iterate through rows in 'S'
		for(int i = 0; i < this.S.size(); i++) {
			// Iterate through columns in 'S'
			for(int j = 0; j < this.S.get(i).size(); j++) {
				// If both rows and columns are valid, then:
				if ((validRow(i)) && validCol(j)) {
					// Add element at S[i][j] to totalValue
					totalValue += this.S.get(i).get(j); 
				}
			}
		}
		// Return totalValue
		return totalValue;
	}
	
	/**
	 * @brief Calculates the maximum element in the 2D grid sequence
	 * @return Returns the maximum value
	 */
	public int max() {
		
		// maxValue holds first column of first value from 'S'
		int maxValue = this.S.get(0).get(0);
		// Iterate through rows
		for(int i = 0; i < this.S.size(); i++) {
			// Iterate through columns
			for(int j = 0; j < this.S.get(i).size(); j++) {
				// Check if both rows and columns are valid
				if ((validRow(i)) && validCol(j)) {
					// If a greater value is found than assign it to maxValue
					if (maxValue <= this.S.get(i).get(j)) {
						maxValue = this.S.get(i).get(j);
					}
				}
			}
		}
		// Return the maximum element in 'S'
		return maxValue;
	}
	
	/**
	 * @brief Calculates if the sum of the rows are ascending
	 * @return Returns true if row sum are ascending
	 */
	public boolean ascendingRows() {
		
		// ∀(i : N | 0 ≤ i ≤ nRow − 2 : +(j : N | validCol(j) : s[i + 1][j]) > +(j : N | validCol(j) : s[i][j]))
		boolean isAscending = true;
		int tempSum = 0;
		
		// An int array that is the size of 'S' 
		int[] rowSum = new int[this.S.size()];
		
		// Iterate through the 2D ArrayList
		for(int i = 0; i < this.S.size(); i++) {
			for(int j = 0; j < this.S.get(0).size(); j++) {
				// Sum up all elements in row 'i' 
				tempSum += this.S.get(i).get(j);
			}
			// Store sum of row 'i' into 'i' index at int array
			rowSum[i] = tempSum;
			// Reset sum for next row
			tempSum = 0;
		}
		
		// Iterate through int array to determine if the numbers are increasing left to right
		for(int c = 0; c < (rowSum.length - 1); c++) {
			if (rowSum[c] > rowSum[c + 1]) {
				// If array at 'c' is greater than array at 'c + 1' then return false
				return false;
			}
		}
		return isAscending;
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
}
