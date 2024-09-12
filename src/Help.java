/**
 * @author Kelson Gardner
 * The Help class generates a help message
 * when there are no arguments or an invalid number of arguments
 */
public class Help {
    /**
     * @author Kelson Gardner
     * Prints the help message if there are no command line arguments
     * or an invalid amount of command line arguments.
     */
    public void printHelpMessage(){
        System.out.println("--- Assign 1 Help ---");
        System.out.println("  -fib [n] : Compute the Fibonacci of [n]; valid range [0, 40]");
        System.out.println("  -fac [n] : Compute the factorial of [n]; valid range, [0, 2147483647]");
        System.out.println("  -e [n] : Compute the value of 'e' using [n] iterations; valid range [1, 2147483647]");
    }
}
