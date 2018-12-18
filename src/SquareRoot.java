public class SquareRoot extends OperatorOneOp {
    public SquareRoot(State state) {
        super(state);
    }

    @Override
    public double apply(double x) {
		if( x < 0 ) { //Sqrt of negativ impossible
			state.setError("Sqrt of negativ value");
			return x;
		}
        return Math.sqrt(x);
    }
}