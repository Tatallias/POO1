public class OperatorDot extends Operator {

    OperatorDot(State state) {
        super(state);
    }

    @Override
    public void execute() {
		if(!state.isError()){
		    if(state.wasOperation()) {
		        state.getStack().push(checkEntry());
	            state.setText("0.", false);
		    } else {
		        state.setText(state.getText() + '.', false);
		    }
		}
    }

}
