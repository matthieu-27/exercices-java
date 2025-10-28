
public class BaseEx4Array {
	
	static double[] examNotes = {12, 8, 11, 16, 14, 5, 18, 11, 9.5, 19, 15, 8.5, 15};

	
	public static void main(String[] args) {

		System.out.println(getMin(examNotes));
		System.out.println(getMax(examNotes));
		System.out.println(getMid(examNotes));
	}
	
	public static double getMax(double[] array) {
		double max = 0;
		for(double d: array) {
			if(d>max) max = d;
		}
		return max;
	}
	
	
	public static double getMin(double[] array) {
		double min = 20;
		for(double d: array) {
			if(d<min) min = d;
		}
		return min;
	}

	public static double getMid(double[] array) {
		double mid = 0;
		for(double d: array) {
			mid += d;
		}
		return mid / array.length;
	}
	
}
