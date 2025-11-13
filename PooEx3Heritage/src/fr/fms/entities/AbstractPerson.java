package fr.fms.entities;

public abstract class AbstractPerson {
    private Person person;

    public abstract double calcIncome() throws EmployeeException;
}
