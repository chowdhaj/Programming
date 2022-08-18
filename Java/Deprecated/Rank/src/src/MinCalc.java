package src;

import java.util.Collections;
import java.util.ArrayList;

public class MinCalc implements TieHandler {

	/*
	 * Returns the minimum rank of the list
	 *  
	 * @see src.TieHandler#rCalc(java.util.ArrayList)
	 */
	@Override
	public double rCalc(ArrayList<Integer> seq) {
		Collections.sort(seq);		
		return (double)(seq.get(0));
	}
}
