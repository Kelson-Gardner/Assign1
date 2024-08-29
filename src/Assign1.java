import java.math.BigInteger;

public class Assign1 {
    public static void printHelpMessage(){
        System.out.println("--- Assign 1 Help ---");
        System.out.println("  -fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]");
        System.out.println("  -fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]");
        System.out.println("  -e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
    }

    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static BigInteger factorial(int num){
        BigInteger product = BigInteger.ONE;
        for(int i = 2; i <= num; i++){
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
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
                        System.out.println("Please enter a valid input for fibonacci");
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
                        System.out.println("Please enter a valid input for factorial");
                    }
                }
                default -> System.out.println("Unknown command line argument: " + args[i]);
            }
        }
    }
}