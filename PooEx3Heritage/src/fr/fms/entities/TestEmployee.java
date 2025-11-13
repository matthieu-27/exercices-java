package fr.fms.entities;

import java.util.ArrayList;

public class TestEmployee {
    public static void main(String[] args) {
        Employee bill = new Employee("Bill", "Gates", 65, "habitant au US", new Capital("Washington", "USA", 1000000, "W-M"), "Entreprise B&M", 100000);
        Employee musk = new Employee("Elon", "Musk", 53, "habitant a Palo Alto", new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000);
        SalesMan robert = new SalesMan("Robert", "Pires", 19, "rue des muscles", new City("Paris", "France", 2000000), 5.2, "Ailier Gauche");
        robert.setPercentageSalary(-3.5);
        Person manu = new Person("Manu", "TuDescend", 43, "Jpeux pas g piscine", new City("Amiens", "France"));
        Person vlad = new Person("Vladimir", "Poutine", 68);
        Person covfefe = new Person("Donald", "Trump");
        Person nico = new Person("Nicolas", "Sarkozy", 66, "Paris rue du Louvre", new City("Paris", "France"));
        Person john = new Person("Johnson", "Boris", 56, "Downing Street London", new City("New York", "USA"));
        Person gege = new Person("Gérard", "Depardieu", 66, "Kremlin, Moscou", new City("Châteauroux", "France"));
        Person lele = new Person("Lenny", "Kravitz", 56, "hotel particulier a Paris", new City("NY", "USA"));
        Person lolo = new Person("Laurence", "Jennifer", 30, "Louisville, USA", new City("Indian Hills", "USA"));
        ArrayList<Person> personList = Person.getPersonList();
        for(Person p: personList){
            System.out.println(p.toString());
        }

    }
}
