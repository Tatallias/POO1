import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    private State state;
    private Map<String, Operator> op;
    private Scanner scanner;
    
    public Calculator() {
        state = new State();
        scanner = new Scanner(System.in);
        
        op = new HashMap<String, Operator>();
        op.put("-", new Substraction(state));
        op.put("+", new Addition(state));
        op.put("*", new Multiplication(state));
        op.put("/", new Division(state));
        op.put("sqrt", new RacineCarre(state));
        op.put("1/", new UnSur(state));
        op.put("^2", new Carre(state));     
    }
    
    public void step() {
        String input = scanner.nextLine();
        
        if(op.containsKey(input)) {
            op.get(input).execute();
        } else {
            state.getStack().push(Double.parseDouble(input));
        }
        
        display();
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        while(true) {
            calculator.step();
        }
    }

    public void display() {
        for(double x : state.getStack())
            System.out.print(x + " ");
        System.out.println();
    }
}
