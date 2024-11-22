import java.util.Date;

public class Account {
    // Private data fields
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // No-arg constructor that creates a default account
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date(); // Current date
    }

    // Constructor that creates an account with a specified id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0; // Default interest rate
        this.dateCreated = new Date(); // Current date
    }

    // Accessor methods
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Mutator methods
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Method to return the monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Method to return the monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    // Method to withdraw a specified amount from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
        }
    }

    // Method to deposit a specified amount into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Create an Account object with id 101 and initial balance of 5000
        Account myAccount = new Account(101, 5000);

        // Set the annual interest rate to 5%
        myAccount.setAnnualInterestRate(5);

        // Display the account details
        System.out.println("Account ID: " + myAccount.getId());
        System.out.println("Balance: $" + myAccount.getBalance());
        System.out.println("Annual Interest Rate: " + myAccount.getAnnualInterestRate() + "%");
        System.out.println("Date Created: " + myAccount.getDateCreated());

        // Display the monthly interest rate and monthly interest
        System.out.println("Monthly Interest Rate: " + myAccount.getMonthlyInterestRate() + "%");
        System.out.println("Monthly Interest: $" + myAccount.getMonthlyInterest());

        // Perform a deposit and a withdrawal
        myAccount.deposit(1000);
        System.out.println("After deposit, balance: $" + myAccount.getBalance());

        myAccount.withdraw(2000);
        System.out.println("After withdrawal, balance: $" + myAccount.getBalance());
    }
}
