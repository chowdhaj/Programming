/*
 * STATE ASSUMPTIONS HERE
 * OR DESIGN DECISIONS
 * 
 * There is one button to turn on or turn off the radio
 */

package main;

public class Example2 {
	
public static void main(String[] args) {
		
	}
	
	public class Radio {
		
		private String name;
		
		private boolean isOn = false;
		
		public Radio(String name) {
			
			this.name = name;
			
		}
				
		public void turnOnOff() {
			if (isOn) {
				isOn = false;
			} else {
				isOn = true;
			}
		}
		
		public void startScan() {
			
		}
		
		public boolean reset() {
			return true;
		}
		
		public void lock() {
			
		}
		
	}

}
