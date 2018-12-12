public abstract class OperatorOneOp extends Operator {
    
    public OperatorOneOp(State state) {
        super(state);
    }

    @Override
    public void execute() {
		if(!state.isError()){
			if(state.getStack().empty()){
				state.setError("Too few arguments");
			} else {
				state.getStack().push(apply(state.getStack().pop()));
			}
		}
    }
    
    abstract double apply(double x);
}
