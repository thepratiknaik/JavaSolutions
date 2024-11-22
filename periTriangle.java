import java.util.Scanner;

public class periTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input to size of edges
        System.out.print("Enter three edges of the triangle: ");
        double edge1 = input.nextDouble(); 
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        // If the input is valid, calculate the perimeter, else display invalid input
        if (isValid(edge1, edge2, edge3)) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else {
            System.out.println("The input is invalid.");
        }
    }

    // Check if triangle is valid
    public static boolean isValid(double edge1, double edge2, double edge3) {
        return (edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1);
    }
}
