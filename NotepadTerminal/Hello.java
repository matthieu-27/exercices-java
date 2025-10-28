import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		
		String firstName = "";
		String lastName = "";
		
		if(args.length > 0) {
			firstName = args[0];
			lastName = args[1];
			System.out.println("Bienvenue " + firstName + ' ' + lastName + '.');
		} else {
			System.out.println("Bonjour et bienvenue dans mon programme Java \n");
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Entrez votre prenom : ");
			firstName = scan.nextLine();
			System.out.println("Salut " + firstName + '!');
			
			System.out.println("Entrez votre nom : ");
			lastName = scan.nextLine();
			System.out.println("Bienvenue " + firstName + ' ' + lastName + '.');
			sc.close();
		}
	}
}
