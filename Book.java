// Book class, which extends ReadingMaterial
public class Book extends ReadingMaterial {
    private String author;

    // Constructor that uses the ReadingMaterial constructor and adds the author
    public Book(String title, int numPages, String author) {
        super(title, numPages);
        this.author = author;
    }

    // Method to display information specific to books
    public void readBook() {
        System.out.println("Reading the book titled \"" + title + "\" by " + author + ".");
    }
}
