import java.math.BigInteger;

public class Factorial {
    /**
     * @author Kelson Gardner
     * Calculates the factorial of a number entered by the user
     *
     * @param number value specified by user
     * @return factorial calculation for number given by user
     */
    private static BigInteger factorial(int number){
        BigInteger product = BigInteger.ONE;
        for(int i = 2; i <= number; i++){
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }
}
