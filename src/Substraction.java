public class Substraction extends OperatorTwoOp {
	Substraction (State state){
		super(state);
	}
	public double apply(double x, double y){
		return x - y;
	}
}