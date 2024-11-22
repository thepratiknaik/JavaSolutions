// Janitor class, which extends Employee
public class Janitor extends Employee {

    // Constructor that uses the Employee constructor
    public Janitor(String name, String department) {
        super(name, department);
    }

    // Method specific to janitors for cleaning the department
    public void clean() {
        System.out.println(name + " is cleaning the " + department + " department.");
    }
}
