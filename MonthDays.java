import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input to enter a year and a month
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month (first three letters with the first letter in uppercase): ");
        String month = input.next();


        // Display the number of days in the month
        int days = getDaysInMonth(month, year);
        if (days > 0) {
            System.out.println(month + " " + year + " has " + days + " days");
        } else {
            System.out.println("Invalid month entered");
        }
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(String month, int year) {
        switch (month) {
            case "Jan": return 31;
            case "Feb": return (isLeapYear(year)) ? 29 : 28;
            case "Mar": return 31;
            case "Apr": return 30;
            case "May": return 31;
            case "Jun": return 30;
            case "Jul": return 31;
            case "Aug": return 31;
            case "Sep": return 30;
            case "Oct": return 31;
            case "Nov": return 30;
            case "Dec": return 31;
            default: return -1;
        }
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
