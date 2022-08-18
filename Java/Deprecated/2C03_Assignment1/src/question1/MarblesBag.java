package question1;

import question1.Marble;

public class MarblesBag {
	
	private Marble marble;
	public MarblesBag nextMarble;

	public MarblesBag(Marble marble) {
		this.marble = marble;
	}
	
	public MarblesBag getNextMarble() {
		return this.nextMarble;
	}
	
	public Marble getMarble() {
		return this.marble;
	}
	
	public String toString() {
		return marble.toString();
	}
	
	public static void main(String[] args) {	
		
		Bag bag = new Bag();
		Marble m1 = new Marble("m1");
		Marble m2 = new Marble("m2");
		Marble m3 = new Marble("m3");
		
		bag.add(m1);
		bag.add(m2);
		bag.add(m3);
		bag.printAllMarbles();
		
		bag.removeMarble(m1);
		bag.printAllMarbles();
		
		bag.removeMarble();
		bag.printAllMarbles();
		
	}
	
} 
/*
	Marble m = new Marble("m1");  Marble n = new Marble("m2");  Marble o = new Marble("m3"); 
	Marble p = new Marble("m4");  Marble q = new Marble("m5");  Marble r = new Marble("m6"); 
	Marble s = new Marble("m7");  Marble t = new Marble("m8");  Marble u = new Marble("m9"); 
	Marble v = new Marble("m10"); Marble w = new Marble("m11"); Marble x = new Marble("m12"); 
	Marble y = new Marble("m13"); Marble z = new Marble("m14"); 
		
 */

/*
	private Node firstMarble;

	private class Node {
		Marble marble;
		Node nextMarble;
	}

	public boolean isBagEmpty() {
		return (firstMarble == null);
	}
	
	public void addMarble(Marble mar) {

		Link newMarble = new Link(mar);

		if (containsMarble(mar)) {
			System.out.println("Marble in bag");
		} else {
			newMarble.nextMarble = firstMarble;
			firstMarble = newLink;
		}

	}

	public boolean containsMarble(Marble mar) {
		
		Node theLink = firstMarble;

		if (!(isBagEmpty())) {
			while (!(theLink.equals(mar))) {
				if (theLink.nextMarble == null) {
					return false;
				} else {
					// theLink = theLink.nextMarble;
					return true;
				}
			}
		} 
		//System.out.println("The Marble Bag Is Empty. Searching Is Pointless.");
		return false;
		
	}
}
 * public boolean isEmpty() { return (first == null); }
 * 
 * public void addMarble(Item item) { Node oldfirst = first; first = new Node();
 * first.item = item; first.next = oldfirst; }
 * 
 * public Iterator<Item> iterator() { return new ListIterator(); }
 * 
 * private class ListIterator implements Iterator<Item> {
 * 
 * private Node current = first;
 * 
 * public boolean hasNext() { return current != null; }
 * 
 * public void remove() { }
 * 
 * public Item next() { Item item = current.item; current = current.next; return
 * item; }
 * 
 * } }
 */