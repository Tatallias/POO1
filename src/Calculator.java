import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    private State state;
    private Map<String, Operator> op;
    private Scanner scanner;
    boolean firstInput;
    
    public Calculator() {
        state = new State();
        scanner = new Scanner(System.in);
        firstInput = true;
        
        op = new HashMap<String, Operator>();
        op.put("-", new Substraction(state));
        op.put("+", new Addition(state));
        op.put("*", new Multiplication(state));
        op.put("/", new Division(state));
        op.put("sqrt", new SquareRoot(state));
        op.put("1/", new OneOver(state));
        op.put("^2", new Square(state));
        op.put("exit", new OperatorExit(state));
    }
    
    public void step() {
        String input = scanner.nextLine();
        
        if(op.containsKey(input)) {
            op.get(input).execute();
        } else {
            if(!firstInput) {
                state.getStack().push(Double.parseDouble(state.getText()));
            } else {
                firstInput = false;
            }
            state.setText(((Double) Double.parseDouble(input)).toString(), false);          
        }
        
        display();
    }
    
    public void display() {
        System.out.print(state.getText() + " ");
        for(Object x : state.getStackAsTab())
            System.out.print(x + " ");
        System.out.println();
    }
    
    private class OperatorExit extends Operator {

        OperatorExit(State state) {
            super(state);
        }

        @Override
        public void execute() {
            System.exit(0);
        }     
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Welcome to our reverse polish notation Calculator");

        while(true) {
            calculator.step();
        }
    }
}
