// Base class for all hospital employees
public class Employee {
    protected String name;
    protected String department;

    // Constructor to initialize common attributes
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Method to display basic employee information
    public void showInfo() {
        System.out.println("Employee: " + name + ", Department: " + department);
    }
}
