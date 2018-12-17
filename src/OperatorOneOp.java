public abstract class OperatorOneOp extends Operator {
    
    public OperatorOneOp(State state) {
        super(state);
    }

    @Override
    public void execute() {
		if(!state.isError()){
		    Double d = checkEntry();
            if(!d.isNaN()) {
                state.setText(((Double) apply(d)).toString());
            }
		}
    }
    
    abstract double apply(double x);
}
