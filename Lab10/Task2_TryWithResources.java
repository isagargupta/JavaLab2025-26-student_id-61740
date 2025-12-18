import java.io.FileInputStream;
import java.io.IOException;

public class Task2_TryWithResources {
    public static void main(String[] args) {
        // Try-with-resources - automatic closing (JDK7+)
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data;
            System.out.println("File contents:");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\nFile will be closed automatically.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

