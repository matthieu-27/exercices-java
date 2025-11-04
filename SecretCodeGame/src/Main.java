import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Utilisation de la classe Random pour utiliser nextInt()
		Random random = new Random();
		int randomCode = random.nextInt(10000); 
		String formattedCode = String.format("%04d", randomCode);
		String[] codeArray = formattedCode.split("");
		
		// Initialisation du scanner
		Scanner userScan = new Scanner(System.in);
		char[] displayCode = new char[codeArray.length];

        Arrays.fill(displayCode, '_'); // fills array with underscores

		
		System.out.println("Code tiré: " + new String(displayCode));
		int tries = 0;
		String[] userArray = new String[codeArray.length]; 
		System.out.println("Veuillez entrer un code :");

		while(userScan.hasNext()) {
			System.out.println("Veuillez entrer un code :");
			++tries;
			if(userScan.hasNextInt()) {
				String userInput = userScan.nextLine();
				if(userInput.length() != 4) {
					System.out.println("!! Veuillez entrer un code à 4 chiffres !!");
					continue;
				}
				userArray = userInput.split("");
			} else {
				System.out.println("Veuillez entrer un code valide.");
				userScan.next();
				continue;
			}
			
			int goodAndPlaced = 0, goodAndNotPlaced = 0;
			
			for (int i = 0; i < codeArray.length; i++) {
					if(codeArray[i].equals(userArray[i])) goodAndPlaced++;
					else {
						for (int j = 0; j < codeArray.length; j++) {
							if(codeArray[i].equals(userArray[j])) goodAndNotPlaced++;
						}						
					}
			} 
			
			if(goodAndPlaced == codeArray.length) {
				System.out.println("Gagné ! gg. en " + (tries + 1) + " coups");
				break;
			}
			
			System.out.print(tries);
			System.out.print(tries == 1 ? "er " : "ème ");
			System.out.println("éssai:");
			System.out.println("Bon et bien placé: " + goodAndPlaced);
			System.out.println("Bon et mal placé: " + goodAndNotPlaced);

		}
		
			
	}
}
	
