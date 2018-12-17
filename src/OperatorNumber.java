public class OperatorNumber extends Operator{
    private int n;
    
    public OperatorNumber(int n, State state) {
        super(state);
        this.n = n;
    }

    @Override
    public void execute() {
		if(!state.isError()){
		    if(state.wasOperation()) {
    			state.getStack().push(checkEntry());
    			state.setText(Integer.toString(n), false);
		    } else {
		        if(state.getText().equals("0")) {
                    state.setText(Integer.toString(n), false);
                } else {
                    state.setText(state.getText() + Integer.toString(n), false);
                } 
		    }
		}		
    }
}
