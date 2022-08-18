package main;

public class Example7 {
	
	private int state;
	private String brand; 
	private boolean isPoweredOn;
	
	public Example7(String brand, int state) {
		
		this.brand = brand;
		this.state = state;
		
		isPoweredOn = false;
		
	}
	
	public void powerOnRadio() {
		
		this.state = 1;
		isPoweredOn = true;
		
	}
	
	public void scanFrequency() {
		//
	}
	
	// Other functions
	

}
