public class InvalidAction implements ActionStrategy{
    @Override
    public void execute(String input) {
        System.out.println("Unknown command line argument: " + input);
    }
}
