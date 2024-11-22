// Surgeon class, which extends Doctor
public class Surgeon extends Doctor {

    // Constructor that uses the Doctor constructor
    public Surgeon(String name, String department) {
        super(name, department);
    }

    // Additional method specific to surgeons for performing surgery
    public void performSurgery() {
        System.out.println(name + " is performing surgery in " + department + ".");
    }
}
