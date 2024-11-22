public class RegularPolygon {
    // Private fields
    private int n; // number of sides
    private double side; // length of each side
    private double x; // x-coordinate of the center
    private double y; // y-coordinate of the center

    // Default constructor
    public RegularPolygon() {
        this.n = 3; // default number of sides
        this.side = 1; // default side length
        this.x = 0; // default x-coordinate
        this.y = 0; // default y-coordinate
    }

    // Constructor with specified number of sides and side length
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0; // center at (0,0)
        this.y = 0;
    }

    // Constructor with specified number of sides, side length, and center coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor methods
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Mutator methods
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to return the perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // Method to return the area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        // Example usage
        RegularPolygon polygon1 = new RegularPolygon(); // default polygon
        RegularPolygon polygon2 = new RegularPolygon(6, 4); // hexagon with side length 4
        RegularPolygon polygon3 = new RegularPolygon(5, 3, 1, 2); // pentagon with center at (1,2)

        System.out.println("Perimeter of polygon1: " + polygon1.getPerimeter());
        System.out.println("Area of polygon2: " + polygon2.getArea());
    }
}
