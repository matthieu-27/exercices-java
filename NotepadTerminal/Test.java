import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		int userNumber = 0;

		if(args.length <= 0){
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez un nombre entier :");
			while(!sc.hasNextInt()){
				sc = new Scanner(System.in);
				System.out.println("Veuillez entrez un nombre entier :");
			}
			userNumber = sc.nextInt();
			sc.close();
		} else {
			userNumber = Integer.parseInt(args[0]);
		}

		String result = userNumber + " ";
		
		if(userNumber >= 0) {
			result += "est positif ";
		} else {
			result += "est negatif ";
		}
		
		if(userNumber % 2 == 0) {
			result += "et pair";
		} else {
			result += "et impair";
		}
		
		System.out.println(result);
	}
}