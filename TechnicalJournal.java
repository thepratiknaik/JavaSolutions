// TechnicalJournal class, which extends ReadingMaterial
public class TechnicalJournal extends ReadingMaterial {
    private String field;
    private String editor;

    // Constructor that uses the ReadingMaterial constructor and adds field and editor
    public TechnicalJournal(String title, int numPages, String field, String editor) {
        super(title, numPages);
        this.field = field;
        this.editor = editor;
    }

    // Method to review journal articles
    public void reviewArticles() {
        System.out.println("Reviewing articles in the \"" + title + "\" journal in the field of " + field + ", edited by " + editor + ".");
    }
}
