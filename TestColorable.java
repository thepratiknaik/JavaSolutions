// Define the Colorable interface
interface Colorable {
    void howToColor();
}

// Define an abstract class GeometricObject
abstract class GeometricObject {
    // Properties
    private String color = "white";
    private boolean filled;

    // Default constructor
    public GeometricObject() {
    }

    // Parameterized constructor
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Abstract method for area
    public abstract double getArea();

    // Abstract method for perimeter
    public abstract double getPerimeter();
}

// Define the Square class that extends GeometricObject and implements Colorable
class Square extends GeometricObject implements Colorable {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Getter and setter for side
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Implement the abstract methods from GeometricObject
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Implement the howToColor method from Colorable
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}

// Main class to test the implementation
public class TestColorable {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
        
        // Invoke the howToColor method
        square.howToColor();
    }
}
