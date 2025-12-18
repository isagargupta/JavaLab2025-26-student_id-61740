package Task2;

public class Mammal extends Animal {
    protected String furColor;
    
    public Mammal() {}
    
    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }
    
    public Mammal(String name, String furColor) {
        this.name = name;
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
    
    public void nurse() {
        System.out.println(name + " is nursing its young.");
    }
    
    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }
    
    @Override
    public String toString() {
        return "Mammal{name='" + name + "', age=" + age + ", weight=" + weight + ", furColor='" + furColor + "'}";
    }
}

