public class ActionContext {
    private ActionStrategy actionsStrategy;
    public ActionContext(){}
    public ActionContext(ActionStrategy actionStrategy){
        this.actionsStrategy = actionStrategy;
    }

    public void setStrategy(ActionStrategy actionStrategy){
        this.actionsStrategy = actionStrategy;
    }

    public void run(String input){
        actionsStrategy.execute(input);
    }
}
