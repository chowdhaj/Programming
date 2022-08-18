package src;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class Seq1D<T> {
	
	private ArrayList<T> s;
	private TieHandler t;
	
	
	public Seq1D(ArrayList<T> S, TieHandler n){
		
		// Add all elements from S into s
		for(int i = 0; i < S.size(); i++) {
			this.s.add(S.get(i));
		}
	}
	
	private void setTieHandler(TieHandler n) {
		this.t = n;
	}
	
	/*
	 * Counts the number of times a specific element
	 * occurs in the list and returns it
	 */
	private int count(int n) {
		int count = 0;
		for (int i = 0; i < s.size(); i++) {
			if (this.s.get(i).equals(n)) {
				count++;
			}
		}
		return count;
	}
}
