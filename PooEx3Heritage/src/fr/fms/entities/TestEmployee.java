package fr.fms.entities;

public class TestEmployee {
    public static void main(String[] args) {
        Employee bill = new Employee("Bill", "Gates", 65, "habitant au US", new Capital("Washington", "USA", 1000000, "W-M"), "Entreprise B&M", 100000);
        Employee musk = new Employee("Elon", "Musk", 53, "habitant a Palo Alto", new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000);

        System.out.println(bill);
        System.out.println(musk);
    }
}
