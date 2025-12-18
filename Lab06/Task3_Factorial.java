public class Task3_Factorial {
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println("Factorial of " + n + " (non-recursive): " + factorialNonRecursive(n));
        System.out.println("Factorial of " + n + " (recursive): " + factorialRecursive(n));
    }
    
    // Task 3 - Initial version: returns 1 if n=1, else (n-1)*n
    public static int factorialNonRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return (n - 1) * n;
    }
    
    // Task 3 modified - Recursive version: n! = (n-1)! * n
    public static int factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return factorialRecursive(n - 1) * n;
    }
}

