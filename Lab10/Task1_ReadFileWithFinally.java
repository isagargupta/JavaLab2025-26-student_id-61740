import java.io.FileInputStream;
import java.io.IOException;

public class Task1_ReadFileWithFinally {
    public static void main(String[] args) {
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("test.txt");
            int data;
            System.out.println("File contents:");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // Close stream in finally block
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("\nFile closed in finally block.");
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}

