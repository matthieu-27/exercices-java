package fr.fms.entities;

public class SalesMan extends Person{
    private double percentageSalary;
    private String workPlace;

    public SalesMan(String firstName, String lastName, int age, String address, City bornCity, double percentageSalary, String workPlace){
        super(firstName, lastName, age, address, bornCity);
        this.percentageSalary = percentageSalary;
        this.workPlace = workPlace;
    }

    public double getPercentageSalary() {
        return percentageSalary;
    }

    public void setPercentageSalary(double percentageSalary) {
        this.percentageSalary = percentageSalary;
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
