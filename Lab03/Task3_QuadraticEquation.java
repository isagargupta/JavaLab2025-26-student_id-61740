import java.util.Scanner;

public class Task3_QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quadratic Equation: ax² + bx + c = 0");
        
        System.out.print("Enter a: ");
        double aSagar = scanner.nextDouble();
        
        System.out.print("Enter b: ");
        double bSagar = scanner.nextDouble();
        
        System.out.print("Enter c: ");
        double cSagar = scanner.nextDouble();
        
        System.out.printf("a = %.2f, b = %.2f, c = %.2f%n", aSagar, bSagar, cSagar);
        
        // Check if a is zero
        if (aSagar == 0) {
            System.out.println("Error: 'a' cannot be zero for a quadratic equation.");
            scanner.close();
            return;
        }
        
        // Calculate delta
        double deltaSagar = bSagar * bSagar - 4 * aSagar * cSagar;
        System.out.printf("Delta = %.2f%n", deltaSagar);
        
        // Determine number of roots
        int numberOfRoots;
        if (deltaSagar > 0) {
            numberOfRoots = 2;
        } else if (deltaSagar == 0) {
            numberOfRoots = 1;
        } else {
            numberOfRoots = 0;
        }
        
        // Switch statement based on number of roots
        switch (numberOfRoots) {
            case 2:
                double x1Sagar = (-bSagar + Math.sqrt(deltaSagar)) / (2 * aSagar);
                double x2Sagar = (-bSagar - Math.sqrt(deltaSagar)) / (2 * aSagar);
                System.out.printf("Two roots: x1 = %.2f, x2 = %.2f%n", x1Sagar, x2Sagar);
                break;
            case 1:
                double xSagar = -bSagar / (2 * aSagar);
                System.out.printf("One root: x = %.2f%n", xSagar);
                break;
            case 0:
                System.out.println("No real roots (delta < 0).");
                break;
        }
        
        scanner.close();
    }
}

