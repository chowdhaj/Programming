package cas.lab4.wt;

import cas.lab4.wt.StdDraw;

public class Point {
	
	private double x;
	private double y;
	
	// create and initialize a point with given (x,y)
	public Point(double x, double y) {
		// your code here
		this.x = x;
		this.y = y;
	}
	
	// return Euclidean distance between invoking point p and q
	// i.e. sqrt((this.x – that.x) ^ 2 + (this.y – that.y) ^ 2)
	public double distanceT(Point that) {
		// your code here
		double deltaX = Math.pow((this.x - that.x), 2);
		double deltaY = Math.pow((this.y - that.y), 2);
		return (Math.sqrt(deltaX + deltaY));
	}
	
	// draw point using standard draw
	public void draw() {
		StdDraw.point(x, y); 
		//System.out.println("A point is drawn for " + this.toString());
	}

	// draw the line from the invoking point p to q using standard draw
	public void drawTo(Point that) {
		StdDraw.line(this.x,this.y,that.x,that.y); 
		//System.out.println("A line is drawn from " + this.toString() + " to " + that.toString());
	}
	
	// return string representation of this point
	public String toString() {
		// your code here
		//String point_formatted = "(" + this.x + ", " + this.y + ")";
		//return point_formatted;
		return "(" + this.x + ", " + this.y + ")"; 
	}
	
	// test client
	public static void main(String[] args) {
		Point p = new Point(0.6, 0.2);
		System.out.println("p = " + p);
		Point q = new Point(0.5, 0.5);
		System.out.println("q = " + q);
		System.out.println("dist(p, q) = " + p.distanceT(q));
		
		//System.out.println("");
		p.draw();
		p.drawTo(q);
	}
}
