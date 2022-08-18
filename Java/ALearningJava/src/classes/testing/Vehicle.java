package classes.testing;

public class Vehicle {
    
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;
    
    public Vehicle() {
        this.setColor("Black");
    }
    
    public Vehicle(String c) {
        this.setColor(c);
    }
    
    // Getter [Color]
    public String getColor() {
        return color;
    }
    
    // Setter [Color]
    public void setColor(String c) {
        this.color = c;
    }
    
    // Getter [Speed]
    public int getSpeed() {
        return maxSpeed;
    }
    
    // Setter [Speed]
    public void setSpeed(int s) {
        this.maxSpeed = s;
    }
    
    // Getter [Fuel]
    public double getFuel() {
        return fuelCapacity;
    }
    
    // Setter [Fuel]
    public void setFuel(double d) {
        this.fuelCapacity = d;
    }
    
    public void horn() {
        System.out.println("BEEP!");
    }
}
