import java.util.*;

public class State {
    private Stack<Double> stack;
    private String text;
    private boolean hasSaved;
    private double savedValue;
	private boolean error;
	private boolean wasOperation;
    
    public State() {
        stack = new Stack<Double>();
        text = new String("0");
        hasSaved = false;
    }
    
    public String getText() {
        return text;
    }
    
    public Stack<Double> getStack() {
        return stack;
    }
    
    public Object[] getStackAsTab() {
        Object[] array = stack.toArray();
        Collections.reverse(Arrays.asList(array));
        return array;
    }
    
    public void setText(String s, boolean wasOperation) {
         text = s;
         this.wasOperation = wasOperation;
    }
    
    public boolean hasSaved() {
        return hasSaved;
    }
    
    public double savedValue() {
        return savedValue;
    }
    
    public void setSavedValue(double x) {
        savedValue = x;
        hasSaved = true;
    }
	
	public void setError(String s) {
		error = true;
		text = s;
	}
	
	public boolean isError() {
		return error;
	}
	
	public void clearError() {
		error = false;
		text = "0";
	}
	
	public boolean wasOperation() {
	     return wasOperation;
	}
}
