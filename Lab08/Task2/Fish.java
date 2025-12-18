package Task2;

public class Fish extends Animal {
    protected String scaleColor;
    
    public Fish() {}
    
    public Fish(String name, int age, double weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " the fish is eating plankton.");
    }
    
    @Override
    public String getVoice() {
        return "Blub!";
    }
    
    public String getScaleColor() { return scaleColor; }
    public void setScaleColor(String scaleColor) { this.scaleColor = scaleColor; }
}

