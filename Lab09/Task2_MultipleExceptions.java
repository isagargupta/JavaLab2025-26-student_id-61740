public class Task2_MultipleExceptions {
    
    public static void throwException(int value) {
        if (value == 1) {
            int result = 10 / 0; // ArithmeticException
        } else if (value == 2) {
            int[] arr = new int[5];
            arr[10] = 100; // ArrayIndexOutOfBoundsException
        }
        // value == 0 or other: no exception
        System.out.println("No exception thrown for value: " + value);
    }
    
    public static void main(String[] args) {
        int[] testValues = {0, 1, 2};
        
        for (int value : testValues) {
            System.out.println("\n=== Testing with value: " + value + " ===");
            try {
                throwException(value);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            } finally {
                System.out.println("Finally block executed!");
            }
        }
    }
}

