package simplycoding.log;

import java.io.IOException;
import java.util.logging.*;

public class Logging {

	private static final Logger LOG = Logger.getLogger(Logger.class.getName());
	
	public static void main (String[] args) {
		
		Logging.setupLogger(); // You can also use setupLogger(); because they're in the same class
		
		try {
			throw new java.io.IOException("Can't Read");
		} catch (java.io.IOException e) {
			LOG.log(Level.SEVERE, "File Can't READ", e);
		}
		
		//LOG.log(Level.SEVERE, "My First Log"); // Prints out a log to console // Any logs below SEVERE won't show up
		
		Loggings.test(); // Calls the logger from another class
		
	}
	
	static void setupLogger() {
		
		 LogManager.getLogManager().reset(); // Resets the Log Manager // Gets rid of any handlers that the root logger has
		
		LOG.setLevel(Level.ALL); // Allows all exceptions to pass through // Level.OFF doesn't allow anything to pass)
		
		ConsoleHandler ch = new ConsoleHandler(); // Creates a new ConsoleHandler
		
		ch.setLevel(Level.SEVERE); // Sets the level of the ConsoleHandler to Severe
		
		LOG.addHandler(ch); // Adds the ConsoleHandler to the Logger // Anything below SEVERE will not be logged
		
		try {
			FileHandler fh = new FileHandler("Logger.log"); // Creates a new FileHandler and calls it "Logger.log"
			//fh.setFormatter(new SimpleFormatter()); // Formats the logs to make them more readable // The default format is XML
			fh.setLevel(Level.FINE); // Sets the level to FINE // Everything above FINE will be logged out
			LOG.addHandler(fh); // Adds the handler to the logger
		} catch (Exception e) {
			LOG.log(Level.SEVERE, "File Logger Not Working", e); // Logs the error to console
		}
		
		// We have two handlers, a console handler and a file handler. The console handler will log everything above SEVERE, and...
		// ... the file handler will log everything above FINE
		
		//FileHandler fh = new FileHandler("Logger.log", true); // THIS WILL APPEND TO THE FILE INSTEAD OF OVERWRITING IT!
	}
}

/*

Severity of Logs from 
Most Important to 
Least Important

SEVERE
WARNING
INFO
CONFIG
FINE
FINER
FINEST

*/
