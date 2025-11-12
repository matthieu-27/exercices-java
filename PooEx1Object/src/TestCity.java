public class TestCity {
    public static void main(String[] args) {
        City toulouse = new City("Toulouse", "France", 700000);
        City paris = new City("Paris", "France", 1000000);
        City lyon = new City("Lyon", "France", 550000);
        System.out.println(toulouse + " ");
        System.out.println(paris + " ");
        System.out.println(lyon + " ");
        toulouse.setPopulation(toulouse.getPopulation() + 20000);
        System.out.println(toulouse + " ");
    }
}