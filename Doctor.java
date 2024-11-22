// Doctor class, which extends Employee
public class Doctor extends Employee {

    // Constructor that uses the Employee constructor
    public Doctor(String name, String department) {
        super(name, department);
    }

    // Method specific to doctors for diagnosing patients
    public void diagnose() {
        System.out.println(name + " is diagnosing a patient in " + department + ".");
    }
}
