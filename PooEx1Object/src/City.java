public class City {
    private String name;
    private String country;
    private int population;

    public City(String name, String country, int population){
        this.name = name;
        this.country = country;
        // ici ont s'assure que la population de la ville n'est pas négative.
        if(population < 0){
            throw new RuntimeException("La population ne peux pas être négative");
        }else{
            this.population = population;
        }
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
        // ici ont s'assure que la population de la ville n'est pas négative.
        if(population < 0){
            throw new RuntimeException("La population ne peux pas être négative");
        } else {
            this.population = population;
        }
    }

    @Override
    public String toString() {
        return "Nom:" + this.getName() + " Pays:" + this.getCountry() + " Population: " + this.getPopulation();
    }
}
