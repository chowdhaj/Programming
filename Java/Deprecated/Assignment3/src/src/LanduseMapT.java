/**
 * Author: Jatin Chowdhary
 * Revised: March 16, 2020
 *
 * Description: Template Module for LandUseMap
 */
package src;

import src.Seq2D;
import java.util.ArrayList;
import src.LuT;

/**
 * @brief Template module for LanduseMapT instantiated with Seq2D
 */
public class LanduseMapT extends Seq2D<LuT> {

	/**
	 * @brief Constructor for the LanduseMapT Class
	 * @param s 2D sequence of sequences representing grid points
	 * @param scl The length of a square grid
	 */
	public LanduseMapT(ArrayList<ArrayList<LuT>> s, double scl) {
		super(s, scl);
	}
}
