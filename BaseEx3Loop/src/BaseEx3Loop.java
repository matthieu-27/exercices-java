import java.util.Scanner;

public class BaseEx3Loop {
	public static void main(String[] args) {
		
		// Here we check arguments presence
		if(args.length == 0){
			
			// asks the user to enter an integer
			Scanner scan = new Scanner(System.in);
			System.out.println("Entrez un nombre entier :");
			
			
			// loop until the scan can find a valid integer
			while(!scan.hasNextInt()){
				System.out.println("Veuillez entrez un nombre entier :"); // we ask again
				scan.next(); // and clear invalid input
			}
			
			// assign valid integer to userNumber
			int userNumber = scan.nextInt();
			System.out.println(checkNumber(userNumber)); // prints out the result
			
			// the scanner can be closed
			scan.close();
		} else {
			for(String arg : args) {
				// Create a new scanner for each arguments
				Scanner argScan = new Scanner(arg);
				// If the argument is a valid integer
				if(argScan.hasNextInt()) {
					System.out.println(checkNumber(Integer.parseInt(arg))); // prints out the result
				}
				// closes scanner to prevent memory leak
				argScan.close(); 
			}
		}
	}
	
	/*
	 * This method checks if a number is positive/negative and even/odd
	 * 
	 * @param number The number to be checked
	 * @return Returns a string saying if positive/negative and even/odd
	 */
	public static String checkNumber(int number) {
		String str = number + " ";

		if(number >= 0) str += "est positif ";
		else str += "est negatif ";
		
		if(number % 2 == 0) str += "et pair.";
		else str += "et impair.";
		
		return str;
	}

}