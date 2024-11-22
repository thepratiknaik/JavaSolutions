// Base Circle class
public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


// ComparableCircle class extends Circle and implements Comparable
public class ComparableCircle extends Circle implements Comparable {
    
    // Constructor
    public ComparableCircle(double radius) {
        super(radius);
    }

    // Implementation of compareTo method based on the area
    @Override
    public int compareTo(Object obj) {
        if (obj instanceof ComparableCircle) {
            ComparableCircle other = (ComparableCircle) obj;
            double thisArea = this.getArea();
            double otherArea = other.getArea();
            return Double.compare(thisArea, otherArea); // Returns -1, 0, or 1
        } else {
            throw new IllegalArgumentException("Object must be of type ComparableCircle");
        }
    }
}


// Test to compare two ComparableCircle objects
public class ComparableCircleTest {
    public static void main(String[] args) {
        // Create two ComparableCircle instances
        ComparableCircle circle1 = new ComparableCircle(5.0);
        ComparableCircle circle2 = new ComparableCircle(7.0);

        // Compare the two circles
        int comparisonResult = circle1.compareTo(circle2);

        // Determine and print the larger circle
        if (comparisonResult > 0) {
            System.out.println("Circle1 is larger with area: " + circle1.getArea());
        } else if (comparisonResult < 0) {
            System.out.println("Circle2 is larger with area: " + circle2.getArea());
        } else {
            System.out.println("Both circles have the same area: " + circle1.getArea());
        }
    }
}
