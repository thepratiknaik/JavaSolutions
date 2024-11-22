// Class to store age-related information
public class AgeInfo extends Person {
    private int age;

    // Constructor that uses the Person constructor and adds age
    public AgeInfo(String name, String gender, int age) {
        super(name, gender);
        this.age = age;
    }

    // Method to display age information
    public void displayAgeInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
