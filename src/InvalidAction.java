public class InvalidAction implements ActionStrategy{
    /**
     * Method for printing out the message when an invalid
     * input is entered.
     * @param input placeholder for the unknown argument
     */
    @Override
    public void execute(String input) {
        System.out.println("Unknown command line argument: " + input);
    }
}
