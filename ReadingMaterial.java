// Base class for all types of reading material
public class ReadingMaterial {
    protected String title;
    protected int numPages;

    // Constructor to initialize common attributes
    public ReadingMaterial(String title, int numPages) {
        this.title = title;
        this.numPages = numPages;
    }

    // Method to display basic information about the reading material
    public void showInfo() {
        System.out.println("Title: " + title + ", Pages: " + numPages);
    }
}