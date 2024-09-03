public class ActionContext {
    private ActionStrategy actionsStrategy;
    /**
     * Sets the specific strategy for the action context and
     * takes advantage of the strategy pattern and
     * polymorphism.
     * @param actionStrategy Specific action to run
     */
    public void setStrategy(ActionStrategy actionStrategy){
        this.actionsStrategy = actionStrategy;
    }

    /**
     * Runs the execute function on the action specified by setStrategy;
     * @param input input from user
     */
    public void run(String input){
        actionsStrategy.execute(input);
    }
}
