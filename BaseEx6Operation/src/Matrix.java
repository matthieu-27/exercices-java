import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
	public static void main(String[] args) {
		
		int[][] firstMatrix = { { 5, 2, 4 },
								{ 0, 1, 1 },
								{ 6, 3, 1 } };
		int[][] secondMatrix = { { 1, 1, 3 },
								 { 2, 5, 6 },
								 { 3, 0, 5 } };
		int[][] thirdMatrix = { { 8, 7 },
								{ 5, 4 }, 
								{ 2, 1 } };
		int[][] fourthMatrix = { { 0, 2 },
								 { 1, 2 }, 
								 { 1, 1 } };
		addMatrix(firstMatrix, secondMatrix);
		addMatrix(firstMatrix, thirdMatrix);
		subMatrix(thirdMatrix, fourthMatrix);
		mulScalMatrix(fourthMatrix, 2);
	}
	
	/*
	 * This method takes 2 integer array and compute sum between a[x] and b[x]
	 * 
	 * @param a first integer array
	 * @param b second integer array
	 * @return an integer table with computed sum
	 */
	public static void addMatrix(int[][] a, int[][] b) {
		// convert first and second array to ArrayList
        List<List<Integer>> firstIntegerArray = Arrays.stream(a)
               .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
               .collect(Collectors.toCollection(ArrayList::new));
        List<List<Integer>> secondIntegerArray = Arrays.stream(b)
                .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
                .collect(Collectors.toCollection(ArrayList::new));
	    
	    // check length
	    if(!isEqualLength(a, b)) {
	    	System.out.println("Matrixes must be of equal lengths!");
	    } else {
		    // initialize primitive integer type array that will store result
		    int[][] result = new int[firstIntegerArray.size()][secondIntegerArray.get(0).size()];
		    
		    // loop, compute and add to result
		    for (int i = 0; i < firstIntegerArray.size(); i++) {
				for (int j = 0; j < firstIntegerArray.get(i).size(); j++) {
					result[i][j] = firstIntegerArray.get(i).get(j) + secondIntegerArray.get(i).get(j);
				}
			}
		    
		    // prints out the result
			displayTab(a, b, result, '+');
	    }

	}
	
	/*
	 * This method takes 2 integer array and compute difference between a[x] and b[x]
	 * 
	 * @param a first integer array
	 * @param b second integer array
	 * @return an integer table with computed difference
	 */
	public static void subMatrix(int[][] a, int[][] b) {
		// convert first and second array to ArrayList
        List<List<Integer>> firstIntegerArray = Arrays.stream(a)
               .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
               .collect(Collectors.toCollection(ArrayList::new));
        List<List<Integer>> secondIntegerArray = Arrays.stream(b)
                .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
                .collect(Collectors.toCollection(ArrayList::new));
        
        // check length
	    if(!isEqualLength(a, b)) {
	    	System.out.println("Matrix must be of equal lengths!");
	    } else {
	    
		    // initialize primitive integer type array that will store result
		    int[][] result = new int[firstIntegerArray.size()][secondIntegerArray.get(0).size()];
		    
		    // loop, compute and add to result
		    for (int i = 0; i < firstIntegerArray.size(); i++) {
				for (int j = 0; j < firstIntegerArray.get(i).size(); j++) {
					result[i][j] = firstIntegerArray.get(i).get(j) - secondIntegerArray.get(i).get(j);
				}
			}
		    
		    // prints out the result
			displayTab(a, b, result, '-');
	    }

	}
	
	/*
	 * This method prints out a computed matrix multiplied by factor
	 * 
	 * @param matrix an integer matrix
	 * @param factor an integer multiplicand
	 */
	public static void mulScalMatrix(int[][] matrix, int factor) {		
		// creates a result matrix the same size as the argument matrix
		int[][] result = new int[matrix.length][matrix[0].length];
		
		// loop and multiply by factor
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int temp = matrix[i][j];
				result[i][j] = temp * factor;
			}
		}
		
		// prints out the result
		System.out.println("-----------------------------------");
		System.out.println(factor + " *");
		System.out.println(Arrays.deepToString(matrix));
		System.out.println('=');
		System.out.println(Arrays.deepToString(result));
		System.out.println("-----------------------------------");

	}
	
	/*
	 * Checks if two matrix are exactly the same size
	 * 
	 * @return true if same size, false otherwise
	 */
	public static boolean isEqualLength(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			if(a[i].length != b[i].length) {
				return false;
			}

		}
		return true;
	}
	
	/*
	 * Prints out the first, second and result matrix with an adequate arithmetic operation sign.
	 */
	public static void displayTab(int[][] first, int[][] second, int[][] result, char sign) {
		System.out.println("-----------------------------------");
		System.out.println(Arrays.deepToString(first));
		System.out.println(sign);
		System.out.println(Arrays.deepToString(second));
		System.out.println('=');
		System.out.println(Arrays.deepToString(result));
		System.out.println("-----------------------------------");

	}
}
