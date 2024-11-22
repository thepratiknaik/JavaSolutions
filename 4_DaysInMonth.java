import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter a month (first three letters with uppercase first): ");
        String month = scanner.next();
        
        int days = getDaysInMonth(year, month);
        if (days != -1) {
            System.out.println(month + " " + year + " has " + days + " days");
        } else {
            System.out.println("Invalid month entered.");
        }
        
        scanner.close();
    }
    
    public static int getDaysInMonth(int year, String month) {
        Map<String, Integer> monthDays = new HashMap<>();
        monthDays.put("Jan", 31);
        monthDays.put("Feb", (isLeapYear(year) ? 29 : 28));
        monthDays.put("Mar", 31);
        monthDays.put("Apr", 30);
        monthDays.put("May", 31);
        monthDays.put("Jun", 30);
        monthDays.put("Jul", 31);
        monthDays.put("Aug", 31);
        monthDays.put("Sep", 30);
        monthDays.put("Oct", 31);
        monthDays.put("Nov", 30);
        monthDays.put("Dec", 31);
        
        return monthDays.getOrDefault(month, -1);
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}