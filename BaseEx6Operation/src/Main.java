
public class Main {
	public static void main(String[] args) {
		System.out.println(Operation.add(5, 2));
		System.out.println(Operation.sub(5, 2));
		System.out.println(Operation.mul(5, 2));
		System.out.println(Operation.div(5, 2));
		System.out.println(Operation.div(5, 0)); // division by zero returns dividend
		buildTriangle(6);
		makeTriangle(6);
	}
	
	public static void buildTriangle(int size) {		 
		for (int k = 0; k <= size-1; k++)
		{
			for (int j = 0; j < size-k; j++)
				System.out.print(" "); // size - k prints spaces
			for (int i = 0; i < (k*2+1); i++)
				System.out.print("*"); // stars * 2 + 1 
			System.out.println("");
		}
	}
	
	public static void makeTriangle(int size) {
		for (int i = 0; i < size; i++) {
			drawChar((int)Operation.sub(size, i), ' '); // add spaces (size of the triangle first and decrement)
			drawChar(i == 0 ? 1 : (int)Operation.add(Operation.mul(i, 2), 1), '*'); // draw stars (first one only on star)
			System.out.println(); // goes to a new line
		}
	}
	
	public static void drawChar(int size, char c) {
		for (int i = 0; i < size; i++) {
			System.out.print(c); // adds char to line
		}
	}
}
