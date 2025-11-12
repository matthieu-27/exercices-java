import java.util.ArrayList;
import java.util.Collection;

public class TestPerson {
    public static void main(String[] args) {
        Person manu = new Person("Manu", "TuDescend", 43, "Jpeux pas g piscine", new City("Amiens", "France"));
        Person vlad = new Person("Vladimir", "Poutine", 68);
        Person covfefe = new Person("Donald", "Trump");
        Person nico = new Person("Nicolas", "Sarkozy", 66, "Paris rue du Louvre", new City("Paris", "France"));
        Person john = new Person("Johnson", "Boris", 56, "Downing Street London", new City("New York", "USA"));
        Person gege = new Person("Gérard", "Depardieu", 66, "Kremlin, Moscou", new City("Châteauroux", "France"));
        Person lele = new Person("Lenny", "Kravitz", 56, "hotel particulier a Paris", new City("NY", "USA"));
        Person lolo = new Person("Laurence", "Jennifer", 30, "Louisville, USA", new City("Indian Hills", "USA"));


        ArrayList<Person> personList = Person.getPersonList();
//        for(Person p: personList){
//            System.out.println(p.toString());
//        }
        ArrayList<Person> fromParis = Person.fromParis(personList);
        for(Person p: fromParis){
            System.out.println(p.toString());
        }
    }
}
