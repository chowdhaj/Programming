package simplycoding.log;

import java.util.logging.Logger;

public class Loggings {
	
	// By using the same name, our setup is the same as the previous one
	private static final Logger LOG = Logger.getLogger(Logger.class.getName());

	static void test() {
		
		LOG.info("I'm from another class");
		
	}
}
