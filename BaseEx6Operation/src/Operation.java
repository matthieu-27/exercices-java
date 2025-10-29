
public class Operation {
	
	public static double add(double first, double second) {
		return first + second;
	}
	
	public static double sub(double first, double second) {
		return first - second;
	}
	
	public static double mul(double first, double second) {
		return first * second;
	}
	public static double div(double first, double second) {
		if(second == 0) return first;
		return first / second;
	}
}
