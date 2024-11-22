public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0; // Count the number of prime numbers
        int number = 2; // Begin testing prime numbers from 2
        int primesPerLine = 10; // Number of primes to display per line
        int totalPrimes = 50; // Number of primes to find and display

        while (count < totalPrimes) {
            boolean isPrime = true; // Assume number is prime

            // Check if the number is divisible by any number up to its square root
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false; // It's not prime
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                count++; // Increase the count of primes found
                System.out.print(number + " ");

                // After printing 10 primes, move to the next line
                if (count % primesPerLine == 0) {
                    System.out.println();
                }
            }

            number++; // Test the next number
        }
    }
}
