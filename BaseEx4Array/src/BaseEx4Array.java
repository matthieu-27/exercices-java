import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseEx4Array {
	
	public static Map<String, Double[]> studentsNotes = new HashMap<>();
	
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
	
	public static String getName(String name) {
		int spaceIndex = name.indexOf(" ");
		String firstName = name.substring(0, spaceIndex);
		String lastName = name.substring(spaceIndex + 1);
		return firstName + " " + lastName;
	}
	
	public static Double[] arrayListToArray(ArrayList<Double> arrayList) {
		Double[] toArray = arrayList.toArray(new Double[arrayList.size()]);
		return toArray;
	}

	
	public static void addToList(String name, ArrayList<Double> notes) {
		studentsNotes.put(name, arrayListToArray(notes));
	}
	
	public static void displayTab(Map<String, Double[]> notes) {
		for(Map.Entry<String, Double[]> entry: notes.entrySet()) {
			System.out.print("Notes de " + entry.getKey() + " :" + entry.getValue().toString());
		}
		System.out.println();
	}

}
