public class ActionFactory {
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
