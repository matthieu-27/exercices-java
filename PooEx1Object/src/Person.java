public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private City city;

    public Person(String firstName, String lastName, int age, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.city = null;
    }

    public Person(String firstName, String lastName, int age, String address, City city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.city = city;
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = "unknown";
        this.city = null;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 200;
        this.address = "unknown";
        this.city = null;
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

    public void setAdress(String adress) {
        this.address = adress;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString(){
        String city = this.getCity() != null ? this.getCity().personDisplay() : "null";
        return ("Person " + "[firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", age=" + this.getAge() + ", address=" + this.getAddress() +"]" + city);
    }
}
