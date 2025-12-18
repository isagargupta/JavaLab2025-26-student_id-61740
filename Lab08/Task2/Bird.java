package Task2;

public class Bird extends Animal {
    protected String featherColor;
    
    public Bird() {}
    
    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " the bird is eating seeds.");
    }
    
    @Override
    public String getVoice() {
        return "Chirp!";
    }
    
    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }
}

