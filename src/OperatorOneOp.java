public class OperatorOneOp implements Operator {
    private State state;
    private Operators op;
    
    public OperatorOneOp(Operators op, State state) {
        this.state = state;
        this.op = op;
    }
    
    @Override
    public void execute() {
        state.getStack().push(op.apply(state.getStack().pop()));
    }

    public enum Operators
    {
        UN_SUR() {
            @Override public double apply(double x) {
                return 1 / x;
            }
        },
        CARRE() {
            @Override public double apply(double x) {
                return x * x;
            }
        },
        SQRT() {
            @Override public double apply(double x) {
                return Math.sqrt(x);
            }
        };

        public abstract double apply(double x);
    }
}
