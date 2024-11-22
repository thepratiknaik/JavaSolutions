// Main class to test and demonstrate the functionality of various reading material classes
public class Library {

    public static void main(String[] args) {
        // Creating instances of different types of reading materials
        Book book = new Book("In Search of Lost Time", 4215, "Marcel Proust");
        Novel novel = new Novel("Pride and Prejudice", 279, "Jane Austen", new String[] {"Elizabeth Bennet", "Mr. Darcy"});
        Magazine magazine = new Magazine("National Geographic", 120, "November 2024");
        TechnicalJournal techJournal = new TechnicalJournal("IEEE Transactions on Computers", 85, "Computer Science", "Dr. James Lee");
        Textbook textbook = new Textbook("Calculus", 1024, "Mathematics", "College");

        // Displaying information and exercising each material’s specific methods
        book.showInfo();
        book.readBook();

        novel.showInfo();
        novel.explorePlot();

        magazine.showInfo();
        magazine.browseMagazine();

        techJournal.showInfo();
        techJournal.reviewArticles();

        textbook.showInfo();
        textbook.studyTextbook();
    }
}
