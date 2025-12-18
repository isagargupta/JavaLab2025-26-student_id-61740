package Task2;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;
    
    public Dog() {}
    
    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
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
    
    @Override
    public void sleep() {
        System.out.println(name + " the dog is sleeping in its bed.");
    }
    
    @Override
    public void move() {
        System.out.println("Dog runs.");
    }
    
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
}

