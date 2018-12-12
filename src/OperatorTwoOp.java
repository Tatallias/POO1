public abstract class OperatorTwoOp extends Operator {

    OperatorTwoOp(State state) {
        super(state);
    }
	public void execute(){
	    try {
	        state.getStack().push(apply(state.getStack().pop(),state.getStack().pop()));
	    } catch (Exception e) {
	        state.setText("Error : missing operand");
	    }
	}
	
	abstract double apply(double x, double y);
}
