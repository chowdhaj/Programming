package tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.StandardCharsets;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

/**
 * Loads local files into memory
 * 
 * @author Jatin Chowdhary
 */
public class Load {

	/**
	 * Loads a file so its number of lines can be read
	 * 
	 * @param fileName The name of the file
	 * @return A pointer to a LineNumberReader object or null
	 */
	@SuppressWarnings("hiding")
	public static LineNumberReader loadLineReader (String fileName) {
				
		try {
			// Create new LineNumberReader object
			LineNumberReader readFile = new LineNumberReader(new FileReader(fileName));
			return readFile; // Return pointer
		} catch (FileNotFoundException noFile) { // If file was not found
			System.out.println(Information.FILE_NOT_FOUND_EXCEPTION);
			noFile.printStackTrace();
		} catch (IOException inter) { // If the operation was interrupted/failed
			System.out.println(Information.IO_EXCEPTION);
			inter.printStackTrace();
		} catch (Exception e) { // Catch all other exceptions
			System.out.println(Information.GENERAL_EXCEPTION);
			e.printStackTrace();
		}
		
		// Return null if the file did not load properly
		return null;
	}
	
	/**
	 * Loads a file
	 * 
	 * @param fileName The name of the file
	 * @return A pointer to the FileInputStream object or null
	 */
	public static FileInputStream dataFile (String fileName) {
		
		try { 
			// Create new FileInputStream object
			FileInputStream dataFile = new FileInputStream(new File(fileName));
			return dataFile; // Return pointer
		} catch (NullPointerException nullPath) { // File is null exception
			System.out.println(Information.NULL_POINTER_EXCEPTION);
			nullPath.printStackTrace();
		} catch (FileNotFoundException noFile) { // File not found exception
			System.out.println(Information.FILE_NOT_FOUND_EXCEPTION);
			noFile.printStackTrace();
		} catch (SecurityException noRead) { // If user does not have R/W access
			System.out.println(Information.SECURITY_EXCEPTION);
			noRead.printStackTrace();
		} catch (Exception e) { // Catch all other exceptions
			System.out.println(Information.GENERAL_EXCEPTION);
			e.printStackTrace();
		}
		// Return null if the file did not load properly
		return null;
	}
	
	/**
	 * Loads a FileInputStream object into a CSVParser object
	 * 
	 * @param loadFile The FileInputStream Object
	 * @return A pointer to the CSVParser object or null
	 */
	public static CSVParser csvFile(FileInputStream loadFile) {
		
		try {
			// Create new CSVParser object
			CSVParser parseCSV = CSVParser.parse(loadFile, StandardCharsets.UTF_8, CSVFormat.DEFAULT);
			return parseCSV; // Return pointer
		} catch (IOException badFile) { // Handles interruptions or failed operations
			System.out.println(Information.IO_EXCEPTION);
			badFile.printStackTrace();
		} catch (Exception e) { // Catches all other exceptions
			System.out.println(Information.GENERAL_EXCEPTION);
			e.printStackTrace();
		}
		
		// Returns null if the objects were not loaded properly
		return null;
	}
}