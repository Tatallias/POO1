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
    
    /**
     * Defines a function to be applied on the entry field of the state
     * 
     * @param x     the operand of the function
     * @return      the result of the function applied on the operand
     */
    abstract double apply(double x);
}
