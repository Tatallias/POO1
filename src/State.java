import java.util.*;

public class State {
    private Stack<Double> stack;
    private String text;
    private boolean hasSaved;
    private double savedValue;
    
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
        return stack.toArray();
    }
    
    public void setText(String s) {
         text = s;
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
}
