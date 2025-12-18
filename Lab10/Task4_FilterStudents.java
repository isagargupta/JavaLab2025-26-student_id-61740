import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Task4_FilterStudents {
    public static void main(String[] args) {
        // Using Character-Based Streams: FileReader, FileWriter
        try (BufferedReader reader = new BufferedReader(new FileReader("studentsEN.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("students_grade5.txt"))) {
            
            String line;
            int count = 0;
            
            while ((line = reader.readLine()) != null) {
                // Check if line ends with grade 5
                if (line.trim().endsWith("5")) {
                    writer.write(line);
                    writer.newLine();
                    count++;
                }
            }
            
            System.out.println("Found " + count + " students with grade 5.");
            System.out.println("Written to students_grade5.txt");
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

