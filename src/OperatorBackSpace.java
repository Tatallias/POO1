public class OperatorBackSpace extends Operator {

    public OperatorBackSpace(State state) {
        super(state);
    }

    @Override
    public void execute() {
		if(!state.isError()){
			if(!state.getText().isEmpty()) {
				if(state.getText().length() == 1) {
					state.setText("0");
				} else {
					state.setText(state.getText().substring(0, state.getText().length() - 1));
				}
			}
		}
    }

}
