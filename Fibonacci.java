// Hanna Melo Fugulin - Assignment 1

// Instructions: Implement a Java class that contains two methods
// A recursive static method that returns the nth term in the Fibonacci sequence.
// The method should accept n as a parameter. Do not include javadoc code in your implementation (yet).
// A main method that calls the first method. Pass in 10 as an argument.
// Output the 10th term of the Fibonacci sequence along with some descriptive text, e.g. "The nth term of the Fibonacci sequence is y."
// Don't hard-code the results; output the appropriate variables.
public class Fibonacci {
    // Recursive static method to return the nth term in the Fibonacci sequence
    /**
     * Calculates the nth term in the Fibonacci sequence using recursion.
     *
     * @param n The position in the Fibonacci sequence (must be a non-negative integer).
     * @return The nth term in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Main method
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result);
    }
}
