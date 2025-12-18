package Task2;

public class Pigeon extends Bird implements AnimalBehavior {
    private String species;
    
    public Pigeon() {}
    
    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
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
    
    @Override
    public void sleep() {
        System.out.println(name + " the pigeon is sleeping on a branch.");
    }
    
    @Override
    public void move() {
        System.out.println("Pigeon flies.");
    }
    
    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
}

