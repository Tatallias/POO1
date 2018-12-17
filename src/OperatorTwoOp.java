public abstract class OperatorTwoOp extends Operator {

    OperatorTwoOp(State state) {
        super(state);
    }
	public void execute(){
		if(!state.isError()){
			if (state.getStack().size() < 1){
				state.setError("Too few arguments");
			}else{	
			    Double d = checkEntry();
			    if(!d.isNaN()) {
	                state.setText(((Double) apply(d, state.getStack().pop())).toString());
			    }
			}
		}
	}
	
	abstract double apply(double x, double y);
}
