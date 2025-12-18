package Task2;

public class Task2_Main {
    public static void main(String[] args) {
        // Array of Animal references (all implement AnimalMove)
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", 3, 25.5, "Golden", "Golden Retriever");
        animals[1] = new Pigeon("Percy", 2, 0.3, "Gray", "Rock Pigeon");
        animals[2] = new Blowfish("Puff", 1, 0.5, "Yellow", true);
        
        // Array of AnimalBehavior references
        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = new Dog("Max", 4, 30.0, "Brown", "German Shepherd");
        behaviors[1] = new Pigeon("Coco", 1, 0.25, "White", "Carrier Pigeon");
        behaviors[2] = new Blowfish("Spike", 2, 0.6, "Orange", false);
        
        // Call sleep() on AnimalBehavior array
        System.out.println("=== AnimalBehavior - sleep() ===");
        for (int i = 0; i < behaviors.length; i++) {
            behaviors[i].sleep();
        }
        
        // Call move() using foreach on Animal array (AnimalMove interface)
        System.out.println("\n=== AnimalMove - move() ===");
        for (Animal animal : animals) {
            animal.move();
        }
        
        // Call static method AnimalName.name() using foreach
        System.out.println("\n=== AnimalName - static name() ===");
        for (Animal animal : animals) {
            AnimalName.name(animal.getName());
        }
    }
}

