import java.util.*;
public class Main {

    private static LinkedHashMap<String, int[]> peopleList = new LinkedHashMap<>();
    private static Map<Integer, String> idToName = new HashMap<>();

    public static void main(String[] args) {

        // populate id to name map with Id -> Name

        idToName.put(1, "Albert");
        idToName.put(2, "Bénédicte");
        idToName.put(3, "Christophe");
        idToName.put(4, "Delphine");
        idToName.put(5, "Edouard");
        idToName.put(6, "Françoise");
        idToName.put(7, "Gaston");
        idToName.put(8, "Heloïse");

        // populate LinkedHashMap with Name -> Known People

        peopleList.put("Albert", new int[] {2, 5, 6});
        peopleList.put("Bénédicte", new int[] {3, 5, 6});
        peopleList.put("Christophe", new int[] {2, 4, 5, 6});
        peopleList.put("Delphine", new int[] {1, 2, 5, 6, 8});
        peopleList.put("Edouard", new int[] {6});
        peopleList.put("Françoise", new int[] {5});
        peopleList.put("Gaston", new int[] {2, 3, 5, 6, 8});
        peopleList.put("Heloïse", new int[] {2, 4, 5, 6, 7});

        // initialize empty stars and guests
        ArrayList<String> stars = new ArrayList<>();
        ArrayList<String> guests = new ArrayList<>();

        // find potential stars (people known by everyone)
        for (Map.Entry<String, int[]> people : peopleList.entrySet()) {
            String name = people.getKey();
            boolean everyoneKnowsMe = true;

            for (Map.Entry<String, int[]> entry : peopleList.entrySet()) {
                String otherName = entry.getKey();
                int[] otherKnownPeople = entry.getValue();

                // Check if the current person is known by everyone else
                boolean isKnownByOther = false;
                for (int id : otherKnownPeople) {
                    if (id == getId(name)) {
                        isKnownByOther = true;
                        break;
                    }
                }

                // if i'm not known by other and i'm not that person
                if (!isKnownByOther && !otherName.equals(name)) {
                    everyoneKnowsMe = false;
                    break; // no need to continue
                }
            }

            
            if (everyoneKnowsMe) {
                stars.add(name);
            }
        }

        // check that potential stars only know other stars
        ArrayList<String> confirmedStars = new ArrayList<>();
        for (String star : stars) {
            int[] knownPeople = peopleList.get(star);
            boolean onlyKnowsStars = true;

            for (int id : knownPeople) {
                String knownPerson = idToName.get(id);
                // if this known person is not in star array he doesn't only know star
                if (!stars.contains(knownPerson)) {
                    onlyKnowsStars = false;
                    break;
                }
            }

            if (onlyKnowsStars) {
                confirmedStars.add(star);
            }
        }

        // update guests list
        for (Map.Entry<String, int[]> people : peopleList.entrySet()) {
            String name = people.getKey();
            // if i'm not in confirmed star array i'm a guest
            if (!confirmedStars.contains(name)) {
                guests.add(name);
            }
        }

        // prints out the result
        System.out.println("Célébrités: " + confirmedStars);
        System.out.println("Invités: " + guests);
    }

    /*
     * This method does the opposite as idToName.get()
     * 
     * @param name a String to be found in idToName array
     * @return an integer representing the person id
     */
    private static int getId(String name) {
    	// loop over idToName array
        for (Map.Entry<Integer, String> entry : idToName.entrySet()) {
            if (entry.getValue().equals(name)) {
                return entry.getKey();
            }
        }
        return -1; // fix
    }
}
