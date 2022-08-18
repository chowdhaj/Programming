package search;

public class BinarySearchST<Key extends Comparable<Key>, Value> {
	
	private Key[] keys;
	private Value[] vals;
	private int N;
	
	public BinarySearchST(int capacity){
		
	}
	
	public int size() { 
		return this.N; 
	}
	
	public Value get(Key key) {
		if (isEmpty()) {
			return null;
		}
		int i = rank(key);
		if (i < N && keys[i].compareTo(key) == 0) {
			return vals[i];
		}
		else {
			return null;
		}
	} 
	
	public int rank (Key key) {
		int lo = 0;
		int hi = N - 1;
		
		while(lo <= hi) {
			int mid = lo +(hi - lo) / 2;
			int cmp = key.compareTo(keys[mid]);
			if (cmp < 0) {
				hi = mid - 1;
			} else if (cmp > 0) {
				lo = mid + 1; 
			} else {
				return mid;
			}
		}
		return lo;
	}
	
	public void put(Key key, Value val) {
		int i = rank(key);
		
		if (i < N && keys[i].compareTo(key) == 0) {
			vals[i] = val;
			return;
		}
		
		for (int j = N; j > i; j--) {
			keys[j] = keys[j - 1];
			vals[j] = vals[j - 1];
			keys[i] = key;
			vals[i] = val;
			N++;
		}
	}
	public void delete(Key key) {
		if (isEmpty()) {
			return;
		}
		int i = rank(key); 
		if (i < N && keys[i].compareTo(key) == 0) {
			vals[i] = null;
			keys[i] = null;	
		}
	}
	/*
	 	Node prev = null;
		Node now = first;
		while(now != null) {
			if (now.key == key) {
				prev.next = now.next;
			} else {
				prev = now;
			}
			now = now.next;
		}
	 */
	
	public boolean isEmpty() {
		if (N == 0) {
			return true;
		} else {
			return false;
		}
	}

}
