public class Task1_NullPointer {
    
    public static void generateNullPointer() {
        String str = null;
        str.length(); // This will throw NullPointerException
    }
    
    public static void main(String[] args) {
        try {
            generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Error: A NullPointerException occurred!");
            System.out.println("\ntoString(): " + e.toString());
            System.out.println("\nStack trace:");
            e.printStackTrace();
        }
    }
}

