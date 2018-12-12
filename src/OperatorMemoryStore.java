
public class OperatorMemoryStore extends Operator {

    public OperatorMemoryStore(State state) {
        super(state);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        state.setSavedValue(Double.parseDouble(state.getText()));
    }

}
