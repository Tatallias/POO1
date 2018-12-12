
public class OperatorDot extends Operator {

    OperatorDot(State state) {
        super(state);
    }

    @Override
    public void execute() {
        state.setText(state.getText() + '.');
    }

}
