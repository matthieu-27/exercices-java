
public class Dictionnary {
	
	static String[] wordList = {"Avion","Pomme","Chat","Maison","Soleil","Livre","Arbre","Voiture","Fleur","Étoile","Ballon","Chaise","Poisson","Montagne","Lune","Table","Oiseau","Clé","Cheval","Porte","Chien","Bateau","Nuage","Lit","Échelle","Train","Crayon","Lapin","Fenêtre","Sac","Guitare","Éléphant","Horloge","Vélo","Papillon","Tasse","Serpent","Cheminée","Brosse à dents","Ordinateur","Pizza","Téléphone","Lampe","Clown","Pirate","Astronaute","Danseur","Chanteur","Footballeur","Tennisman","Musicien","Peintre","Sculpteur","Écrivain","Professeur","Infirmier/Infirmière","Pompier","Policier","Médecin","Cuisinier/Cuisinière","Acteur/Actrice","Chocolat","Fromage","Pain","Salade","Soupe","Gâteau","Frites","Hamburger","Spaghetti","Sushi","Pizza","Ice cream","Orange","Banane","Fraise","Raisin","Ananas","Pastèque","Citron","Mangue","Kiwi","Hiver","Printemps","Été","Automne","Pluie","Neige","Vent","Soleil","Arc-en-ciel","Orage","Tornade","Volcan","Séisme","Tsunami","Forêt","Désert","Océan","Rivière","Lac","Île","Continent","Planète","Univers","Galaxie","Comète","Météore"};
	
	public static void main(String[] args) {
	}
	
	public static String getRandomWord() {
		int randomNumber = (int) (Math.random() * wordList.length);
		return wordList[randomNumber];
	}
}
