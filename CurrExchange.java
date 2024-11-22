import java.util.Scanner;

public class CurrExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input to enter the exchange rate
        System.out.print("Enter the Exchange rate from Dollars to Chinese RMB: ");
        double rate = input.nextDouble();

        // User input to enter 0 to convert dollars to RMB and 1 vice versa
        System.out.print("Enter 0 to convert dollars to Chinese RMB and 1 vice versa: ");
        int conversion = input.nextInt();

        if (conversion == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollars = input.nextDouble();
            double rmb = dollars * rate; //Calculate the RMB amount
            System.out.println("$" + dollars + " is " + rmb + " yuan");
        }
        else if (conversion == 1) {
            System.out.print("Enter the Chinese RMB amount: ");
            double rmb = input.nextDouble();
            double dollars = rmb / rate; //Calculate the USD amount
            System.out.println(rmb + " yuan is $" + dollars);
        }
        else {
            System.out.println("Invalid input."); //Display invalid input
        }
    }
}
