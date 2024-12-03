public class Factorial {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        // Convert the first argument to an integer
        int number = Integer.parseInt(args[0]);
        
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
