package main;

import java.util.Scanner;

public class Example4 {
	
	private static int state = 0;
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println();
		printStart();
		
		String unsanitizedInput = "";
		
		while (true) {
			
			printOptions();
			
			unsanitizedInput = userInput.next();
			
			state = Integer.parseInt(unsanitizedInput);
			
			
		}
		
		

	}
	
	public static void printStart() {
		System.out.println("The Radio Program Has Started!");
	}
	
	public static void printOptions() {
		
		// 0 = OFF
		// 1 = ON
		// 2 = ...
		// 3 = ...
		// ...
		// Q = Quit Program
		
		if (state == 0) {
			System.out.println(
				"1 - ON\n" +
				"Q - Quit\n");
		} else if (state == 1) {
			System.out.println(
				"0 - OFF\n" + 
				"2 - ...\n" + 
				"3 - ...\n" + 
				"Q = Quit\n");
		}
		
		System.out.print("> ");
		
		
		
	}
	
	

}
