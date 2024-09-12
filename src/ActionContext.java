/**
 * @author Kelson Gardner
 * Action context class for the strategy pattern and polymorphism
 */
public class ActionContext {
    private ActionStrategy actionsStrategy;
    /**
     * @author Kelson Gardner
     * Sets the specific strategy for the action context and
     * takes advantage of the strategy pattern and
     * polymorphism.
     * @param actionStrategy Specific action to run
     */
    public void setStrategy(ActionStrategy actionStrategy){
        this.actionsStrategy = actionStrategy;
    }

    /**
     * @author Kelson Gardner
     * Returns the specific strategy used
     */
    public ActionStrategy getStrategy(){
        return this.actionsStrategy;
    }

    /**
     * @author Kelson Gardner
     * Runs the execute function on the action specified by setStrategy;
     * @param input input from user
     */
    public void run(String input){
        actionsStrategy.execute(input);
    }
}
