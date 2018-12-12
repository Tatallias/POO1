
public class OperatorMemoryRestore extends Operator {

    public OperatorMemoryRestore(State state) {
        super(state);
    }

    @Override
    public void execute() {
		if(!state.isError()){
			if(state.hasSaved()) {
				state.setText(Double.toString(state.savedValue()));  
			}
		}
    }
}
