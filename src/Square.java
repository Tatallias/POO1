public class Square extends OperatorOneOp{
    public Square(State state) {
        super(state);
    }

    @Override
    public double apply(double x) {
        return x * x;
    }
}
