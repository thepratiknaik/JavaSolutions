public class TimeConverter {

    // Convert milliseconds to hours, minutes, and seconds
    public static String convertMillis(long millis) {
        long seconds = millis / 1000; // Convert milliseconds to seconds
        long hours = seconds / 3600; // Calculate hours
        seconds %= 3600; // Remaining seconds after calculating hours
        long minutes = seconds / 60; // Calculate minutes
        seconds %= 60; // Remaining seconds after calculating minutes

        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        // Test the convertMillis method with different values
        System.out.println(convertMillis(5500));         // Output: 0:0:5
        System.out.println(convertMillis(100000));       // Output: 0:1:40
        System.out.println(convertMillis(555550000));    // Output: 154:19:10
    }
}
