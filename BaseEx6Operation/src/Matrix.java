import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Matrix {
	public static void main(String[] args) {
		int[][] firstMatrix = {{1, 2, 0, 4, 3, -1}, {5, 2, 3, 1, 3, 4}};
		int[][] secondMatrix = {{1, 2, 0, 4, 3, -1}, {5, 2, 3, 1, 3, 4}};
		System.out.println(Arrays.toString(addMatrix(firstMatrix)));
		System.out.println(Arrays.toString(subMatrix(secondMatrix)));
	}
	
	
	public static int[] addMatrix(int[][] matrix) {
		// convert first and second array to ArrayList
	    ArrayList<Integer> firstIntegerArray =
	            (ArrayList<Integer>) Arrays.stream(matrix[0]).boxed().collect(Collectors.toList());
	    ArrayList<Integer> secondIntegerArray =
	            (ArrayList<Integer>) Arrays.stream(matrix[1]).boxed().collect(Collectors.toList());
	    
	    // initialize primitive integer type array that will store result
	    int[] result = new int[firstIntegerArray.size()];
	    for (int i = 0; i < firstIntegerArray.size(); i++) {
			int temp = (int) Operation.add(firstIntegerArray.get(i), secondIntegerArray.get(i));
			result[i] = temp; // add sum to array
		}
	    return result;
	}
	
	public static int[] subMatrix(int[][] matrix) {
		// convert first and second array to ArrayList
	    ArrayList<Integer> firstIntegerArray = (ArrayList<Integer>) Arrays.stream(matrix[0]).boxed().collect(Collectors.toList());
	    ArrayList<Integer> secondIntegerArray = (ArrayList<Integer>) Arrays.stream(matrix[1]).boxed().collect(Collectors.toList());
	    
	    // initialize primitive integer type array that will store result
	    int[] result = new int[firstIntegerArray.size()];
	    for (int i = 0; i < firstIntegerArray.size(); i++) {
			int temp = (int) Operation.sub(firstIntegerArray.get(i), secondIntegerArray.get(i));
			result[i] = temp; // add difference to array
		}
	    return result;
	}
}
