import java.util.Scanner;

public class BaseEx3Loop {
	public static void main(String[] args) {
		int userNumber = 0;
		
		if(args.length == 0){
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Entrez un nombre entier :");
			
			while(!scan.hasNextInt()){
				System.out.println("Veuillez entrez un nombre entier :");
				scan.next();
			}
			
			userNumber = scan.nextInt();
			scan.close();
			System.out.println(getResult(userNumber));

		} else {
			for(String arg : args) {
				Scanner argScan = new Scanner(arg);
				if(argScan.hasNextInt()) {
					System.out.println(getResult(Integer.parseInt(arg)));
				}
				argScan.close(); 
			}
		}
	}
	
	public static String getResult(int number) {
		String str = number + " ";

		if(number >= 0) str += "est positif ";
		else str += "est negatif ";
		
		if(number % 2 == 0) str += "et pair.";
		else str += "et impair.";
		
		return str;
	}

}
