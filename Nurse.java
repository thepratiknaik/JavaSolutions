// Nurse class, which extends Employee
public class Nurse extends Employee {

    // Constructor that uses the Employee constructor
    public Nurse(String name, String department) {
        super(name, department);
    }

    // Method specific to nurses for caring for patients
    public void careForPatients() {
        System.out.println(name + " is caring for patients in " + department + ".");
    }
}
