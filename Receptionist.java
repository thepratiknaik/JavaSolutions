// Receptionist class, which extends Employee
public class Receptionist extends Employee {

    // Constructor that uses the Employee constructor
    public Receptionist(String name, String department) {
        super(name, department);
    }

    // Method specific to receptionists for answering phone calls
    public void answerPhone() {
        System.out.println(name + " is answering phones in " + department + ".");
    }
}
