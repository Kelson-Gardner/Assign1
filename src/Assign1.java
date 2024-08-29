/**
 * @author Kelson Gardner
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.DecimalFormat;

public class Assign1 {
    /**
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
     *
     * @param num value specified by the user
     * @return fibonacci calculation for number given by user
     */
    private static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    /**
     * Calculates the factorial of a number entered by the user
     *
     * @param num value specified by user
     * @return factorial calculation for number given by user
     */
    private static BigInteger factorial(int num){
        BigInteger product = BigInteger.ONE;
        for(int i = 2; i <= num; i++){
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }

    /**
     * Calculates the factorial of a number for the valueOfE function
     *
     * @param num value specified by user
     * @return factorial calculation for number given by user
     */
    private static BigDecimal factorialForE(int num){
        BigDecimal product = BigDecimal.ONE;
        for(int i = 2; i <= num; i++){
            product = product.multiply(BigDecimal.valueOf(i));
        }
        return product;
    }

    /**
     * Calculates the value of E to the specific number entered in by user
     *
     * @param num value specified by user
     * @return value of e with num amount of calculations
     */
    private static BigDecimal valueOfE(int num){
        BigDecimal value = BigDecimal.ONE;
        for(int i = 1; i < num; i++){
            BigDecimal adder = BigDecimal.ONE.divide(factorialForE(i),MathContext.DECIMAL128);
            value = value.add(adder);
        }
        return value;
    }
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