import java.util.*;

public class State {
    private Stack stack;
    private String text;
    
    public State() {
        stack = new Stack();
        text = new String("0");
    }
    
    public String getText() {
        return text;
    }
    
    public Object[] getStackAsTab() {
        return stack.toArray();
    }
    
    public void addText(String s) {
         text += s;
    }
}
