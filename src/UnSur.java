public class UnSur extends OperatorOneOp {

    public UnSur(State state) {
        super(state);
    }
    
    public double apply(double x) {
		if( x == 0 ){
			state.setError("Divide by 0");
			return x;
		} else {
			return 1 / x;
		}
    }
}
