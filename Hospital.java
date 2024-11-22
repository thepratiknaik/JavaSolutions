// Main class to test and demonstrate the functionality of various employee classes
public class Hospital {

    public static void main(String[] args) {
        // Create instances of different types of hospital employees
        Doctor doctor = new Doctor("Dr. Smith", "Cardiology");
        Nurse nurse = new Nurse("Nurse Betty", "Emergency");
        Administrator administrator = new Administrator("Mr. Johnson", "Administration");
        Surgeon surgeon = new Surgeon("Dr. Brown", "Orthopedics");
        Receptionist receptionist = new Receptionist("Ms. Davis", "Reception");
        Janitor janitor = new Janitor("Mr. Lee", "Maintenance");

        // Call each employee's specific methods to perform their duties
        doctor.diagnose();
        nurse.careForPatients();
        administrator.manageOperations();
        surgeon.diagnose();
        surgeon.performSurgery();
        receptionist.answerPhone();
        janitor.clean();
    }
}
