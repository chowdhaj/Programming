package cas.lab4.wt;

/**
 * Stopwatch is a stripped-down version of an old-fashioned stopwatch.
 * Upon instantiation it tracks time by saving the current system. 
 * Then, you can ask how long it has been since creation by invoking
 * the instance methods. 
 * <p>
 * Stopwatch returns the wall-clock time for a programming task.
 * You can test your program by inserting it into the main method,
 * which acts as a unit tester for Stopwatch. The final output is
 * in seconds and printed to the console/terminal. 
 * 
 * @author Jatin Chowdhary
 * @author Sophia Tao
 * @author Reza Samavi
 * @version 1.0
 */
public class Stopwatch {
	
	private final long start;
	
	/**
	 * Initializes a new Stopwatch by taking the current system time
	 */ 
	public Stopwatch() {
		start = System.currentTimeMillis();
	}
	
	/**
	 * Returns the elapsed CPU time (in seconds) since the Stopwatch was created.
	 * It takes the current system time and subtracts it from the first timer
	 * and divides the answer by 1000.0. The result is returned as a double. 
	 * 
	 * @return The elapsed CPU time (in seconds) since the Stopwatch was created
	 */
	public double elapsedTime() {
		
		long now = System.currentTimeMillis();
		
		return (now - start) /1000.0;
		// return (System.currentTimeMillis() - start) /1000.0;
	}
	
	/**
	 * Unit tests the {@code stopwatch} data type
	 * Takes a command-line argument {@code n} and computes the 
	 * sum of the square roots of the first {@code n} positive integers,
	 * using {@code Math.sqrt()}.
	 * <p>
	 * It prints to standard output the sum and the amount of time to
	 * compute the sum. Note that the discrete sum can be approximated by
	 * an integral - the sum should be approximately: 2/3 * (n^(3/2) -1).
	 * 
	 * @param args The command-line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]); // It is set to 1,000,000,000 in my argument configuration tab
		Stopwatch timer1 = new Stopwatch();
		double sum1 = 0.0;
				
		for (int i = 1; i <= n; i++) {
			// your code here
            sum1 += Math.sqrt(i);
        }
		
		double time1 = timer1.elapsedTime();
		System.out.printf("%e (%.2f seconds)\n", sum1, time1);
		// Output is: 2.108185e+13 (6.91 seconds)
	}
}


/*
 *  Execution: java Stopwatch n
 *  Dependencies: none  
 *  
 *  A utility class tomeasure the running time (wall clock) of a program.
 *  
 *  The {@code Stopwatch} data type is for measuring the time that elapses 
 *    between the start and end of a programming task (wall-clock time).
 */









  //////////////////////
 // JAVADOC EXAMPLES //
//////////////////////

// Writing Doc Comments
// Format of a Doc Comment
// A doc comment is written in HTML and must precede a class, field, constructor or method declaration. 
// It is made up of two parts -- a description followed by block tags. 
// In this example, the block tags are @param, @return, and @see.
/**
 * Returns an Image object that can then be painted on the screen. 
 * The url argument must specify an absolute {@link URL}. The name
 * argument is a specifier that is relative to the url argument. 
 * <p>
 * This method always returns immediately, whether or not the 
 * image exists. When this applet attempts to draw the image on
 * the screen, the data will be loaded. The graphics primitives 
 * that draw the image will incrementally paint on the screen. 
 *
 * @param  url  an absolute URL giving the base location of the image
 * @param  name the location of the image, relative to the url argument
 * @return      the image at the specified URL
 * @see         Image
 */
// public Image getImage(URL url, String name) {
//        try {
//            return getImage(new URL(url, name));
//        } catch (MalformedURLException e) {
//            return null;
//        }
// }

// EXAMPLE #1 //
// Avoid - The description below says nothing beyond what you know from reading the method name. 
// The words "set", "tool", "tip", and "text" are simply repeated in a sentence.
/**
 * Sets the tool tip text.
 *
 * @param text  the text of the tool tip
 */
// public void setToolTipText(String text) {

// EXAMPLE #2 //
// Preferred - This description more completely defines what a tool tip is, in the larger context of 
// registering and being displayed in response to the cursor.
/**
 * Registers the text to display in a tool tip.   The text 
 * displays when the cursor lingers over the component.
 *
 * @param text  the string to display.  If the text is null, 
 *              the tool tip is turned off for this component.
 */
// public void setToolTipText(String text) {

// MORE INFORMATION // 
// List of tags in order:
/**
 * @author (classes and interfaces only, required)
 * @version (classes and interfaces only, required. See footnote 1)
 * @param (methods and constructors only)
 * @return (methods only)
 * @exception (@throws is a synonym added in Javadoc 1.2)
 * @see
 * @since
 * @serial (or @serialField or @serialData)
 * @deprecated (see How and When To Deprecate APIs)  
 */