// Three custom exception classes
class FirstException extends Exception {
    public FirstException(String message) { super(message); }
}

class SecondException extends Exception {
    public SecondException(String message) { super(message); }
}

class ThirdException extends Exception {
    public ThirdException(String message) { super(message); }
}

public class Task4_ThreeExceptions {
    
    public static void throwBasedOnValue(int value) throws FirstException, SecondException, ThirdException {
        if (value == 1) {
            throw new FirstException("First exception thrown!");
        } else if (value == 2) {
            throw new SecondException("Second exception thrown!");
        } else if (value == 3) {
            throw new ThirdException("Third exception thrown!");
        }
    }
    
    public static void main(String[] args) {
        int[] testValues = {1, 2, 3};
        
        for (int value : testValues) {
            System.out.println("\n=== Testing with value: " + value + " ===");
            try {
                throwBasedOnValue(value);
            } catch (FirstException | SecondException | ThirdException e) {
                System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            }
        }
    }
}

