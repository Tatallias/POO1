
public class OperatorNumber implements Operator{
    private int n;
    private State state;
    
    public OperatorNumber(int n, State state) {
        this.n = n;
        this.state = state;
    }

    @Override
    public void execute() {
        state.addText(Integer.toString(n));
    }
}
