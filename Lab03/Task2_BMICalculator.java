import java.util.Scanner;

public class Task2_BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        float heightSagar = scanner.nextFloat();
        
        System.out.print("Enter your weight in kg: ");
        float weightSagar = scanner.nextFloat();
        
        // BMI = weight / height^2
        double bmiSagar = weightSagar / Math.pow(heightSagar, 2);
        
        System.out.printf("Your BMI: %.2f%n", bmiSagar);
        
        // If-else-if ladder for BMI classification
        if (bmiSagar < 16.00) {
            System.out.println("Category: Starvation");
        } else if (bmiSagar <= 16.99) {
            System.out.println("Category: Emaciation");
        } else if (bmiSagar <= 18.49) {
            System.out.println("Category: Underweight");
        } else if (bmiSagar <= 22.99) {
            System.out.println("Category: Normal, low range");
        } else if (bmiSagar <= 24.99) {
            System.out.println("Category: Normal, high range");
        } else if (bmiSagar <= 27.49) {
            System.out.println("Category: Overweight, low range");
        } else if (bmiSagar <= 29.99) {
            System.out.println("Category: Overweight, high range");
        } else if (bmiSagar <= 34.99) {
            System.out.println("Category: 1st degree obesity");
        } else if (bmiSagar <= 39.99) {
            System.out.println("Category: 2nd degree obesity");
        } else {
            System.out.println("Category: 3rd degree obesity");
        }
        
        scanner.close();
    }
}

