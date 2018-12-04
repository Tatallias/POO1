public class OperatorNumber implements Operator{
    private int n;
    private State state;
    
    public OperatorNumber(int n, State state) {
        this.n = n;
        this.state = state;
    }

    @Override
    public void execute() {
        if(state.getText().equals("0")) {
            state.setText(Integer.toString(n));
        } else {
            state.setText(state.getText() + Integer.toString(n));
        }        
    }
}
