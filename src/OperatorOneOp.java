public abstract class OperatorOneOp extends Operator {
    
    public OperatorOneOp(State state) {
        super(state);
    }

    @Override
    public void execute() {
        state.getStack().push(apply(state.getStack().pop()));
    }
    
    abstract double apply(double x);
}
