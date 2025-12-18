import java.util.Scanner;

public class Task3_NumberSystemConverter {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        char choice;
        
        do {
            displayMenu();
            choice = scanner.next().toUpperCase().charAt(0);
            
            switch (choice) {
                case 'A':
                    convertToDecimal();
                    break;
                case 'B':
                    convertFromDecimal();
                    break;
                case 'C':
                    performOperation('+');
                    break;
                case 'D':
                    performOperation('-');
                    break;
                case 'E':
                    performOperation('*');
                    break;
                case 'F':
                    performOperation('/');
                    break;
                case 'W':
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 'W');
    }
    
    private static void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("Choose what operation you want to perform:");
        System.out.println("A. Convert from any system to the decimal system");
        System.out.println("B. Convert from decimal system to another system");
        System.out.println("C. Summing up numbers from different systems");
        System.out.println("D. Subtracting numbers from different systems");
        System.out.println("E. Multiplying numbers from different systems");
        System.out.println("F. Dividing numbers from different systems");
        System.out.println("W. Exit the program");
        System.out.print("Your choice: ");
    }
    
    private static int getBase() {
        System.out.print("Enter base (2,3,4,5,6,8,9,10,16): ");
        return scanner.nextInt();
    }
    
    private static void convertToDecimal() {
        int base = getBase();
        System.out.print("Enter number in base " + base + ": ");
        String number = scanner.next();
        
        try {
            int decimal = Integer.parseInt(number, base);
            System.out.println("Result in decimal: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number for the given base!");
        }
    }
    
    private static void convertFromDecimal() {
        System.out.print("Enter decimal number: ");
        int decimal = scanner.nextInt();
        int targetBase = getBase();
        
        String result = Integer.toString(decimal, targetBase).toUpperCase();
        System.out.println("Result in base " + targetBase + ": " + result);
    }
    
    private static void performOperation(char operation) {
        // First number
        System.out.println("First number:");
        int base1 = getBase();
        System.out.print("Enter number in base " + base1 + ": ");
        String num1 = scanner.next();
        int decimal1 = Integer.parseInt(num1, base1);
        
        // Second number
        System.out.println("Second number:");
        int base2 = getBase();
        System.out.print("Enter number in base " + base2 + ": ");
        String num2 = scanner.next();
        int decimal2 = Integer.parseInt(num2, base2);
        
        // Perform operation
        int result = 0;
        switch (operation) {
            case '+': result = decimal1 + decimal2; break;
            case '-': result = decimal1 - decimal2; break;
            case '*': result = decimal1 * decimal2; break;
            case '/': 
                if (decimal2 != 0) {
                    result = decimal1 / decimal2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                break;
        }
        
        // Output base
        System.out.print("Enter output base (2,3,4,5,6,8,9,10,16): ");
        int outputBase = scanner.nextInt();
        
        String output = Integer.toString(result, outputBase).toUpperCase();
        System.out.println("Result in base " + outputBase + ": " + output);
    }
}

