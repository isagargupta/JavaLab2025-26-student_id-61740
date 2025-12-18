public class Task3_EvenOrOdd {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Generated random number: " + randomNumber);
        
        // Check if even or odd using modulo
        int remainder = randomNumber % 2;
        System.out.println("Remainder when divided by 2 (modulo): " + remainder);
        
        if (remainder == 0) {
            System.out.println("The number " + randomNumber + " is EVEN.");
        } else {
            System.out.println("The number " + randomNumber + " is ODD.");
        }
    }
}

