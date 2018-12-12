
public class OperatorSign extends Operator {

    OperatorSign(State state) {
        super(state);
    }

    @Override
    public void execute() {
        if(state.getText().startsWith("-")) { //negatif
            state.setText(state.getText().replace("-", ""));
        } else { //positif
            state.setText('-' + state.getText());
        }
    }

}
