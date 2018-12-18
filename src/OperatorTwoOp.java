public abstract class OperatorTwoOp extends Operator {

    OperatorTwoOp(State state) {
        super(state);
    }
    
    @Override
	public void execute(){
		if(!state.isError()){
			if (state.getStack().size() < 1){
				state.setError("Too few arguments");
			}else{	
			    Double d = checkEntry();
			    if(!d.isNaN()) {
			        d = apply(state.getStack().pop(), d);

			        if(!state.isError()){
			            state.setText(d.toString(), true);
			        }
			    }
			}
		}
	}
	
	abstract double apply(double x, double y);
}
