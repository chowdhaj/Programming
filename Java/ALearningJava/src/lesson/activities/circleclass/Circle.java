package lesson.activities.circleclass;

/**
 * This class implements a Circle. Here are the methods
 * 
 *  Circle()            => constructor, new circle of radius 0
 *  Circle(r)           => new circle of radius r
 *  getRadius()         => return the radius property
 *  setRadius(r)        => set the radius property
 *  area()              => calculates the area
 *  circ()              => calculates the circumference 
 */

public class Circle {

    private double radius; // Creates a private variable of type double called 'radius' // It is accessible only on the 'Circle' class 

    /**
     * Constructor method, with no arguments sets the radius to 0
     */
    public Circle() { this.radius = 0; } // This is the constructor method and it sets the 'radius' to 0 
    
    /**
     * Constructor method, with arguments sets the radius to r.
     * @param r the input value for the radius
     */
    public Circle(double r) { this.radius = r; } // This is the overloaded method that sets the 'radius' to 'r'
    
    /**
     * This method returns the radius of the circle
     * @return the radius of the circle
     */
    public double getRadius() { return this.radius; } // This method returns the radius of the circle
    
    /**
     * This method sets the radius of the circle to r
     * @param r the value to set to the radius of the circle.
     */
    public void setRadius(double r) { this.radius = r; } // This method sets the 'radius' to 'r'
    
    /**
     * This method returns the area of the circle. 
     * @return a double value representing the area of the circle.
     */
    public double area() { return Math.PI * radius * radius; } // This method returns the square of the radius times PI [which is the area of the circle]
    
    /**
     * This method returns the circumference of the circle
     * @return a double value for the circumference 
     */
    public double circ() { return 2 * Math.PI * radius; } // This method returns the radius times 2 times PI [which is the circumference of the circle]
}
