public abstract class OperatorTwoOp extends Operator {

    OperatorTwoOp(State state) {
        super(state);
    }
	public void execute(){
		if(!state.isError()){
			if ( 2 > state.getStack().size()){
				state.setError("Too few arguments");
			}else{	
				state.getStack().push(apply(state.getStack().pop(),state.getStack().pop()));
			}
		}
	}
	
	abstract double apply(double x, double y);
}
