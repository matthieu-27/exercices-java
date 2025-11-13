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
        // exercice 3.6
        // on triche en parcourant les objets de toutes les personnes instanciées.
//        for(Person p: personList){
//            // Si c'est une capitale qui le définit : c'est un employé.
//            // Si le nom de sa ville de naissance est Pretoria ou Paris
//            // et que si paris ça contient bien 20000000 d'habitants (Enlève Sarkozy).
//            // C'est que c'est un employé ou un commercial
//            if(p.getCapital() != null || p.getBornCity() != null && (p.getBornCity().getName().equalsIgnoreCase("pretoria") || (p.getBornCity().getName().equalsIgnoreCase("paris") && p.getBornCity().getPopulation() == 2000000))){
//                System.out.println(p);
//            }
//        }

        // exercice 3.7
        for(Person p: personList){
            double income = 0;
            try{
                income = p.calcIncome();
            } catch (EmployeeException e) {
                System.out.println(e.getMessage());
            }
            if(income > 0){
                System.out.println(p + " salaire réel: " + income +"€/mois");
            }
        }

    }
}
