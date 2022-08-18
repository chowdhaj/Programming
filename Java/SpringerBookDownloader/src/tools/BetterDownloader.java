package tools;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.concurrent.TimeUnit;

/**
 * Class used to download the Springer books as a PDF. This class is slightly
 * better than 'Downloader.java'. 
 * 
 * @author Jatin Chowdhary
 */
public class BetterDownloader {
	
	/**
	 * Takes in an array of untouched links, scrapes the web page for the real link and
	 * the name, and downloads the file 
	 * 
	 * @param links Array of untouched links straight from the CSV
	 * @return A boole to indicate if all files downloaded without errors
	 * @throws InterruptedException if the sleep timer is interrupted
	 */
	public static boolean downloadFilesAdvanced(String [] links) throws InterruptedException {
		
		String nameOfBook = "";
		String partialDownloadLink = "";
		String fullDownloadLink = "";
		//double priceOfBook = 0.00;
		int numberOfSuccessfulDownloads = 0;
		int numberOfFailedDownloads = 0;
		int totalNumberOfDownloads = links.length;
		
		// Iterates through the length of the links array
		for (int i = 0; i < totalNumberOfDownloads; i++) {
						
			try { 
				
				// Prints out current link to scrape
				System.out.println("Connecting To : " + links[i] + "\n");
				
				// Gets HTML document
				Document webPage = Jsoup.connect(links[i]).get();
				
				// Gets and stores name of book
				nameOfBook = webPage.select("title").text().split("[|]")[0].stripTrailing();
				
				// Gets and stores half of the direct download link
				partialDownloadLink = webPage.selectFirst("a[href$=.pdf]").attr("href");
				
				// Joins two links to form the full direct link for downloading
				fullDownloadLink = Information.SPRINGER_WEBSITE.concat(partialDownloadLink);
				
				// Prints information
				System.out.println("Name Of Book  : " + nameOfBook);
				System.out.println("Download Link : " + fullDownloadLink);
				System.out.println("\nDownloading...");
				
				// Downloads the file
				if (downloadFileDirectLink(fullDownloadLink, nameOfBook)) {
					System.out.println("Successfully downloaded!\n");
					numberOfSuccessfulDownloads++;
					// If the download is successful then increment counter
				} else {
					//If the download fails then print out the link and its index
					System.out.println("Failed To Download: " + fullDownloadLink);
					System.out.println("Link #" + i + " In CSV File");
					numberOfFailedDownloads++;
					TimeUnit.SECONDS.sleep(2);
				}
				
				// Keeps track of how many downloads completed with and without errors
				System.out.println("\nNumber Of Successful Downloads : " + numberOfSuccessfulDownloads + 
						           "\nNumber Of Failed Downloads     : " + numberOfFailedDownloads);
				
				System.out.println("\n===============\n");
				
			} catch (IOException inter) { // Catch IO Exception
				System.out.println(Information.IO_EXCEPTION);
				
				// Print relevant debugging information
				System.out.println("Error With Link: " + links[i]);
				System.out.println("Link #" + i + " In CSV File");
				TimeUnit.SECONDS.sleep(2);
				inter.printStackTrace();
				
			} catch (IllegalArgumentException badURL) { // Exception for bad links
				System.out.println("This Is Not A Valid Link: " + links[i]);
				TimeUnit.SECONDS.sleep(2);
				
			} catch (Exception general) { // All other exceptions
				
				// Print relevant debugging information
				System.out.println(Information.GENERAL_EXCEPTION);
				System.out.println("Error With Link: " + links[i]);
				System.out.println("Link #" + i + " In CSV File");
				TimeUnit.SECONDS.sleep(2);
				general.printStackTrace();
			}
		}
		
		// If no books failed to download then return true
		return (numberOfFailedDownloads == 0);
	}
	
	/**
	 * Downloads bytes from a direct link and saves it locally
	 * 
	 * @param directLink The URL to download from
	 * @param name What the file will be named
	 * @return A boolean indicating if the download was successful
	 */
	public static boolean downloadFileDirectLink(String directLink, String name) {
		
		URL linkURL;
		
		try {
			
			/*
			 * Opens a stream to the direct link and another to a local
			 * path and copies the bytes from 'in' to 'out'
			 */
			linkURL = new URL(directLink);
			InputStream in = linkURL.openStream();
			OutputStream out = new BufferedOutputStream
					(new FileOutputStream(Information.DOWNLOAD_PATH + 
							              Downloader.sanitizeName(name) +
							              Information.EXTENSION_PDF));
			
			// Reads the bytes and copies them
			for (int b ; (b = in.read()) != -1;) {
				out.write(b);
			}
			
			out.close();
			in.close();
		
			// File downloaded successfully
			return true;
			
		// Catch bad URLs
		} catch (MalformedURLException badURL) {
			badURL.printStackTrace();
		
		// Handle IO Exception
		} catch (IOException inter) {
			inter.printStackTrace();
		
		// Catch all other exceptions
		} catch (Exception general) {
			general.printStackTrace();
		}
		
		return false;
	}
}