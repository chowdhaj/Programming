package simplycoding;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.util.Scanner;
//import java.io.*; // Imports all the classes found in 'java.io'

public class Files {
	
	public static void main(String[] args) throws FileNotFoundException {
	
		try (
			Scanner sc = new Scanner(new FileReader("test.txt"));
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		) {
			System.out.println(sc.nextLine());
			System.out.println(br.readLine());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}