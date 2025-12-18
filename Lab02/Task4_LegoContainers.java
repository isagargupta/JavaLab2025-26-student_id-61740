public class Task4_LegoContainers {
    public static void main(String[] args) {
        // Odd number between 50 and 100 - amount of Lego bricks
        int amountOfBricks = 73;
        System.out.println("Total Lego bricks: " + amountOfBricks);
        
        // Even number between 5 and 10 - container capacity
        int containerCapacity = 8;
        System.out.println("Container capacity: " + containerCapacity + " bricks per container");
        
        // Calculate full containers (integer division)
        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("\nNumber of FULL containers: " + fullContainers);
        
        // Calculate remaining bricks using modulo
        int remainingBricks = amountOfBricks % containerCapacity;
        System.out.println("Bricks in the not-full container (modulo): " + remainingBricks);
        
        // Calculate total containers (full + partial if any)
        int totalContainers = fullContainers;
        if (remainingBricks > 0) {
            totalContainers += 1;
        }
        System.out.println("Total containers needed (full and not full): " + totalContainers);
    }
}

