import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first edge: ");
        double edge1 = scanner.nextDouble();
        
        System.out.print("Enter the second edge: ");
        double edge2 = scanner.nextDouble();
        
        System.out.print("Enter the third edge: ");
        double edge3 = scanner.nextDouble();
        
        if (isValidTriangle(edge1, edge2, edge3)) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else {
            System.out.println("The input is invalid.");
        }
        
        scanner.close();
    }
    
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}