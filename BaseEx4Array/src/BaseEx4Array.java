import java.util.ArrayList;

public class BaseEx4Array {
	
	static ArrayList<Double> examNotes = new ArrayList<>();

	
	public static void main(String[] args) {

		System.out.println(getMin(examNotes));
		System.out.println(getMax(examNotes));
		System.out.println(getMid(examNotes));
	}
	
	public static double getMax(ArrayList<Double> array) {
		double max = 0;
		for(double d: array) {
			if(d>max) max = d;
		}
		return max;
	}
	
	
	public static double getMin(ArrayList<Double> array) {
		double min = 20;
		for(double d: array) {
			if(d<min) min = d;
		}
		return min;
	}

	public static double getMid(ArrayList<Double> array) {
		double mid = 0;
		for(double d: array) {
			mid += d;
		}
		return mid / array.size();
	}

}
