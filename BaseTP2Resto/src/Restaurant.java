import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale.Category;
import java.util.Map;
import java.util.Scanner;

public class Restaurant {
	
	
	public static void main(String[] args) {
		Map<Integer, String> starter = new HashMap<>();
		Map<Integer, String> mainCourse= new HashMap<>();
		Map<Integer, String> sideDish= new HashMap<>();
		Map<Integer, String> dessert= new HashMap<>();
		Map<Integer, String> drink= new HashMap<>();
		Map<String, Map<Integer, String>> categories = new HashMap<>();

		
		// populate maps
		starter.put(1, "SALADE");
		starter.put(2, "SOUPE");
		starter.put(3, "QUICHE");
		starter.put(4, "AUCUNE");
		
		mainCourse.put(1, "POULET");
		mainCourse.put(2, "BOEUF");
		mainCourse.put(3, "POISSON");
		mainCourse.put(4, "VEGETARIEN");
		mainCourse.put(5, "VEGAN");
		mainCourse.put(6, "AUCUN");
		
		sideDish.put(1, "RIZ");
		sideDish.put(2, "PATES");
		sideDish.put(3, "FRITES");
		sideDish.put(4, "LEGUMES");
		sideDish.put(5, "AUCUN");
			
		drink.put(1, "EAU PLATE");
		drink.put(2, "EAU GAZEUSE");
		drink.put(3, "SODA");
		drink.put(4, "VIN");
		drink.put(5, "AUCUNE");
		
		dessert.put(1, "TARTE MAISON");
		dessert.put(2, "MOUSSE AU CHOCOLAT");
		dessert.put(3, "TIRAMISU");
		dessert.put(4, "AUCUN");
		
		categories.put("entrée", starter);
		categories.put("plat", mainCourse);
		categories.put("accompagnement", sideDish);
		categories.put("boisson", drink);
		categories.put("dessert", dessert);
		
		
		// variable initialization
		Scanner userScan = new Scanner(System.in);
        Map<String, String> userOrders = new HashMap<>();

        System.out.println("Bonjour, combien de menus souhaitez-vous ?");
        int numberOfOrders = askUserChoice(userScan);

        for (int order = 0; order < numberOfOrders; order++) {
            System.out.println("Menu " + (order + 1) + ":");
            for (Map.Entry<String, Map<Integer, String>> category : categories.entrySet()) {
                System.out.println("Choix " + category.getKey() + ":");
                category.getValue().forEach((key, cat) -> System.out.print("[" + key + ": " + cat + "] "));
                System.out.println();
                int userChoice = askUserChoice(userScan, category.getValue().size()-1);
                userOrders.put(category.getKey(), category.getValue().get(userChoice));
            }
            System.out.println("Récapitulatif de la commande : " + userOrders);

        }

    }
	
    public static int askUserChoice(Scanner scan, int maxOptions) {
        while (true) {
            if (scan.hasNextInt()) {
            	int result = scan.nextInt();
                return result > maxOptions + 1 ? maxOptions + 1 : result;
            } else {
                System.out.println("Veuillez entrer un numéro valide");
                scan.next();
            }
        }
    }

    public static int askUserChoice(Scanner scan) {
    	return askUserChoice(scan, 2147483646);
    }
}
