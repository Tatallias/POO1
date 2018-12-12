public class OperatorEnt extends Operator {
    
    public OperatorEnt(State state) {
        super(state);
    }
    
    @Override
    public void execute() {
        state.getStack().push(Double.parseDouble(state.getText()));
        state.setText("0");
    }
}
