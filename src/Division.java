public class Division extends OperatorTwoOp {
	Division (State state){
		super(state);
	}
	public double apply(double x, double y){
		return x / y;
	}
}