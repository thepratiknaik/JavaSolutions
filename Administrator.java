// Administrator class, which extends Employee
public class Administrator extends Employee {

    // Constructor that uses the Employee constructor
    public Administrator(String name, String department) {
        super(name, department);
    }

    // Method specific to administrators for managing operations
    public void manageOperations() {
        System.out.println(name + " is managing hospital operations in " + department + ".");
    }
}
