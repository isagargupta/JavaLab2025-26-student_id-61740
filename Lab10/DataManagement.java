import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataManagement {
    private String data;
    private static final String FILE_NAME = "names.txt";
    
    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first and last name: ");
        data = scanner.nextLine();
    }
    
    public void writeDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(data);
            writer.newLine();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public void readDataFromFile() {
        System.out.println("\nContents of file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

