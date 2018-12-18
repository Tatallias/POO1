public class OneOver extends OperatorOneOp {

    public OneOver(State state) {
        super(state);
    }

    @Override
    public double apply(double x) {
		if( x == 0 ) {
			state.setError("Divide by 0");
			return x;
		} else {
			return 1 / x;
		}
    }
}
