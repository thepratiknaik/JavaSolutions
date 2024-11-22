import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int)(Math.random() * 101);
        System.out.println(random);
        int guess = -1;
        while (guess != random) {
            System.out.print("Enter a guess: ");
            guess = input.nextInt();
            if (guess == random) {
                System.out.println("Yes, the number is " + random);
            } else if (guess > random) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }
    }
}