import java.util.Map;

public class Calculator {
    private State state;
    private Map<String, Operator> op;
    
    public Calculator() {
        state = new State();
        
        op.put("-", new Substraction(state));
        op.put("+", new Addition(state));
        op.put("*", new Multiplication(state));
        op.put("/", new Division(state));
        op.put("sqrt", new RacineCarre(state));
        op.put("1/", new UnSur(state));
        op.put("^2", new Carre(state));     
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
    }

    public void display() {
        for(double x : state.getStack())
            System.out.print(x + " ");
        System.out.println();
    }
}
