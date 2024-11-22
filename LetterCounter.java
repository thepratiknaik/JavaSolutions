import java.util.Scanner;

public class LetterCounter {
    
    // Method to count the number of letters in the string
    public static int countLetters(String s) {
        int letterCount = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is a letter
            if (Character.isLetter(s.charAt(i))) {
                letterCount++;
            }
        }
        
        return letterCount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // User enters a string
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        
        // Display the number of letters in the string
        System.out.println("The number of letters in the string is: " + countLetters(userInput));

    }
}
