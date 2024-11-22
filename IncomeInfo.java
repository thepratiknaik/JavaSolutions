// Class to store income-related information
public class IncomeInfo extends Person {
    private double income;

    // Constructor that uses the Person constructor and adds income
    public IncomeInfo(String name, String gender, double income) {
        super(name, gender);
        this.income = income;
    }

    // Method to display income information
    public void displayIncomeInfo() {
        System.out.println("Name: " + name + ", Income: $" + income);
    }
}
