import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3_CopyReplaceSpaces {
    public static void main(String[] args) {
        // Try-with-resources for automatic closing
        try (FileInputStream fis = new FileInputStream("test.txt");
             FileOutputStream fos = new FileOutputStream("test_copy.txt")) {
            
            int data;
            while ((data = fis.read()) != -1) {
                // Replace space (32) with dash (45)
                if (data == ' ') {
                    fos.write('-');
                } else {
                    fos.write(data);
                }
            }
            System.out.println("File copied with spaces replaced by dashes.");
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

