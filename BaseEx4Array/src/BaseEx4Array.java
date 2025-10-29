import java.util.ArrayList;

public class BaseEx4Array {
	
	static ArrayList<Double> examNotes = new ArrayList<>();
	public static ArrayList<String> studentList = new ArrayList<>();
	public static ArrayList<Double> studentNotesList = new ArrayList<>();

	
	public static void main(String[] args) {
	}
	
	public static double getMax(Double[] array) {
		double max = array[0];
		for(double d: array) {
			if(d>max) max = d;
		}
		return max;
	}
	
	
	public static double getMin(Double[] array) {
		double min = array[0];
		for(double d: array) {
			if(d<min) min = d;
		}
		return min;
	}

	public static double getMid(Double[] array) {
		double mid = array[0];
		for(double d: array) {
			mid += d;
		}
		return mid / array.length;
	}
	
	public static Double[] arrayListToArray(ArrayList<Double> arrayList) {
		Double[] toArray = arrayList.toArray(new Double[arrayList.size()]);
		return toArray;
	}
	
	public static String getName(String name) {
		int spaceIndex = name.indexOf(" ");
		String firstName = name.substring(0, spaceIndex);
		String lastName = name.substring(spaceIndex + 1);
		return firstName + " " + lastName;
	}
	
	public static void addStudent(String name) {
		studentList.add(name);
	}

}
