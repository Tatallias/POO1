public class OperatorSign extends Operator {

    OperatorSign(State state) {
        super(state);
    }

    @Override
    public void execute() {
		if(!state.isError()){
			if(state.getText().startsWith("-")) { //negativ
				state.setText(state.getText().replace("-", ""), false);
			} else { //positiv
				state.setText('-' + state.getText(), false);
			}
		}
    }

}
