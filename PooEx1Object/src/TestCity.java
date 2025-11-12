public class TestCity {
    public static void main(String[] args) {
        City toulouse = new City("Toulouse", "France", 700000);
        City paris = new City("Paris", "France", 1000000);
        City lyon = new City("Lyon", "France", 550000);
        System.out.println(toulouse + " ");
        System.out.println(paris + " ");
        System.out.println(lyon + " ");
        toulouse.setPopulation(toulouse.getPopulation() + 20000);
        // essai de mettre une population négative
        toulouse.setPopulation(-300);
        toulouse.setPopulation(370000);
        System.out.println(toulouse + " ");

        // utilisation du deuxième constructeur
        City marseille = new City("Marseille", 500000);
        System.out.println(marseille + " ");
    }
}