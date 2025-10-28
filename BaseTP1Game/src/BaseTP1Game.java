import java.util.Random;
import java.util.Scanner;

public class BaseTP1Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String answer = "";

		boolean wantsToPlay = false, hasWon = false;

		System.out.println("Bonjour, voulez vous jouer avec moi ? (Oui/Non)");
		
		if(!sc.nextLine().toLowerCase().trim().equals("non")) {
			wantsToPlay = true;
		}
		
		do {
			int randomNumber = random.nextInt(10) + 1;
			int counter = 0;

			if(!hasWon && wantsToPlay) {
				do {
					System.out.println("Saissisez un nombre entre 1 et 100:");
					counter++;
					if (sc.nextInt() == randomNumber) {
						hasWon = true;
					} else {
						System.out.println("Essayez encore.");
					}
				} while (!hasWon);
				
				if(hasWon) {
					System.out.println("Bravo vous avez gagné en " + counter + " essais");
					System.out.println("Voulez vous rejouer ? (Oui/Non)");
					Scanner nt = new Scanner(System.in);
					answer = nt.nextLine();
				}
			}
			if(!answer.equals("non")) {
				hasWon = false;
			}
		} while (!answer.equals("non"));
		
		System.out.println("Au revoir !");
		sc.close();
	}
}
