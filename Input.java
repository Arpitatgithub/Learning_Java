import java.util.Scanner; // Import Scanner for user input

class Input {
    // Method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i < number; i++) { // Loop from 2 to number - 1
            if (number % i == 0) {
                return false; // If divisible by i, not a prime number
            }
        }
        return true; // If no divisors found, it's a prime number
    }
}

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt(); // Take input from user

        PrimeChecker primeChecker = new PrimeChecker(); // Create object of PrimeChecker class

        // Call the isPrime method and display the result
        if (primeChecker.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close(); // Close the scanner
    }
}
