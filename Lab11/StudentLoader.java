import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentLoader {
    
    public static ArrayList<Student> loadStudentsFromFile(String filename) {
        ArrayList<Student> students = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split(" ");
                if (parts.length >= 3) {
                    String name = parts[0];
                    String surname = parts[1];
                    int score = Integer.parseInt(parts[2]);
                    students.add(new Student(name, surname, score));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        return students;
    }
}

