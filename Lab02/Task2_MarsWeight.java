public class Task2_MarsWeight {
    public static void main(String[] args) {
        // Declare all variables at the top
        float earthWeightSagar = 70.5f;
        float marsGravityFactorSagar = 0.38f;
        
        // Calculate weight on Mars
        float marsWeightFloatSagar = earthWeightSagar * marsGravityFactorSagar;
        System.out.println("Earth weight (float): " + earthWeightSagar + " kg");
        System.out.println("Mars gravity factor: " + marsGravityFactorSagar);
        System.out.println("Mars weight (float): " + marsWeightFloatSagar + " kg");
        
        // Assign result to double type variable
        double marsWeightDoubleSagar = marsWeightFloatSagar;
        System.out.println("\nAssigned float to double variable.");
        System.out.printf("Mars weight (double, 4 decimal places): %.4f kg%n", marsWeightDoubleSagar);
        
        // Cast double to int
        int marsWeightIntSagar = (int) marsWeightDoubleSagar;
        System.out.println("\nCasted double to int.");
        System.out.println("Mars weight (int): " + marsWeightIntSagar + " kg");
        
        // Cast int to char
        char marsWeightCharSagar = (char) marsWeightIntSagar;
        System.out.println("\nCasted int to char.");
        System.out.println("Mars weight (char): " + marsWeightCharSagar);
        System.out.println("ASCII value of char: " + (int) marsWeightCharSagar);
        
        // Math operation on char and assign to int
        int mathResultSagar = marsWeightCharSagar + 10;
        System.out.println("\nPerformed math operation: char + 10");
        System.out.println("Result of char + 10 (int): " + mathResultSagar);
    }
}

