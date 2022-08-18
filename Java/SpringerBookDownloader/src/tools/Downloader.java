package tools;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import adt.DataCSV;

/**
 * Class to download the books as a PDF, save it locally, and properly name it.
 * 
 * @author Jatin Chowdhary
 */
public class Downloader {
		
	public static boolean downloadFiles(String [] links, String [] names) throws InterruptedException {
		
		// Tracks if the download is successful or not
		// Success is defined by how many errors are thrown
		boolean successfulDownload = true;
		
		// Makes sure that the array of links and names are the same size
		if (!(areArraySizesEquals(links, names))) {
			return false; // Do not continue if arrays are different sizes
		}
		
		// Counter to track which element in array we are on
		int i = 0;
				
		try {
			
			URL linkURL;
			for (i = 0; i < links.length; i++) { // Iterate through the links array
				
				if (links[i] != null) {	// Field cannot be null
					
					// Get direct link for book
					String dLink = convertToDownloadLink(links[i]);
					// Print what link we are on
					System.out.println("\nTrying To Download: (" + i + ") " + names[i]);
					// Print the direct link we are accessing
					System.out.println("Download Link: " + dLink);
					
					/*
					 * Opens up a buffered stream to the direct link, read the bytes,
					 * downloads it, and saves it locally. Iterates through all bytes
					 * using the for loop below.
					 */
					linkURL = new URL(dLink);
					InputStream in = linkURL.openStream();
					OutputStream out = new BufferedOutputStream
							(new FileOutputStream(Information.DOWNLOAD_PATH + 
									              sanitizeName(names[i]) +
									              Information.EXTENSION_PDF));
					
					// Read all bytes and write them locally
					for (int b ; (b = in.read()) != -1;) {
						out.write(b);
					}
					
					// Close resources
					out.close();
					in.close();
					
					System.out.println("Successfully downloaded!\n");
				}
			}
			
		} catch (Exception e) { // Catch all exceptions
			
			// Print the link that failed (and its number)
			System.out.println("Could Not Download: " + names[i] + 
					           "(" + i + ")\n");
			successfulDownload = false; // Change boole
			TimeUnit.SECONDS.sleep(2); // Sleep for 2 seconds 
			e.printStackTrace(); // Print stack trace
		}
		
		return successfulDownload; // Return boole
	}
	
	/**
	 * Checks if two arrays are the same size. Checks actual sizes and relative sizes.
	 * 
	 * @param links The first array to be checked
	 * @param names The second array to be checked against
	 * @return A boolean value that indicates if the sizes are indeed the same
	 */
	public static boolean areArraySizesEquals(String [] links, String [] names) {
		
		// If relative sizes and absolute sizes are the same, then:
		if (DataCSV.getArrayRelativeSize(links) == DataCSV.getArrayRelativeSize(names) &&
		    (links.length == names.length)) {
			return true; // Return true
		}
		
		/*
		 * If the sizes are not same, print their sizes to console and
		 * return false.
		 */
		System.out.println("'Names' & 'Links' Are Not The Same Size\n");
		System.out.println("Links Size  : " + links.length + "\n" + 
				           "Names Size  : " + names.length + "\n" + 
				           "Links rSize : " + DataCSV.getArrayRelativeSize(links) + "\n" + 
				           "Names rSize : " + DataCSV.getArrayRelativeSize(names));
		return false;
	}
	
	/**
	 * Converts the web page of the book to a direct PDF link
	 * 
	 * @param convertLink The web page of the book
	 * @return A String that represents the direct download link for the book
	 */
	public static String convertToDownloadLink(String convertLink) {
		
		// Replaces substrings and concatenates it with ".pdf"
		return convertLink.replaceAll("book", "content/pdf").concat(Information.EXTENSION_PDF);
	}
	
	/**
	 * Sanitizes a String by removing all non letters and numbers. This is
	 * useful for naming files because certain characters are not allowed.
	 * Spaces are also removed.
	 * 
	 * @param name The name of the file
	 * @return A sanitized String without non-letters/numbers
	 */
	public static String sanitizeName(String name) {
		
		// If String is empty or null, return a random name;
		if (name.equals("") || (name == null))  { 
			return generateRandomName();
		}
		
		/*
		 * Sanitize String by iterating through each character and only keeping
		 * letters and numbers. Spaces and other characters are effectively removed.
		 */
		String sanitizedName = "";
		for (char letter : name.toCharArray()) {
			if (Character.isLetter(letter) || Character.isDigit(letter)) {
				sanitizedName += letter;
			}
		}
		return sanitizedName; // Return sanitized String
	}
	
	/**
	 * Generate random number which will be used to name files without
	 * a name
	 * 
	 * @return A sequence of numbers converted to a String
	 */
	public static String generateRandomName() {
		return String.valueOf(ThreadLocalRandom.current().nextInt());
	}
}
