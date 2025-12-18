package Task2;

public class Bird extends Animal {
    protected String featherColor;
    
    public Bird() {}
    
    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }
    
    public Bird(String name, String featherColor) {
        this.name = name;
        this.featherColor = featherColor;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " the bird is pecking at seeds.");
    }
    
    @Override
    public String getVoice() {
        return "Chirp chirp!";
    }
    
    public void fly() {
        System.out.println(name + " is flying.");
    }
    
    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }
    
    @Override
    public String toString() {
        return "Bird{name='" + name + "', age=" + age + ", weight=" + weight + ", featherColor='" + featherColor + "'}";
    }
}

