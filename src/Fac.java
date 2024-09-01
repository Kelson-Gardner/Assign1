import java.math.BigInteger;

public class Fac implements ActionStrategy {
    /**
     * @author Kelson Gardner
     * Calculates the factorial of a number entered by the user
     *
     * @param number value specified by user
     * @return factorial calculation for number given by user
     */
    private BigInteger factorial(int number){
        BigInteger product = BigInteger.ONE;
        for(int i = 2; i <= number; i++){
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }

    @Override
    public void execute(String input){
        try {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Factorial valid range is [0, 2147483647]");
            } else {
                System.out.println("Factorial of " + number + " is " + factorial(number));
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid input for factorial calculation. Integer from range [0, 2147483647]");
        }
    }
}
