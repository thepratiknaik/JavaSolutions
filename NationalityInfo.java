// Class to store nationality-related information
public class NationalityInfo extends Person {
    private String nationality;

    // Constructor that uses the Person constructor and adds nationality
    public NationalityInfo(String name, String gender, String nationality) {
        super(name, gender);
        this.nationality = nationality;
    }

    // Method to display nationality information
    public void displayNationalityInfo() {
        System.out.println("Name: " + name + ", Nationality: " + nationality);
    }
}
