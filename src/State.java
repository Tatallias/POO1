import java.util.*;

public class State {
    private Stack<Double> stack;
    private String text;
    private boolean hasSaved;
    private double savedValue;
	private boolean error;
	private boolean wasOperation;
    
	/**
	 * Generates an empty state for a reverse polish notation calculator
	 */
    public State() {
        stack = new Stack<Double>();
        text = new String("0");
        hasSaved = false;
        wasOperation = false;
    }
    
    /**
     * Return the text field of the calculator
     * 
     * @return  the text field of the state
     */
    public String getText() {
        return text;
    }
    
    /**
     * Return the current status of the stack 
     * 
     * @return  the stack
     */
    public Stack<Double> getStack() {
        return stack;
    }
    
    /**
     * Return the current status of the stack as an Object array
     * reversed for display purpose
     * 
     * @return  the stack as an Object array reversed for display purpose
     */
    public Object[] getStackAsTab() {
        Object[] array = stack.toArray();
        Collections.reverse(Arrays.asList(array));
        return array;
    }
    
    /**
     * Replace the text with the String passed on parameter and defines
     * if the replacement was due to an arithmetic operation or not
     * 
     * @param s     the String which replaces the current text field
     * @param wasOperation  True if the replacement was due to an arithmetic
     *       operation, false otherwise
     */
    public void setText(String s, boolean wasOperation) {
         text = s;
         this.wasOperation = wasOperation;
    }
    
    /**
     * Returns whether a field as been saved
     * 
     * @return     whether a field as been saved
     */
    public boolean hasSaved() {
        return hasSaved;
    }
    
    /**
     * Returns the saved value
     * 
     * @return      the saved value
     */
    public double savedValue() {
        return savedValue;
    }
    
    /**
     * Replace the saved value with the double passed by parameter
     * 
     * @param x     the replacement value
     */
    public void setSavedValue(double x) {
        savedValue = x;
        hasSaved = true;
    }
	
    /**
     * Replaces the text field with the Error message and sets 
     * the state on error
     * 
     * @param s     the error text message
     */
	public void setError(String s) {
		error = true;
		text = s;
	}
	
	/**
	 * Returns whether the state had an error
	 * 
	 * @return     True if the state is on Error, false otherwise
	 */
	public boolean isError() {
		return error;
	}
	
	/**
	 * Restores the state out of the error state and reset the display
	 */
	public void clearError() {
		error = false;
		text = "0";
	}
	
	/**
	 * Returns whether the previous manipulation was an arithmetic operation
	 * 
	 * @return     True if the last operation was an arithmetic
	 *          operation, false otherwise
	 */
	public boolean wasOperation() {
	     return wasOperation;
	}
}
