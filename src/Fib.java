public class Fib implements ActionStrategy {
    /**
     * @author Kelson Gardner
     * Calculates the fibonacci of a number entered by the user
     *
     * @param number value specified by the user
     * @return fibonacci calculation for number given by user
     */
    private int fibonacci(int number){
        if(number == 0){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    /**
     * Execute method that runs the fibonacci method and prints out the results.
     * @param input input entered by the user
     */
    @Override
    public void execute(String input){
        try {
            int number = Integer.parseInt(input);
            if (number < 0 || number > 40) {
                System.out.println("Fibonacci valid range is [0, 40]");
            } else {
                System.out.println("Fibonacci of " + number + " is " + fibonacci(number));
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid input for fibonacci calculation. Integer from range [0, 40]");
        }
    }
}
