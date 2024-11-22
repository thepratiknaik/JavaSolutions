// Magazine class, which extends ReadingMaterial
public class Magazine extends ReadingMaterial {
    private String issueDate;

    // Constructor that uses the ReadingMaterial constructor and adds issue date
    public Magazine(String title, int numPages, String issueDate) {
        super(title, numPages);
        this.issueDate = issueDate;
    }

    // Method to browse the magazine
    public void browseMagazine() {
        System.out.println("Browsing the magazine \"" + title + "\" - Issue Date: " + issueDate + ".");
    }
}
