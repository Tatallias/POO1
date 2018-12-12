
public class RacineCarre extends OperatorOneOp {
    public RacineCarre(State state) {
        super(state);
        // TODO Auto-generated constructor stub
    }
    
    public double apply(double x) {
		if( x < 0 ){
			state.setError("sqrt of negativ value");
			return x;
		}
        return Math.sqrt(x);
    }
}