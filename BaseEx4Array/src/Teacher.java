import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
	
	public static void main(String[] args) {
	
		System.out.println("Saisir nom et prénom de l'élève: ");
		Scanner studentScan = new Scanner(System.in);
		ArrayList<Double> studentScore = new ArrayList<>();
		String[] topics = {"Histoire", "Français", "Anglais", "Mathématiques", "Physique", "Sport", "Géographie"};		
		
		if(studentScan.hasNextLine()) {
			String input = studentScan.nextLine();

			int spaceIndex = input.indexOf(" ");
			String firstName = input.substring(0, spaceIndex);
			String lastName = input.substring(spaceIndex + 1);
			System.out.println("Bonjour " + firstName + " " + lastName);

		
			for(String topic: topics)
			{
				System.out.println("Note de " + firstName + " pour " + topic + " ?");
				if(studentScan.hasNextDouble()) {
					studentScore.add(studentScan.nextDouble());
				}
			}
			
			System.out.println("Moyenne :" + BaseEx4Array.getMid(studentScore));
		}

	}
	
	
}
