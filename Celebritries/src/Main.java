import java.util.*;

public class Main {
	
	public static enum Stardom {
		Star,
		Guest
	}
	
	public static void main(String[] args) {
		
		Map<String, int[]> peopleList = new HashMap<String, int[]>();

		peopleList.put("Albert", new int[]{2, 5, 6});
		peopleList.put("Bénédicte", new int[]{3, 5, 6});
		peopleList.put("Christophe", new int[]{2, 4, 5, 6});
		peopleList.put("Delphine", new int[]{1, 2, 5, 6, 8});
		peopleList.put("Edouard", new int[]{6});
		peopleList.put("Françoise", new int[]{5});
		peopleList.put("Gaston", new int[] {2, 3, 5, 6, 8});
		peopleList.put("Heloïse", new int[] {2, 4, 5, 6, 7});
		
		List<String> intToStrList = new ArrayList<>(peopleList.size());

		// start looping on peopleList
		for(Map.Entry<String, int[]> people : peopleList.entrySet()) {
			for (Integer myInt : people.getValue()) { 
				  intToStrList.add(String.valueOf(myInt)); 
			}

			System.out.println(people.getKey() + intToStrList);
			intToStrList.clear();
		}
	}
}
