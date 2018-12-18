public class OperatorNumber extends Operator{
    private int n;
    
    /**
     * Generates a new OperatorNumber, wish corresponds to pressing a number button.
     * 
     * @param state     A state defining the current status of a Calculator
     * @param n         The number to be added
     */
    public OperatorNumber(int n, State state) {
        super(state);
        this.n = n;
    }

    @Override
    public void execute() {
		if(!state.isError()){
		    // if previous manipulation was an operation, 
		    // we push the current value on the stack
		    if(state.wasOperation()) {
    			state.getStack().push(checkEntry());
    			state.setText(Integer.toString(n), false);
		    } else {
		        if(state.getText().equals("0")) { // replaces the 0
                    state.setText(Integer.toString(n), false);
                } else { // Standard concatenation 
                    state.setText(state.getText() + Integer.toString(n), false);
                } 
		    }
		}		
    }
}
