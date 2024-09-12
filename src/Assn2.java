/**
 * @author Kelson Gardner
 * Assn2 class allows users to enter in command line arguments to
 * run specific functions (fibonacci, factorial, iterations of e) with
 * specific values they desire.
 */
public class Assn2 {

    /**
     * @author Kelson Gardner
     * Main function that delegates the input from the command line to
     * run specific methods within the class.
     *
     * @param args command line input from user
     */
    public static void main(String[] args) {
        if(args.length == 0 || args.length % 2 != 0) {
            Help help = new Help();
            help.printHelpMessage();
            return;
        }

        ActionContext actions = new ActionContext();
        ActionFactory factory = new ActionFactory();

        for(int i = 0; i < args.length; i += 2){
            actions.setStrategy(factory.createAction(args[i]));
            if(actions.getStrategy().getClass().getName().equals("InvalidAction")){
                actions.run(args[i]);
            } else {
                actions.run(args[i + 1]);
            }
            }
        }
    }