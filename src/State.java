import java.util.*;

public class State {
    private Stack<Double> stack;
    private String text;
    
    public State() {
        stack = new Stack<Double>();
        text = new String("0");
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
}
