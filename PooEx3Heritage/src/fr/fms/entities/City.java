package fr.fms.entities;

public class City {
    private String name;
    private String country;
    private int population;
    public static int instanceNumber = 0;

    public City(String name, String country, int population){
        this.name = name;
        this.country = country;
        this.population = checkPopulation(population);
        instanceNumber++;
    }

    public City(String name, String country){
        this.name = name;
        this.country = country;
        this.population = 0;
        instanceNumber++;
    }

    public City(String name, int population){
        this.name = name;
        this.country = "unknown";
        this.population = checkPopulation(population);
        instanceNumber++;
    }

    private static int checkPopulation(int population){
        // ici ont s'assure que la population de la ville n'est pas négative.
        try {
            if(population < 0){
                throw new RuntimeException("La population ne peux pas être négative");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = checkPopulation(population);
    }

    public void display(){
        System.out.println("Ville de " + this.getName() +" en " + this.getCountry() + " ayant: " + this.getPopulation() + " habitants.");
    }

    public String personDisplay() {
        return "Ville de naissance: " + this.getName() + ", " + this.getCountry();
    }


    @Override
    public String toString() {
        return "Ville de naissance: " + this.getName() + ", " + this.getCountry();
    }

    public static int getInstanceNumber() {
        return instanceNumber;
    }
}
