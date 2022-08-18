package main;

import adt.DataCSV;

import tools.Information;
import tools.BetterDownloader;
import tools.Downloader;

import web.WebScrape;

public class Main {
	
	// Used to cycle between both downloading classes/methods
	private static final boolean USE_SIMPLE_DLL =  false;
	
	public static void main(String[] args) {
		
		// Create a DataCSV ADT
		DataCSV textbookCSV = new DataCSV(Information.QUALIFIED_NAME);
		
		try {
			
			if (USE_SIMPLE_DLL) {
				
				if (Downloader.downloadFiles
						(WebScrape.getRealLinks(textbookCSV.getDownloadLinks()),
						                        textbookCSV.getbookNames())) 
				{
					System.out.println("All Files Successfully Downloaded");
				} else {
					System.out.println("Something Bad Happened. Some File(s) Were Not Downloaded Properly");
				}
			} else {
				
				if (BetterDownloader.downloadFilesAdvanced(textbookCSV.getDownloadLinks())) {
					System.out.println("All Files Successfully Downloaded");
				} else {
					System.out.println("Some File(s) Were Not Downloaded Properly");
				}
			}
		} catch (InterruptedException e) {
			System.out.println(Information.INTERRUPTED_EXCEPTION);
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println(Information.GENERAL_EXCEPTION);
			e.printStackTrace();
			
		}
	}
}

/*
    ROUGH CODE
    
	//System.out.println("\n\n\n" + textbookCSV.getNumberOfLines());
	//DataCSV.printList(textbookCSV.getDownloadLinks());
	//DataCSV.printList(textbookCSV.getbookNames());
	
 */