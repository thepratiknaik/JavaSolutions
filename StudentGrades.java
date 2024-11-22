import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create an array to hold the scores
        int[] scores = new int[numberOfStudents];

        // Prompt the user to enter each student's score
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = scanner.nextInt();
        }

        // Find the best score in the array
        int bestScore = getBestScore(scores);

        // Display each student's score and grade
        for (int i = 0; i < numberOfStudents; i++) {
            int grade = getGrade(scores[i], bestScore);
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + (char) grade);
        }
    }

    // Method to find the best score
    private static int getBestScore(int[] scores) {
        int best = scores[0];
        for (int score : scores) {
            if (score > best) {
                best = score;
            }
        }
        return best;
    }

    // Method to determine the grade based on the score and best score
    private static int getGrade(int score, int best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
