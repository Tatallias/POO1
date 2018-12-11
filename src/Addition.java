public class Addition extends OperatorTwoOp {
	
	Addition (State state){
		super(state);
	}
	public double apply(double x, double y){
		return x + y;
	}
}