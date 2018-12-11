
public class UnSur extends OperatorOneOp {

    public UnSur(State state) {
        super(state);
    }
    
    public double apply(double x) {
        return 1 / x;
    }
}
