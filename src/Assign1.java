import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.DecimalFormat;

/**
 * @author Kelson Gardner
 * Assign1 class allows users to enter in command line arguments to
 * run specific functions (fibonacci, factorial, iterations of e) with
 * specific values they desire.
 */
public class Assign1 {
    /**
     * @author Kelson Gardner
     * Prints the help message if there are no command line arguments
     * or an invalid amount of command line arguments.
     */
    public static void printHelpMessage(){
        System.out.println("--- Assign 1 Help ---");
        System.out.println("  -fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]");
        System.out.println("  -fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]");
        System.out.println("  -e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
    }

    /**
     * @author Kelson Gardner
     * Main function that delegates the input from the command line to
     * run specific methods within the class.
     *
     * @param args command line input from user
     */
    public static void main(String[] args) {
        if(args.length == 0 || args.length % 2 != 0) {
            printHelpMessage();
            return;
        }

        for(int i = 0; i < args.length; i += 2){
            switch (args[i]) {
                case "-fib" -> {
                    try {
                        int number = Integer.parseInt(args[i + 1]);
                        if (number < 0 || number > 40) {
                            System.out.println("Fibonacci valid range is [0, 40]");
                        } else {
                            System.out.println("Fibonacci of " + number + " is " + fibonacci(number));
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid input for fibonacci calculation. Integer from range [0, 40]");
                    }
                }
                case "-fac" -> {
                    try {
                        int number = Integer.parseInt(args[i + 1]);
                        if (number < 0) {
                            System.out.println("Factorial valid range is [0, 2147483647]");
                        } else {
                            System.out.println("Factorial of " + number + " is " + factorial(number));
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid input for factorial calculation. Integer from range [0, 2147483647]");
                    }
                }
                case "-e" -> {
                    try{
                        int number = Integer.parseInt(args[i + 1]);
                        DecimalFormat decimalFormat = new DecimalFormat("#.################");
                        decimalFormat.setMaximumFractionDigits(16);

                        if(number < 1){
                            System.out.println("Valid e iterations range is [1, 2147483647]");
                        } else {
                            System.out.println("Value of e using " + number + " iterations is " + decimalFormat.format(valueOfE(number)));
                        }
                    } catch (NumberFormatException e){
                        System.out.println("Please enter a valid input for e iterations. Integer from range [0, 2147483647]");
                    }
                }
                default -> System.out.println("Unknown command line argument: " + args[i]);
            }
        }
    }
}