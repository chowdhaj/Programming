/* Challenge Activity 1 - Circle Class
 * 
 * In this challenge activity, I've created the main routine which uses a circle
 * class. you must complete the implementation of the class by writing the methods
 * 
 * PROGRAM OUTPUT:
 *  C1 ==> Radius : 9.000000; Area : 254.469005; Circumference : 56.548668
 *  C2 ==> Radius : 4.000000; Area : 50.265482; Circumference : 25.132741
 */

package lesson.activities.circleclass;

public class CircleClass {

    public static void main(String[] args) {
        // NOTE: Do not change any of this code
        Circle c1 = new Circle(9); // Creates a new object of type 'Circle', calls it 'c1', and passes 9 as an argument
        Circle c2 = new Circle(); // Creates a new object of type 'Circle', and names it 'c2'
        c2.setRadius(4); // Sets the radius of the circle 'c2' to 4
        System.out.printf("C1 ==> Radius: %3.2f; Area: %3.2f; Circumference: %3.2f\n" // Prints out the area and perimeter of 'c1'to console
                ,c1.getRadius(),c1.area(), c1.circ());
        System.out.printf("C2 ==> Radius: %3.2f; Area: %3.2f; Circumference: %3.2f\n" // Prints out the area and perimeter of 'c2' to console
                ,c2.getRadius(),c2.area(), c2.circ());
    }
}
