import java.math.BigDecimal;
import java.math.MathContext;

public class ValueOfE {
    /**
     * @author Kelson Gardner
     * Calculates the factorial of a number for the valueOfE function
     * since the original factorial function returns a BigInteger
     * and you cannot cast from a BigInteger to BigDecimal.
     *
     * @param number value specified by user
     * @return factorial calculation for number given by user
     */
    private static BigDecimal factorialForE(int number){
        BigDecimal product = BigDecimal.ONE;
        for(int i = 2; i <= number; i++){
            product = product.multiply(BigDecimal.valueOf(i));
        }
        return product;
    }

    /**
     * @author Kelson Gardner
     * Calculates the value of E to the specific number of iterations entered in by user
     *
     * @param number value specified by user
     * @return value of e with num amount of iterations
     */
    private static BigDecimal valueOfE(int number){
        BigDecimal value = BigDecimal.ONE;
        for(int i = 1; i < number; i++){
            BigDecimal adder = BigDecimal.ONE.divide(factorialForE(i), MathContext.DECIMAL128);
            value = value.add(adder);
        }
        return value;
    }
}
