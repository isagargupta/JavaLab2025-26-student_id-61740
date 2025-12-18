import java.util.Scanner;

public class Task4_ConcatenatingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String first = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String second = scanner.nextLine();
        
        // Concatenate strings using concat() method
        String firstPlusSecond = first.concat(second);
        String secondPlusFirst = second.concat(first);
        
        System.out.println("\nFirst + Second: " + firstPlusSecond);
        System.out.println("Second + First: " + secondPlusFirst);
        
        // Compare concatenated strings using equals()
        boolean areEqual = firstPlusSecond.equals(secondPlusFirst);
        
        System.out.println("\nAre concatenations equal? " + areEqual);
        if (areEqual) {
            System.out.println("The composition of two strings IS alternating.");
        } else {
            System.out.println("The composition of two strings is NOT alternating.");
        }
        
        scanner.close();
    }
}

