
public class Operation {
	
	/*
	 * Returns addition result of a + b
	 */
	public static double add(double first, double second) {
		return first + second;
	}
	
	/*
	 * Returns subtraction result of a -b
	 */
	public static double sub(double first, double second) {
		return first - second;
	}
	
	/*
	 * Returns multiplication result of a * b
	 */
	public static double mul(double first, double second) {
		return first * second;
	}
	
	/*
	 * Return division result of a / b
	 * 
	 * @return computed result or dividend if divisor is zero
	 */
	public static double div(double first, double second) {
		if(second == 0) return first;
		return first / second;
	}
}
