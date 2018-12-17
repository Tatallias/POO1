public class OperatorEnt extends Operator {
	
    public OperatorEnt(State state) {
        super(state);
    }
    
    @Override
    public void execute() {
		if(!state.isError()){
		    double d;
		    try{
		        d = Double.parseDouble(state.getText());
	            state.getStack().push(d);
	            state.setText("0", false);
		    } catch (Exception e){
		        state.setText("Syntax error", false);
		    }
		}
    }
}
