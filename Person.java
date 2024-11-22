// Base class representing a person with basic information
public class Person {
    protected String name;
    protected String gender;

    // Constructor to initialize basic attributes
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    // Method to display basic information about the person
    public void displayBasicInfo() {
        System.out.println("Name: " + name + ", Gender: " + gender);
    }
}
