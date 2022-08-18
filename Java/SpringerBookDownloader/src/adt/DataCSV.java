package adt;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.LineNumberReader;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import tools.Information;
import tools.Load;

/**
 * Abstract Data Type (ADT) For CSVParser Objects
 * 
 * @author Jatin Chowdhary
 */
public class DataCSV {
	
	// State variables for the ADT
	private String fileName = "Not Initialized";
	private FileInputStream loadFile = null;
	private String [] downloadLinks = null;
	private String [] bookNames = null;
	private CSVParser dataCSV = null;
	private int numberOfLines = 0;
	
	public DataCSV(String fileName) {
		
		this.fileName = fileName; // Sets file name
			
		// Sets number of lines in file
		this.numberOfLines = calculateNumberOfLines();
		
		// Initializes arrays to be as big as number of lines in file
		this.downloadLinks = new String[this.numberOfLines];
		this.bookNames = new String[this.numberOfLines];
		
		// Parses file and copies data to arrays
		parseInformation();
	}
		
	/**
	 * @return The number of lines
	 */
	public int getNumberOfLines() {
		return this.numberOfLines;
	}
	
	/**
	 * @return Pointer to array containing all download links
	 */
	public String [] getDownloadLinks() {
		return this.downloadLinks;
	}
	
	/**
	 * @return Pointer to array containing names of books
	 */
	public String [] getbookNames() {
		return this.bookNames;
	}
	
	/**
	 * Prints all elements in an array
	 * 
	 * @param list The array to be iterated through and printed
	 */
	public static void printList(String [] list) {
		
		// For each element in the array
		for (String i : list) {
			if (i != null) { // If it is not null, then print
				System.out.println(i);
			}
		}
	}
	
	/**
	 * Gets the relative size of the array
	 * 
	 * The relative size is all non-null values in the array. For instance, 
	 * if an array of size 3 was [1, 2, null], then the relative size is 2.
	 * 
	 * @param list The array to be checked
	 * @return The relative size of the array
	 */
	public static int getArrayRelativeSize(String [] list) {
		
		int trueSize = 0;
		for (String i : list) {
			if (i != null) { // If the element is not null,
				trueSize++;  // increment counter
			}
		}
		return trueSize;
	}
	
	/**
	 * Iterates through the CSV file and copies links and names to their
	 * respective arrays. Checks if the file was properly loaded and parsed
	 * without errors. 
	 */
	private void parseInformation() {
		
		if (didFileLoad()) {
			
			System.out.println("File Loaded Successfully; " + getNumberOfLines() + " Lines Found\n");
			
			if (didCSVParse()) {
				
				// Iterate through entire CSV file, line by line
				int i = 0;
				for (CSVRecord cell : dataCSV) {
					
					// If the column contains 'http', then it must be a link
					if (cell.toString().toLowerCase().contains(Information.HTTP)) {
						
						// Copy information to array at the 'i' index
						downloadLinks[i] = cell.get(Information.COLUMN_WITH_LINKS);
						bookNames[i] = cell.get(Information.COLUMN_WITH_NAMES);
						i++;
					}
				}
				
			}
		}
	}
	
	/**
	 * Checks if the file loaded properly by performing a 
	 * null check
	 * 
	 * @return A boolean indicated if the file is null or not
	 */
	private boolean didFileLoad() {
		
		// Load the file
		loadFile = Load.dataFile(this.fileName);
		
		// If it is not null, return true
		if (loadFile != null) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Checks if the file was properly parsed by CSVParser by
	 * peforming a null check
	 * 
	 * @return A boolean indicated if the file was parsed or not
	 */
	private boolean didCSVParse() {
		
		// Load file into CSVParser
		dataCSV = Load.csvFile(loadFile);
		
		// If not null then return true
		if (dataCSV != null ) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Calculates the number of lines in the file
	 * 
	 * @return The number of lines
	 * @throws IOException if the operation was interrupted or failed
	 */
	@SuppressWarnings("unused")
	private int calculateNumberOfLines() {
		
		int counter = 0; // Keeps track of number of lines
		LineNumberReader readFile = Load.loadLineReader(this.fileName);
		
		try {
			
			// Iterate through entire file and count each line
			String currentLine = "";
			while ((currentLine = readFile.readLine()) != null) {
				counter++; // Can also use: numberOfLines = reader.getLineNumber(); 
			}
			
			readFile.close(); // Close reader
			
			return counter; // Return number of lines
			
		} catch (IOException inter) { // IO Exception
			counter = -1;
			System.out.println(Information.IO_EXCEPTION);
			inter.printStackTrace();
			
		} catch (Exception general) { // Handles all other exceptions
			counter = -1;
			System.out.println(Information.GENERAL_EXCEPTION);
			general.printStackTrace();
		}
		
		return counter;
	}
}