public class OperatorClearError extends Operator {
	
	OperatorClearError(State state){
		super(state);
	}
	public void execute() {
		state.clearError();
		state.setText("0");
	}
	
}