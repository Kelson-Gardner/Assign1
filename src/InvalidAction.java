/**
 * @author Kelson Gardner
 * The Invalid Action class generates a response when there is an invalid action argument
 */
public class InvalidAction implements ActionStrategy{
    /**
     * @author Kelson Gardner
     * Method for printing out the message when an invalid
     * input is entered.
     * @param input placeholder for the unknown argument
     */
    @Override
    public void execute(String input) {
        System.out.println("Unknown command line argument: " + input);
    }
}
