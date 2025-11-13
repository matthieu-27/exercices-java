package fr.fms.entities;

public class SalesMan extends Person{
    private static double MIN_PERCENTAGE = 3.5;
    private double percentageSalary;
    private String workPlace;

    public SalesMan(String firstName, String lastName, int age, String address, City bornCity, double percentageSalary, String workPlace){
        super(firstName, lastName, age, address, bornCity);
        this.percentageSalary = checkSalary(percentageSalary);
        this.workPlace = workPlace;
    }

    private static double checkSalary(double salary){
        // ici ont s'assure que le pourcentage du salaire n'est pas négatif.
        try {
            if(salary < 0){
                throw new RuntimeException("Le pourcentage du salaire de peux être négatif");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return MIN_PERCENTAGE;
        }
        return salary;
    }

    public double getPercentageSalary() {
        return percentageSalary;
    }

    public void setPercentageSalary(double percentageSalary) {
        this.percentageSalary = checkSalary(percentageSalary);
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return super.toString() + " Pourcentage CA: " + this.getPercentageSalary() + "%, Lieu de travail: " + this.getWorkPlace();
    }
}
