// Novel class, which extends Book
public class Novel extends Book {
    private String[] mainCharacters;

    // Constructor that uses the Book constructor and adds main characters
    public Novel(String title, int numPages, String author, String[] mainCharacters) {
        super(title, numPages, author);
        this.mainCharacters = mainCharacters;
    }

    // Method to display information specific to novels
    public void explorePlot() {
        System.out.print("Exploring the plot of \"" + title + "\" featuring characters: ");
        for (String character : mainCharacters) {
            System.out.print(character + " ");
        }
        System.out.println();
    }
}
