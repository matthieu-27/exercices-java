import java.util.Scanner;

public class BaseTP1Game {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean wantsToPlay = true;

		while(wantsToPlay) {
			System.out.println("Bonjour, voulez vous jouer avec moi ? (Oui/Non)");
			Scanner yesNo = new Scanner(System.in);

			if(yesNo.next().equalsIgnoreCase("oui")) {
				playGame();
			} else {
				wantsToPlay = false;
				yesNo.close();
				sc.close();
			}
		}

		System.out.println("Au revoir :)");

	}
	
	public static void playGame() {
		int randomNumber = (int)(Math.random() * 100), counter = 0;
		boolean hasWon = false;

			
		while (!hasWon) {
			System.out.println("Saissisez un nombre entre 1 et 100:");
			if(sc.hasNextInt()) {
				int guess = sc.nextInt();
				if (guess == randomNumber) {
					hasWon = true;
				} else {
					System.out.print("Essayez un chiffre ");
					System.out.println(guess > randomNumber ? "plus petit" : "plus grand");
				} 
			}else {
				sc.next();
			}
			counter++;
			if(hasWon) {
				System.out.println("Bravo vous avez gagné en " + counter + " essais");
			}
		} 
	}
}