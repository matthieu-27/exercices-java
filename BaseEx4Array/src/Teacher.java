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

			String name = BaseEx4Array.getName(input);
		
			for(String topic: topics)
			{
				System.out.println("Note de " + name + " pour " + topic + " ?");
				if(studentScan.hasNextDouble()) {
					studentScore.add(studentScan.nextDouble());
				}
			}
			BaseEx4Array.addStudent(name);
			System.out.println("Moyenne :" + BaseEx4Array.getMid(BaseEx4Array.arrayListToArray(studentScore)));
		}
		
		
		studentScan.close();

	}
	
	
}
