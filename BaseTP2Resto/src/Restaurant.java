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
		Map<Integer, String> userOrders = new HashMap<>();
		boolean orderFinished = false;
		
		while (!orderFinished) {
			System.out.println("Bonjour combien de menus souhaitez vous ?");
			while(userScan.hasNext()) {
				
				if(userScan.hasNextInt()) {
					int numberOfOrders = userScan.nextInt();
					for (int i = 1; i < numberOfOrders + 1; i++) {
						for(Map.Entry<String, Map<Integer, String>> category: categories.entrySet()) {
							int j = 0;
							System.out.println("Choix " + category.getKey() + ":");
							category.getValue().forEach((key, cat) -> System.out.print("[" + key + ": " + cat + "]"));
							System.out.println();
							j++;
						}
					}
					
				} else {
					System.out.print("Veuillez entrer un numéro valide");
					userScan.nextLine();
				}
			}

		}
		
		
	}
	
	/*
	 * This method wait and check if user input is an integer, ask again otherwise
	 * 
	 * @return an integer representing the user choice
	 */
	public static int askUserChoice(Scanner scan) {
		while(scan.hasNext()) {
			if(scan.hasNextInt()) {
				return scan.nextInt();
			} else {
				System.out.print("Veuillez entrer un numéro valide");
				scan.nextLine();
			}

		}
		return 0; // fix
	}
}
