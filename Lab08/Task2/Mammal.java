package Task2;

public class Mammal extends Animal {
    protected String furColor;
    
    public Mammal() {}
    
    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " the mammal is eating.");
    }
    
    @Override
    public String getVoice() {
        return "Generic mammal sound";
    }
    
    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }
}

