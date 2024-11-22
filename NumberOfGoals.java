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