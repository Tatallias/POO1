import java.util.*;

public class State {
    private Stack stack;
    private String text;
    
    public String getText() {
        return text;
    }
    
    public Object[] getStackAsTab() {
        return stack.toArray();
    }
}
