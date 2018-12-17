public class OperatorMemoryStore extends Operator {

    public OperatorMemoryStore(State state) {
        super(state);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
		if(!state.isError()){
			state.setSavedValue(Double.parseDouble(state.getText()));
		}
    }

}
