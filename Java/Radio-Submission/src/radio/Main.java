package radio;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

import radio.gui.Interface;

public class Main {
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		
		System.out.println("Demo Radio Interface\n"
				         + "--------------------");
		System.out.println("Red Text means that the radio is turned off");
		System.out.println("Green Text means that the radio is turned on OR the station is valid");
		System.out.println("Blue Text means that the station is not valid, but the radio is on\n"
				         + "---------------------");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}
}