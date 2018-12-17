public abstract class OperatorOneOp extends Operator {
    
    public OperatorOneOp(State state) {
        super(state);
    }

    @Override
    public void execute() {
		if(!state.isError()){
		    Double d = checkEntry();
            if(!d.isNaN()) {
                d = apply(d);

                if(!state.isError()){
                    state.setText(d.toString(), true);
                }
            }
		}
    }
    
    abstract double apply(double x);
}
