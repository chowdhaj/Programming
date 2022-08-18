package search;

import java.util.ArrayList;

public class SequentialSearchST<Key, Value> {
	
	private Node first;
	
	public class Node{
		Key key;
		Value val;
		Node next;
		
		public Node(Key key, Value val, Node next) {
			this.key  = key;
			this.val  = val;
			this.next = next;
		}
	}
	
	public Value get(Key key) {
		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key)) {
				return x.val;
			}
		}
		return null;
	}
	
	public void put(Key key, Value val) {
		
		for(Node x = first;  x != null; x = x.next) {
			if (key.equals(x.key)) {
				x.val = val;
				return;
			}
		}
		first = new Node(key, val, first);
	}
	
	public int size() {
		int size = 0;
		for (Node x = first; x != null; x = x.next) {
			size++;
		}
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public Iterable<Key> keys() {
		ArrayList<Key> keys = new ArrayList<Key>();
		for (Node x = first; x != null; x = x.next) {
			keys.add((Key)x);
		}
		return keys;
	}
	
	public void delete(Key key) {
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
	}
	
	public static void main(String[] args) {
	
		SequentialSearchST<String,Integer>st;
		st = new SequentialSearchST<String, Integer>();
		
		String[] sen = new String[3];
		sen[0] = "Me";
		sen[1] = "Myself";
		sen[2] = "& I";
		
		for (int i = 0; i < sen.length ; i++) {
			String key = sen[i]; 
			st.put(key,i);
		}
		
		System.out.println(st.size());
		System.out.println(st.keys());
//		for (String s : st.keys()) {
//			System.out.println(s + " " + st.get(s));
//		}
		
	}
}
