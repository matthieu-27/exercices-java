package fr.fms.entities;

public class TestEmployee {
    public static void main(String[] args) {
        Employee bill = new Employee("Bill", "Gates", 65, "habitant au US", new Capital("Washington", "USA", 1000000, "W-M"), "Entreprise B&M", 100000);
        Employee musk = new Employee("Elon", "Musk", 53, "habitant a Palo Alto", new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000);
        SalesMan robert = new SalesMan("Robert", "Pires", 19, "rue des muscles", new City("Paris", "France", 2000000), 5.2, "Ailier Gauche");
        robert.setPercentageSalary(-3.5);

        System.out.println(bill);
        System.out.println(musk);
        System.out.println(robert);
    }
}
