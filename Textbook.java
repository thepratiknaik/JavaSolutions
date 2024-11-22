// Textbook class, which extends ReadingMaterial
public class Textbook extends ReadingMaterial {
    private String subject;
    private String level;

    // Constructor that uses the ReadingMaterial constructor and adds subject and level
    public Textbook(String title, int numPages, String subject, String level) {
        super(title, numPages);
        this.subject = subject;
        this.level = level;
    }

    // Method to study the textbook
    public void studyTextbook() {
        System.out.println("Studying \"" + title + "\" textbook on " + subject + " for " + level + " level.");
    }
}
