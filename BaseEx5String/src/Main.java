
public class Main {
	public static void main(String[] args) {
		
		String searchMe = "Il fait beau aujourd'hui";
		
		System.out.println(searchMe.contains("beau") ? "Trouvé !" : "Pas vu !");
		System.out.println(isPalyndrome(searchMe.toLowerCase()) ? "Palyndrome !" : "Pas un palyndrome");
		
		String searchMeToo = "Elu par cette crapule";
		System.out.println(isPalyndrome(searchMeToo.toLowerCase()) ? "Palyndrome !" : "Pas un palyndrome");

		
	}
	
	public static boolean isPalyndrome(String sentence) {
		sentence = sentence.replace(" ", "");
		int i = 0, j = sentence.length() - 1;
		
		while(i < j) {
			if(sentence.charAt(i) != sentence.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}
