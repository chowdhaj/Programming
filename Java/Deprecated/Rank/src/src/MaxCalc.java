package src;

import java.util.Collections;
import java.util.ArrayList;

public class MaxCalc implements TieHandler {

	/*
	 * Returns the maximum rank of the list
	 * 
	 * @see src.TieHandler#rCalc(java.util.ArrayList)
	 */
	@Override
	public double rCalc(ArrayList<Integer> seq) {
		Collections.sort(seq);		
		return (double)(seq.get(seq.size() - 1)); 
	}
}
