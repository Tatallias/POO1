public class Division extends OperatorTwoOp {
	Division (State state){
		super(state);
	}
	
	public double apply(double x, double y){
		if(y == 0) { // Division par 0
			state.setError("Divide by 0");
			state.getStack().push(y);
			return x;
		} else {
			return x / y;
		}
	}
}