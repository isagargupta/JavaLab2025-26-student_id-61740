package Task2;

public class Task2_Main {
    public static void main(String[] args) {
        // Create array of Animal references
        Animal[] animals = new Animal[6];
        
        // Create objects using different constructors
        animals[0] = new Dog("Buddy", 3, 25.5, "Golden", "Golden Retriever");
        animals[1] = new Dog("Max", "German Shepherd");
        animals[2] = new Pigeon("Percy", 2, 0.3, "Gray", "Rock Pigeon");
        animals[3] = new Pigeon("Coco", "Carrier Pigeon");
        animals[4] = new Blowfish("Puff", 1, 0.5, "Yellow", true);
        animals[5] = new Blowfish("Spike", false);
        
        // Call methods on each animal
        for (int i = 0; i < animals.length; i++) {
            System.out.println("=== Animal " + (i + 1) + " ===");
            System.out.println(animals[i].toString());
            animals[i].eat();
            System.out.println("Voice: " + animals[i].getVoice());
            
            // Call specific methods based on type
            if (animals[i] instanceof Dog) {
                ((Dog) animals[i]).fetch();
            } else if (animals[i] instanceof Pigeon) {
                ((Pigeon) animals[i]).deliverMessage();
            } else if (animals[i] instanceof Blowfish) {
                ((Blowfish) animals[i]).inflate();
            }
            System.out.println();
        }
    }
}

