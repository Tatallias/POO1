public class OperatorEnt implements Operator {
    private State state;
    
    public OperatorEnt(State state) {
        this.state = state;
    }
    
    @Override
    public void execute() {
        state.getStack().push(Double.parseDouble(state.getText()));
        state.setText("");
    }

}
