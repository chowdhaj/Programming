package question1;

public class Bag {
	
	public MarblesBag firstMarble;
	
	public Bag() {
		firstMarble = null;
	}
	
	public boolean isEmpty() {
		return (firstMarble == null);
	}
	
	public void add(Marble mar) {
		
		MarblesBag addMarble = new MarblesBag(mar);
		
		addMarble.nextMarble = firstMarble;
		
		firstMarble = addMarble;
	}
	
	public MarblesBag removeMarble() {
		
		MarblesBag referenceMarble = firstMarble;
		
		if (isEmpty()) {
			System.out.println("Bag is empty");
		} else {
			firstMarble = firstMarble.nextMarble;
		}
		return referenceMarble; 
		
	}
	
	public void printAllMarbles() {
		
		MarblesBag theBag = firstMarble;
		while (theBag != null) {
			//theBag.toString();
			System.out.println(theBag.nextMarble);
			theBag = theBag.nextMarble;
			
		}
	}
	
	public MarblesBag contains(Marble mar) {
		MarblesBag theBag = firstMarble;
		if(isEmpty()) {
			System.out.println("Bag is empty");
		} else {
			while (theBag.getMarble() != mar ) {
				if (theBag.nextMarble == null) {
					return null;
				} else {
					theBag = theBag.nextMarble;
				}
			}
		}
		return theBag;
	}
	
	public MarblesBag removeMarble(Marble mar) {
		MarblesBag currentMarble = firstMarble;
		MarblesBag previousMarble = firstMarble;
		
		while (currentMarble.getMarble() != mar) {
			
			if (currentMarble.nextMarble == null) {
				return null;
			} else {
				previousMarble = currentMarble;
				currentMarble = currentMarble.nextMarble;
			}
			
		}
		
		if (currentMarble == firstMarble) {
			firstMarble = firstMarble.nextMarble; 
		} else {
			previousMarble.nextMarble = currentMarble.nextMarble;
		}
		
		return currentMarble;
	}
}