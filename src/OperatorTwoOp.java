public abstract class OperatorTwoOp extends Operator {

    OperatorTwoOp(State state) {
        super(state);
    }
	public void execute(){
		state.getStack().push(apply(state.getStack().pop(),state.getStack().pop()));
	}
	
	abstract double apply(double x, double y);
}
