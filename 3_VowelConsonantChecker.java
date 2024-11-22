import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        
        if (isVowel(letter)) {
            System.out.println(letter + " is a vowel");
        } else if (Character.isLetter(letter)) {
            System.out.println(letter + " is a consonant");
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }
        
        scanner.close();
    }
    
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}