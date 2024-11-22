public class GoalTracker {
    public static void main(String[] args) {
        // Creating NumberOfGoals objects for different matches
        NumberOfGoals match1 = new NumberOfGoals();
        NumberOfGoals match2 = new NumberOfGoals();

        // Simulating goals for match1
        match1.setGoal();
        match1.setGoal();

        // Simulating goals for match2
        match2.setGoal();

        // Displaying the total goals for each match
        System.out.println("Goals scored in match 1: " + match1.getGoal());
        System.out.println("Goals scored in match 2: " + match2.getGoal());

        // Simulating more goals in match1
        match1.setGoal();

        // Displaying updated total goals for match1
        System.out.println("Updated goals scored in match 1: " + match1.getGoal());
    }
}

public class NumberOfGoals {
    // Instance variable to store the number of goals scored
    private int goals;

    // Constructor that initializes the number of goals to zero
    public NumberOfGoals() {
        this.goals = 0;
    }

    // Method to increment the number of goals by one whenever a goal is scored
    public void setGoal() {
        this.goals += 1;
    }

    // Method to return the total number of goals scored so far
    public int getGoal() {
        return this.goals;
    }
}