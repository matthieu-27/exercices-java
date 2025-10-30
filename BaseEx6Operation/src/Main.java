import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
	
	// 6.1
	
	public static void main(String[] args) {
		System.out.println(Operation.add(5, 2));
		System.out.println(Operation.sub(5, 2));
		System.out.println(Operation.mul(5, 2));
		System.out.println(Operation.div(5, 2));
		System.out.println(Operation.div(5, 0)); // division by zero returns dividend
		buildTriangle(6);
		makeTriangle(6);
		int[] intTable = { 78, 6, -250, 2, 12, 9};
		System.out.printf("Résultat de l'addition des deux plus grand du tableau: %d", sumBigestNumbers(intTable));
	}
	
	// 6.2
	
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
	
	// 6.3
	
	/*
	 * Returns sum of two biggest numbers in array
	 * 
	 * @param array a primitive integer array
	 * @return sum of max number and next closest to him
	 */
	public static int sumBigestNumbers(int[] array) {
	    ArrayList<Integer> integerArray =
	            (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList()); // convert primitive array to array list
	    int max = Arrays.stream(array).max().getAsInt(), secMax = 0; // get max value using Arrays utility class
	    int indexOfMax = integerArray.indexOf(max); // get index of max value
	    integerArray.remove(indexOfMax); // remove max value from array list
	    for(Integer i : integerArray) { // loop and find max value
	    	if(i > secMax) secMax = i;
	    }
	    return (int) Operation.add(max, secMax); // return casted result, because why not.
	}
		
}
