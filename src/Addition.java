public class Addition extends OperatorTwoOp {
	
	Addition (State state){
		super(state);
	}

    @Override
	public double apply(double x, double y){
		return x + y;
	}
}