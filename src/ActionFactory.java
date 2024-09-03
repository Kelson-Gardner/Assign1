public class ActionFactory {
    /**
     * Factory for creating different actions
     * @param input input from user
     * @return an action object
     */
    public ActionStrategy createAction(String input){
        switch(input){
            case "-fib" -> {
                return new Fib();
            }
            case "-fac" -> {
                return new Fac();
            }
            case "-e" -> {
                return new E();
            }
            default -> {
                return new InvalidAction();
            }
        }
    }
}
