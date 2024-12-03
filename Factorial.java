public class Factorial {
    public static void main(String[] args) {
        // Input number directly in the code
        int number = 5; // You can change this value to calculate the factorial of any number
        
        // Calculate factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
