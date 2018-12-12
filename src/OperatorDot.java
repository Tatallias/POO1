
public class OperatorDot extends Operator {

    OperatorDot(State state) {
        super(state);
    }

    @Override
    public void execute() {
		if(!state.isError()){
			state.setText(state.getText() + '.');
		}
    }

}
