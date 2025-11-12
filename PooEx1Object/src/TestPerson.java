public class TestPerson {
    public static void main(String[] args) {
        Person manu = new Person("Manu", "TuDescend", 43, "Jpeux pas g piscine", new City("Amiens", "France"));

        Person vlad = new Person("Vladimir", "Poutine", 68);
        Person covfefe = new Person("Donald", "Trump");
        System.out.println(manu);
        System.out.println(vlad);
        System.out.println(covfefe);
    }
}
