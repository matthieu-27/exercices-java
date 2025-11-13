package fr.fms.entities;

public class Employee extends Person{
    private String workingPlace;
    private int salary;

    public Employee(String firstName, String lastName, int age, String address, City bornCity ,String workingPlace, int salary){
        super(firstName, lastName, age, address, bornCity);
        this.workingPlace = workingPlace;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, int age, String address, Capital capital ,String workingPlace, int salary){
        super(firstName, lastName, age, address, capital);
        this.workingPlace = workingPlace;
        this.salary = salary;
    }

    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Entreprise: " + this.getWorkingPlace() + ", salaire: " + this.getSalary();
    }
}
