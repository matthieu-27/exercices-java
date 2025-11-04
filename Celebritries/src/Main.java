import java.util.*;

public class Main {
	
	public static enum Stardom {
		Star,
		Guest
	}
	
	public static void main(String[] args) {
		
		Map<String, Set<Integer>> peopleList = new HashMap<String, Set<Integer>>();
		
		List<String> potentialStars  = new ArrayList<String>();

		peopleList.put("Albert", new HashSet<>(Arrays.asList(2, 5, 6)));
		
		peopleList.put("Bénédicte", new HashSet<>(Arrays.asList(3, 5, 6)));
		peopleList.put("Christophe", new HashSet<>(Arrays.asList(2, 4, 5, 6)));
		peopleList.put("Delphine", new HashSet<>(Arrays.asList(1, 2, 5, 6, 8)));
		peopleList.put("Edouard", new HashSet<>(Arrays.asList(6)));
		peopleList.put("Françoise", new HashSet<>(Arrays.asList(5)));
		peopleList.put("Gaston", new HashSet<>(Arrays.asList(2, 3, 5, 6, 8)));
		peopleList.put("Heloïse", new HashSet<>(Arrays.asList(2, 4, 5, 6, 7)));
		

		// start looping on peopleList
		for(Map.Entry<String, Set<Integer>> people : peopleList.entrySet()) {

			System.out.println(people.getKey() + " -> " + people.getValue());
		}
	}
}
