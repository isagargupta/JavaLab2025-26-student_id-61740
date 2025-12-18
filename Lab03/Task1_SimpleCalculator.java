import java.util.Scanner;

public class Task1_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        float firstNumberSagar = scanner.nextFloat();
        
        System.out.print("Enter second number: ");
        float secondNumberSagar = scanner.nextFloat();
        
        float sumSagar = firstNumberSagar + secondNumberSagar;
        float differenceSagar = firstNumberSagar - secondNumberSagar;
        float productSagar = firstNumberSagar * secondNumberSagar;
        float quotientSagar = firstNumberSagar / secondNumberSagar;
        
        System.out.printf("Sum: %.2f%n", sumSagar);
        System.out.printf("Difference: %.2f%n", differenceSagar);
        System.out.printf("Product: %.2f%n", productSagar);
        System.out.printf("Quotient: %.2f%n", quotientSagar);
        
        scanner.close();
    }
}

