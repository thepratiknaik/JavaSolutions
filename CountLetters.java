// Pratik Naik
/* Question 1: Write a program that prompts the user to enter a string and then counts 
the number of letters in the string.
*/ 
public class CountLetters {
    
    public static void main(String[] args) {

        int count = 0; // Initialize count to 0

        // Prompt the user to enter a string
        System.out.println("Enter a String to count the number of letters: ");
        String input = System.console().readLine();

        // Call the countLetters method to count the number of letters
        count = countLetters(input);

        // Output the total count of letters
        System.out.println("Total number of letters: " + count);


    }

    public static int countLetters(String s) {
        int count = 0; // Initialize count to 0

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is a letter
            if (Character.isLetter(s.charAt(i))) {
                count++; // Increment count if character is a letter
            }
        }

        return count; // Return the total count of letters
    }
}
