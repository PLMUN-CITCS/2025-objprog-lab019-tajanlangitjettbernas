import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a non-negative integer input from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                
                System.out.print("Please enter a non-negative integer: ");
                String userInput = scanner.nextLine();
                
                int number = Integer.parseInt(userInput);
                
                if (number >= 0) {
                    return number; // Return the valid non-negative integer
                } else {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                // Handle invalid input (non-integer)
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        // Handle the base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Calculate factorial using a loop
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Main Program Flow
    public static void main(String[] args) {
        // Get a valid non-negative integer from the user
        int number = getNonNegativeInteger();
        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);
        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}