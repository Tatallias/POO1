public class OperatorClear extends OperatorClearError {
	
	OperatorClear(State state) {
		super(state);
	}
	
	public void execute () {
		super.execute();
		state.getStack().clear();
	}
}