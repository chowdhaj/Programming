package tools;

/**
 * Contains Strings/Integers that are used throughout the application. Since the variables
 * never change, they are static and final. Changing the value here will reflect
 * throughout the entire application.
 * 
 * @author Jatin Chowdhary
 */
public class Information {
		
	// General Strings that are commonly used
	public static final String HTTP             = "http";
	public static final String DOWNLOAD_PATH    = "downloads/";
	public static final String PATH_TO_FILE     = "data/";
	public static final String NAME_OF_FILE     = "Free+English+textbooks";
	public static final String EXTENSION_EXCEL  = ".xlsx";
	public static final String EXTENSION_CSV    = ".csv";
	public static final String EXTENSION_PDF    = ".pdf";
	public static final String EXTENSION_EPUB   = ".epub";
	public static final String SPRINGER_WEBSITE = "https://link.springer.com";
	public static final String QUALIFIED_NAME   = PATH_TO_FILE + NAME_OF_FILE + EXTENSION_CSV;
	
	// Point to the relevant columns
	public static final int COLUMN_WITH_LINKS = 18;
	public static final int COLUMN_WITH_NAMES = 0;
	
	// These strings are used in try/catch blocks
	public static final String IO_EXCEPTION             = "The Operation Was Interrupted. Please Try Again.";
	public static final String GENERAL_EXCEPTION        = "Something Went Wrong. Please Read The Crash Logs.";
	public static final String SECURITY_EXCEPTION       = "Read Access Denied. Please Check Your R/W/X Permissions!";
	public static final String INTERRUPTED_EXCEPTION    = "Thread Sleep Unexpectedly Interrupted";
	public static final String NULL_POINTER_EXCEPTION   = "The File Path is Null. Please Give A Valid File Name";
	public static final String FILE_NOT_FOUND_EXCEPTION = "File Not Found. Please Check The Directories To See If It Exists";
	
}