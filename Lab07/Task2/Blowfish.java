package Task2;

public class Blowfish extends Fish {
    private boolean isPoisonous;
    
    public Blowfish() {}
    
    public Blowfish(String name, int age, double weight, String scaleColor, boolean isPoisonous) {
        super(name, age, weight, scaleColor);
        this.isPoisonous = isPoisonous;
    }
    
    public Blowfish(String name, boolean isPoisonous) {
        this.name = name;
        this.isPoisonous = isPoisonous;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " the blowfish is eating small invertebrates.");
    }
    
    @Override
    public String getVoice() {
        return "Puff puff!";
    }
    
    public void inflate() {
        System.out.println(name + " is inflating to defend itself!");
    }
    
    public boolean isPoisonous() { return isPoisonous; }
    public void setPoisonous(boolean poisonous) { isPoisonous = poisonous; }
    
    @Override
    public String toString() {
        return "Blowfish{name='" + name + "', age=" + age + ", weight=" + weight + ", scaleColor='" + scaleColor + "', isPoisonous=" + isPoisonous + "}";
    }
}

