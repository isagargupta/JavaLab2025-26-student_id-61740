package Task2;

public class Pigeon extends Bird {
    private String species;
    
    public Pigeon() {}
    
    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }
    
    public Pigeon(String name, String species) {
        this.name = name;
        this.species = species;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " the pigeon is eating breadcrumbs.");
    }
    
    @Override
    public String getVoice() {
        return "Coo coo!";
    }
    
    public void deliverMessage() {
        System.out.println(name + " is delivering a message.");
    }
    
    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
    
    @Override
    public String toString() {
        return "Pigeon{name='" + name + "', age=" + age + ", weight=" + weight + ", featherColor='" + featherColor + "', species='" + species + "'}";
    }
}

