import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Matrix {
	public static void main(String[] args) {
		int[][] firstMatrix = {{1, 2, 0, 4, 3, -1}, {5, 2, 3, 1, 3, 4}};
		int[][] secondMatrix = {{1, 2, 0, 4, 3, -1}, {5, 2, 3, 1, 3, 4}};
		System.out.println(Arrays.toString(addMatrix(firstMatrix[0], firstMatrix[1])));
		System.out.println(Arrays.toString(subMatrix(secondMatrix[0], secondMatrix[1])));
	}
	
	/*
	 * This method takes 2 integer array and compute sum between a[x] and b[x]
	 * 
	 * @param a first integer array
	 * @param b second integer array
	 * @return an integer table with computed sum
	 */
	public static int[] addMatrix(int[] a, int[] b) {
		// convert first and second array to ArrayList
	    ArrayList<Integer> firstIntegerArray =
	            (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
	    ArrayList<Integer> secondIntegerArray =
	            (ArrayList<Integer>) Arrays.stream(b).boxed().collect(Collectors.toList());
	    
	    // initialize primitive integer type array that will store result
	    int[] result = new int[firstIntegerArray.size()];
	    for (int i = 0; i < firstIntegerArray.size(); i++) {
			int temp = (int) Operation.add(firstIntegerArray.get(i), secondIntegerArray.get(i));
			result[i] = temp; // add sum to array
		}
	    return result;
	}
	
	/*
	 * This method takes 2 integer array and compute difference between a[x] and b[x]
	 * 
	 * @param a first integer array
	 * @param b second integer array
	 * @return an integer table with computed difference
	 */
	public static int[] subMatrix(int[] a, int[] b) {
		// convert first and second array to ArrayList
	    ArrayList<Integer> firstIntegerArray = (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
	    ArrayList<Integer> secondIntegerArray = (ArrayList<Integer>) Arrays.stream(b).boxed().collect(Collectors.toList());
	    
	    // initialize primitive integer type array that will store result
	    int[] result = new int[firstIntegerArray.size()];
	    for (int i = 0; i < firstIntegerArray.size(); i++) {
			int temp = (int) Operation.sub(firstIntegerArray.get(i), secondIntegerArray.get(i));
			result[i] = temp; // add difference to array
		}
	    return result;
	}
}
