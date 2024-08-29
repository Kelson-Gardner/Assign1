public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("--- Assign 1 Help ---");
            System.out.println("  -fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]");
            System.out.println("  -fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]");
            System.out.println("  -e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
        }
    }
}