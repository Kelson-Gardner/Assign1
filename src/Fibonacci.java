public class Fibonacci {
    /**
     * @author Kelson Gardner
     * Calculates the fibonacci of a number entered by the user
     *
     * @param number value specified by the user
     * @return fibonacci calculation for number given by user
     */
    private static int fibonacci(int number){
        if(number == 0){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
