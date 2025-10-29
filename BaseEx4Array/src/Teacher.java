import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
	
	public static void main(String[] args) {
	
		Scanner studentScan = new Scanner(System.in);
		ArrayList<Double> studentScore = new ArrayList<>();
		String[] topics = {"Histoire", "Français", "Anglais", "Mathématiques", "Physique", "Sport", "Géographie"};		
		String answer = "";

		while(answer != "non") {
			System.out.println("Saisir nom et prénom de l'élève (séparé par un espace): ");

			if(studentScan.hasNextLine()) {
				String input = studentScan.nextLine();

				String name = BaseEx4Array.getName(input);
			
				for(String topic: topics)
				{
					System.out.println("Note de " + name + " pour " + topic + " ?");
					if(studentScan.hasNextDouble()) {
						studentScore.add(studentScan.nextDouble());
					}
				}
				BaseEx4Array.addToList(name, studentScore);

				System.out.println("Moyenne :" + BaseEx4Array.getMid(BaseEx4Array.arrayListToArray(studentScore)));
			}
			
			System.out.println("Voulez vous ajouter un autre élève ? (Oui/Non)");
			Scanner answerScan = new Scanner(System.in);
			
			if(answerScan.hasNextLine()) {
				answer = answerScan.nextLine().toLowerCase().trim();
				if(answer.equals("non")) {
					answerScan.close();
					break;
				}
			}
			answerScan.close();
		}
		

		studentScan.close();
		
	}
	
	
}
