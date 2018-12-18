public class Multiplication extends OperatorTwoOp {
	
    Multiplication (State state){
		super(state);
	}

    @Override
	public double apply(double x, double y) {
		return x * y;
	}
}