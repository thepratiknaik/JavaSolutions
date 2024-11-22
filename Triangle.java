import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input the coordinates of the three points
        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Compute the sides of the triangle
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        // Compute the angles of the triangle
        double A = Math.round(Math.acos((a*a - b*b - c*c) / (-2 * b * c)));
        double B = Math.round(Math.acos((b*b - a*a - c*c) / (-2 * a * c)));
        double C = Math.round(Math.acos((c*c - b*b - a*a) / (-2 * a * b)));

        // Display the angles
        System.out.println("The three angles are :\n A:" + A + "\n B:" + B + "\n C:" + C);
    }
}