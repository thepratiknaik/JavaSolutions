// Class to store occupation-related information
public class OccupationInfo extends Person {
    private String occupation;
    private String industry;

    // Constructor that uses the Person constructor and adds occupation and industry
    public OccupationInfo(String name, String gender, String occupation, String industry) {
        super(name, gender);
        this.occupation = occupation;
        this.industry = industry;
    }

    // Method to display occupation information
    public void displayOccupationInfo() {
        System.out.println("Name: " + name + ", Occupation: " + occupation + ", Industry: " + industry);
    }
}
