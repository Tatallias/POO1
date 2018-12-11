public abstract class OperatorTwoOp implements Operator {
    protected State state;
    
    OperatorTwoOp(State state) {
        this.state = state;
    }
	public void execute(){
		state.getStack().push(apply(state.getStack().pop(),state.getStack().pop()));
	}
	
	abstract double apply(double x, double y);
}
