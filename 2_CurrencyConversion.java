import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = scanner.nextDouble();
        
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int conversionType = scanner.nextInt();
        
        if (conversionType == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollarAmount = scanner.nextDouble();
            double rmbAmount = dollarAmount * exchangeRate;
            System.out.println("$" + dollarAmount + " is " + rmbAmount + " yuan");
        } else if (conversionType == 1) {
            System.out.print("Enter the RMB amount: ");
            double rmbAmount = scanner.nextDouble();
            double dollarAmount = rmbAmount / exchangeRate;
            System.out.println(rmbAmount + " yuan is $" + dollarAmount);
        } else {
            System.out.println("Invalid conversion type.");
        }
        
        scanner.close();
    }
}