public class OperatorTwoOp implements Operator {
    private State state;
    private Operators op;
    
    public OperatorTwoOp(Operators op, State state) {
        this.state = state;
        this.op = op;
    }
    
    @Override
    public void execute() {
        state.getStack().push(op.apply(state.getStack().pop(), state.getStack().pop()));
    }
    
    public enum Operators
    {
        ADDITION() {
            @Override public double apply(double x1, double x2) {
                return x1 + x2;
            }
        },
        SUBTRACTION() {
            @Override public double apply(double x1, double x2) {
                return x1 - x2;
            }
        },
        DIVISION() {
            @Override public double apply(double x1, double x2) {
                return x1 / x2;
            }
        },
        MULTIPLICATION() {
            @Override public double apply(double x1, double x2) {
                return x1 * x2;
            }
        };
        
        public abstract double apply(double x1, double x2);
    }
}
