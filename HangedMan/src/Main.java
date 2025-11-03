import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Initialize variables
    	
        String wordToGuess = Dictionnary.getRandomWord().toLowerCase();

        Set<Character> foundLetters = new HashSet<>();

        char[] displayArray = new char[wordToGuess.length()];
        Arrays.fill(displayArray, '_'); // fills array with underscores

        int errors = 0;
        int maxErrors = 10;
        boolean finishedGame = false;

        Scanner scanner = new Scanner(System.in);
        while (errors < maxErrors) {
        	
            // prints out current state
            System.out.println("Mot : " + new String(displayArray));
            System.out.println("Erreurs : " + errors + "/" + maxErrors);
            System.out.print("Proposez une lettre : ");
            char letter = scanner.next().charAt(0);


            // update game state
            if (wordToGuess.indexOf(letter) >= 0) {
                // found letter !
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == letter) {
                        displayArray[i] = letter;
                    }
                }
                foundLetters.add(letter);
            } else {
                // not found !
                errors++;
            }
            // Check if word is guessed
            if (new String(displayArray).equals(wordToGuess)) {
                System.out.println("Félicitations, vous avez gagné ! Le mot était : " + wordToGuess);
                finishedGame = true;
            }
            else if (errors >= maxErrors) {
                System.out.println("Désolé, vous avez perdu. Le mot était : " + wordToGuess);
                finishedGame = true;
            }
            if(finishedGame) {
            	scanner.close();
            	break;
            }

        }

    }
}
