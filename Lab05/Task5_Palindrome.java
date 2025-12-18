import java.util.Scanner;

public class Task5_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        // Convert to lowercase
        String lowerWord = word.toLowerCase();
        
        // Reverse the string
        String reversed = new StringBuilder(lowerWord).reverse().toString();
        
        // Check if palindrome
        if (lowerWord.equals(reversed)) {
            System.out.println("\"" + word + "\" IS a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is NOT a palindrome.");
        }
        
        scanner.close();
    }
}

