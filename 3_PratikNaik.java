import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input to enter a letter
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);


        // Display if the letter is a vowel or a consonant
        if (isVowel(letter)) {
            System.out.println(letter + " is a vowel");
        } else if (Character.isLetter(letter)) {
            System.out.println(letter + " is a consonant");
        } else {
            System.out.println("Invalid input");
        }
    }

    // Method to check if the letter is a vowel
    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}
