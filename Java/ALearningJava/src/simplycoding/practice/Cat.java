package simplycoding.practice;

import java.util.Random;

public class Cat extends Animal {

	@Override
	public Animal breed(Animal a) {
		
		if (this.getGender() ^ a.getGender() && a instanceof Cat) {
			
			Cat kitty = new Cat();
			
			switch (random(0,3)) {
				case 0: 
					kitty.setFurColor(this.furColor);
					break;
				case 1:
					kitty.setFurColor(a.getFurColor());
					break;
				case 2:
					kitty.setFurColor(this.furColor + " With " + a.getFurColor() + " Stripes");
					break;
				case 3: 
					kitty.setFurColor(a.getFurColor() + " With " + this.furColor + " Stripes");
					break;
			}
			
			kitty.setAge(1);
			
			kitty.setHeight(0.5);
			
			kitty.setMaxHeight((this.getMaxHeight() + a.getMaxHeight()) / 2); 
			
			switch (random(0,1)) {
				case 0 :
					kitty.setGender(true);
					break;
				case 1 : 
					kitty.setGender(false);
					break;
			}
			
			if (this.getWhiskers() && a.getWhiskers()) {
				kitty.setWhiskers(true);
			} else if (this.getWhiskers() || a.getWhiskers()) {
				switch(random(0,1)) {
					case 0: 	
						kitty.setWhiskers(true);
						break;
					case 1: 
						kitty.setWhiskers(false);
						break;
				}
			} else {
				kitty.setWhiskers(false);
			}
	
			return kitty;
			
		} else { return null; }
	}
	
	private int random(int min, int max) { 
		return new Random().nextInt(max + 1 - min) + min; 
	}
}
