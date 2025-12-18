package Task2;

public class Dog extends Mammal {
    private String breed;
    
    public Dog() {}
    
    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }
    
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " the dog is eating dog food.");
    }
    
    @Override
    public String getVoice() {
        return "Woof woof!";
    }
    
    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
    
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
    
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", weight=" + weight + ", furColor='" + furColor + "', breed='" + breed + "'}";
    }
}

