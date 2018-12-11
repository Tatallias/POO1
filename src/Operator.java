public abstract class Operator {
    protected State state;

    Operator(State state) {
        this.state = state;
    }
    
    public abstract void execute();
}