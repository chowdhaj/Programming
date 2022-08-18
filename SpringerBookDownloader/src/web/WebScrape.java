package web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.jsoup.*;
import org.jsoup.nodes.Document;

import tools.Information;

/**
 * Scrapes Web Pages Using JSoup
 * 
 * @author Jatin Chowdhary
 */
public class WebScrape {

	/**
	 * Takes in an array of links that redirect to the actual web page and returns the
	 * correct links as an array; accomplishes this using JSoup.
	 * 
	 * @param shadowLinks Array of links (web pages) that redirect to the real links/sites
	 * @return An array of links containing the actual web links
	 * @throws InterruptedException if the sleep timer does not finish and gets interrupted
	 */
	public static String [] getRealLinks(String [] shadowLinks) throws InterruptedException {
		
		// Create new array that has the same size as the argument array
		String [] realLinks = new String[shadowLinks.length];
		
		for (int i = 0; i < shadowLinks.length; i++) { // Iterate through all shadow links
			if (shadowLinks[i] != null) { // If field is not null
				try {
					// Open connection to web site using JSoup and get the HTML document
					Document webPage = Jsoup.connect(shadowLinks[i]).get();
					// Get the actual link from the HTML page and store it into the array
					realLinks[i] = webPage.selectFirst("link").attr("href");
					// Prints out which web page was successfully scraped
					System.out.println("Scraped Webpage: (" + i + ") "+ shadowLinks[i]);
				} catch (IOException e) { // IO Exception if the process is interrupted
					System.out.println(Information.IO_EXCEPTION); // Print message
					System.out.println("Link: " + shadowLinks[i]); // Print the link that failed
					TimeUnit.SECONDS.sleep(2); // Sleep for 2 seconds
					e.printStackTrace(); // Print stack trace to console
				} catch (Exception e) { // Catch all other exceptions
					System.out.println(Information.GENERAL_EXCEPTION); // Print message
					System.out.println("Link: " + shadowLinks[i]); // Print the failed link
					TimeUnit.SECONDS.sleep(2); // Sleep for 2 seconds
					e.printStackTrace(); // Print stack trace
				}
			}
		}
		return realLinks; // Return array of real links
	}
}
