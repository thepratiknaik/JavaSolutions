import java.util.Scanner;

public class MyTriangle {

    // Check if the sum of any two sides is greater than the third side.
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    // Calculate the area of the triangle.
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // User input the sides of the triangle
        System.out.print("Enter the lengths of three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Check if the triangle is valid and compute the area
        if (isValid(side1, side2, side3)) {
            double area = area(side1, side2, side3);
            System.out.printf("The area of the triangle is: %.2f\n", area);
        }
        else {
            System.out.println("The input is invalid.");
        }

        input.close();
    }
}
