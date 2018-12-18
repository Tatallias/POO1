public abstract class Operator {
    protected State state;

    /**
     * Generates a new Operator. Not functionnal but factorizes 
     * the state field for sub-classes.
     * 
     * @param state     A state defining the current status of a Calculator
     */
    Operator(State state) {
        this.state = state;
    }
    
    /**
     * Checks the text field of the state and returns the value of the text if 
     * it's a valid Double, returns Double.Nan and sets the status on Syntex error otherwise
     * 
     * @return  the text field of the state field as Double, Double.Nan if invalid.
     */
    protected Double checkEntry() {
        try{
            return Double.parseDouble(state.getText());
        } catch (Exception e){
            state.setError("Syntax error");
            return Double.NaN;
        }
    }
    
    /**
     * Update the state accordingly to the desired operation
     */
    public abstract void execute();
}