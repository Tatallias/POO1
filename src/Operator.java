public abstract class Operator {
    protected State state;

    Operator(State state) {
        this.state = state;
    }
    
    protected Double checkEntry() {
        try{
            return Double.parseDouble(state.getText());
        } catch (Exception e){
            state.setError("Syntax error");
            return Double.NaN;
        }
    }
    public abstract void execute();
}