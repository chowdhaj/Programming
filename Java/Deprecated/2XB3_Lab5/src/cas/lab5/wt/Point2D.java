package cas.lab5.wt;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Point2D {
	
	// These variables belong to the ADT
	// They are private for encapsulation
	private final double x;
	private final double y; 
	
	// Constructor of ADT Point2D that has a signature that takes no arguments
	public Point2D() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	// Second constructor of ADT that has a signature of 2 arguments
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double r() {
		return (Math.sqrt(this.x * this.x + this.y * this.y));
	}
	
	public double theta() {
		return (Math.atan2(this.y, this.x));
	}
	
	public double distanceTo(Point2D that) {
		double dx = Math.pow((this.x - that.x), 2);
		double dy = Math.pow(this.y - that.y, 2);	
		return Math.sqrt(dx + dy); 
	}
	
	// This overrides and becomes the default print style for the ADT
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public static void main(String[] args) throws Exception {
		
		// Gets input from text file
		Scanner input = new Scanner(new File("data/input.txt"));
		double x = input.nextDouble(); 
		double y = input.nextDouble();
		input.close(); // Closes the stream
		
		Point2D xy = new Point2D(x, y);
		
		// Prints results for point 'x' and 'y' to output.txt
		try (PrintWriter out = new PrintWriter("data/output.txt")) {
		    out.println("   xy    = " + xy);
		    out.println("   x     = " + xy.getX());
			out.println("   y     = " + xy.getY());
			if (Math.abs(xy.r() - 12.816005617976298) < 0.0001) {
				out.println("   r     = " + xy.r());
				System.out.println("Test Case Passed For Radius");
			} else {
				out.println("   r = FAILED");
				System.out.println("Test Case Failed For Radius");
			}
			
			if (Math.abs(xy.theta() - 0.2847304385227121) < 0.0001) {
				out.println("   theta = " + xy.theta());
				System.out.println("Test Case Passed For Theta");
			} else {
				out.println("   theta = FAILED");
				System.out.println("Test Case Failed For Theta");
			}
		}
		
		Point2D p = new Point2D(); 
		System.out.println("   p     = " + p);
		System.out.println("   x     = " + p.getX());
		System.out.println("   y     = " + p.getY());
		System.out.println("   r     = " + p.r());
		System.out.println("   theta = " + p.theta());
		System.out.println();
		
		Point2D q = new Point2D(0.5, 0.5);
		System.out.println("         q = " + q);
		System.out.println("         x = " + q.getX());
		System.out.println("         y = " + q.getY());
		System.out.println("         r = " + q.r());
		System.out.println("     theta = " + q.theta());
		System.out.println("dist(p, q) = " + q.distanceTo(p));
		System.out.println("");
		
		Point2D a = new Point2D();
		System.out.println("         a = " + a);
		
		Point2D b = new Point2D();
		System.out.println("         b = " + b);
		System.out.println("dist(a, b) = " + a.distanceTo(b)); // 'a' and 'b' are the same point
		
		Point2D m = new Point2D(-5, -5);
		Point2D n = new Point2D(5, 5);
		System.out.println("\ndist(x, y) = " + m.distanceTo(n)); // testing negative coordinates
		
		
	}

}
