package Task2;

public class Blowfish extends Fish implements AnimalBehavior {
    private boolean isPoisonous;
    
    public Blowfish() {}
    
    public Blowfish(String name, int age, double weight, String scaleColor, boolean isPoisonous) {
        super(name, age, weight, scaleColor);
        this.isPoisonous = isPoisonous;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " the blowfish is eating invertebrates.");
    }
    
    @Override
    public String getVoice() {
        return "Puff!";
    }
    
    @Override
    public void sleep() {
        System.out.println(name + " the blowfish is resting at the bottom.");
    }
    
    @Override
    public void move() {
        System.out.println("Blowfish swims.");
    }
    
    public boolean isPoisonous() { return isPoisonous; }
    public void setPoisonous(boolean poisonous) { isPoisonous = poisonous; }
}

