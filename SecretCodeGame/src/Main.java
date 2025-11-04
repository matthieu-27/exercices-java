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
		
		System.out.println("Code tiré: " + formattedCode);
		int tries = 0;
		String[] userArray = new String[codeArray.length]; 
		System.out.println(tries == 0 ? "Veuillez entrer un code :" : "");
		boolean gameFinished = false;

		while(userScan.hasNext() && !gameFinished) {
			System.out.println(tries == 0 ? "": "Veuillez entrer un code :");

			if(userScan.hasNextInt()) {
				String userInput = userScan.nextLine();
				userArray = userInput.split("");
			} else {
				System.out.println("Veuillez entrer un code valide.");
				userScan.next();
			}
			
			int goodAndPlaced = 0, goodAndNotPlaced = 0;
			
			for (int i = 0; i < codeArray.length; i++) {
				if(!codeArray[i].equals(userArray[i])) {
					if(codeArray[i].equals(userArray[i])) {
						goodAndPlaced++;
					}
					for (int j = 0; j < codeArray.length; j++) {
						if(codeArray[i].equals(userArray[j])) {
							goodAndNotPlaced++;
						}
					}
				} else {
					System.out.println("Gagné ! gg. en " + (tries == 0 ? "1" : tries) + " coups");
					gameFinished = true;
					System.exit(1);
				}
			}
			++tries;
			System.out.print(tries);
			System.out.print(tries == 1 ? "er " : "ème ");
			System.out.println("éssai:");
			System.out.println("Bon et bien placé: " + goodAndPlaced);
			System.out.println("Bon et mal placé: " + (goodAndNotPlaced - goodAndPlaced));
		}
	}
	
}
