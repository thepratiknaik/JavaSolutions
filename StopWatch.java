import java.time.Instant;

public class StopWatch {
    // Private data fields
    private Instant startTime;
    private Instant endTime;

    // No-arg constructor that initializes startTime with the current time
    public StopWatch() {
        this.startTime = Instant.now();
        this.endTime = null; // Initialize endTime to null
    }

    // Getter method for startTime
    public Instant getStartTime() {
        return startTime;
    }

    // Getter method for endTime
    public Instant getEndTime() {
        return endTime;
    }

    // Method to reset startTime to the current time
    public void start() {
        this.startTime = Instant.now();
        this.endTime = null; // Reset endTime when starting
    }

    // Method to set endTime to the current time
    public void stop() {
        this.endTime = Instant.now();
    }

    // Method to return the elapsed time in milliseconds
    public long getElapsedTime() {
        if (endTime == null) {
            return -1; // Return -1 if stopwatch has not been stopped yet
        }
        return endTime.toEpochMilli() - startTime.toEpochMilli();
    }

    public static void main(String[] args) {
        // Example usage
        StopWatch stopwatch = new StopWatch();
        
        // Simulate some work with a sleep
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stopwatch.stop();
        
        // Output elapsed time
        long elapsedTime = stopwatch.getElapsedTime();
        if (elapsedTime != -1) {
            System.out.println("Elapsed Time in milliseconds: " + elapsedTime);
        } else {
            System.out.println("Stopwatch has not been stopped yet.");
        }

        // Example of using getter methods
        System.out.println("Start Time: " + stopwatch.getStartTime());
        System.out.println("End Time: " + stopwatch.getEndTime());
    }
}
