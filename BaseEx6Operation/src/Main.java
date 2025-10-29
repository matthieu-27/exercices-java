
public class Main {
	public static void main(String[] args) {
		System.out.println(Operation.add(5, 2));
		System.out.println(Operation.sub(5, 2));
		System.out.println(Operation.mul(5, 2));
		System.out.println(Operation.div(5, 2));
		System.out.println(Operation.div(5, 0));
		buildTriangle(6);
		makeTriangle(6);
	}
	
	public static void buildTriangle(int size) {		 
		for (int k = 0; k <= size-1; k++)
		{
			for (int j = 0; j < size-k; j++)
				System.out.print(" ");
			for (int i = 0; i < (k*2+1); i++)
				System.out.print("*");
			System.out.println("");
		}
	}
	
	public static void makeTriangle(int size) {
		for (int i = 0; i < size; i++) {
			drawChar(size - i, ' ');
			drawChar(i == 0 ? 1 : i*2+1, '*');
			System.out.println();
		}
	}
	
	public static void drawChar(int size, char c) {
		for (int i = 0; i < size; i++) {
			System.out.print(c);
		}
	}
}
