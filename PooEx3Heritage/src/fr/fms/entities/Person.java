package fr.fms.entities;
import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private City bornCity;
    public static ArrayList<Person> personList = new ArrayList<>();
    private Capital capital;

    public Person(String firstName, String lastName, int age, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.bornCity = null;
        this.capital = null;
        personList.add(this);
    }

    public Person(String firstName, String lastName, int age, String address, City bornCity){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.bornCity = bornCity;
        this.capital = null;
        personList.add(this);
    }

    public Person(String firstName, String lastName, int age, String address, Capital capital){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.bornCity = null;
        this.capital = capital;
        personList.add(this);
    }
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = "unknown";
        this.bornCity = null;
        personList.add(this);
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 200;
        this.address = "unknown";
        this.bornCity = null;
        personList.add(this);
    }

    public static ArrayList<Person> getPersonList() {
        return personList;
    }

    public static ArrayList<Person> fromParis(ArrayList<Person> personList){
        ArrayList<Person> result = new ArrayList<>();
        for(Person person: personList){
            if(person.getAddress().equalsIgnoreCase("paris") || person.getBornCity().getCountry().equalsIgnoreCase("france")){
                result.add(person);
            }
        }
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getBornCity() {
        return bornCity;
    }

    public void setBornCity(City bornCity) {
        this.bornCity = bornCity;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    @Override
    public String toString(){
        String capital = this.getCapital() != null ? this.getCapital().toString() : "null";
        String city = this.getBornCity() != null ? this.getBornCity().toString() : "null";
        return (this.getFirstName() + ", " + this.getLastName() + ", " + this.getAge() + "ans, " + this.getAddress() +", " + (!capital.equalsIgnoreCase("null") ? capital : city));
    }
}
