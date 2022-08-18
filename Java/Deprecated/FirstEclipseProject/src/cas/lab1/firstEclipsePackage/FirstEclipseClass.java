package cas.lab1.firstEclipsePackage;

import java.util.Scanner;
import java.util.Vector;
import java.io.*;
import java.util.Scanner;

public class FirstEclipseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("My First Eclipse Class Is Running");
		// System.out.println(args[0]);

		Vector input = new Vector();
		input.add("A");
		input.add("B");
		input.add("C");
		input.add("D");
		printVectorElements(input, 3);
		
		// The output of this is the text file
		// It prints the numbers from 1 to 10, each number is on a separate line
		Vector<String> results = readFromFile();
		
		writeToFile(results);

	}

	public static void printVectorElements(Vector input, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(input.get(i));
		}
	}
	
	public static Vector<String> readFromFile() {
		Vector<String> result = new Vector<String>();
		try {
			File f = new File("input.txt");
			Scanner s = new Scanner(f);
			while(s.hasNextLine()) {
				int i = s.nextInt();
				if (i % 2 == 0)
					result.add("Even");
				else
					result.add("Odd");
				System.out.println(i); 
			}
			s.close();
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return result;	
	}
	
	public static void writeToFile(Vector<String> results) {
		
		try {
			FileWriter f = new FileWriter("output.txt");
			for (String result: results)
				f.write(result + "\n");
			f.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
