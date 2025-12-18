import java.util.ArrayList;

public class Task11_Main {
    public static void main(String[] args) {
        // Load students from file
        ArrayList<Student> students = StudentLoader.loadStudentsFromFile("studentsEN.txt");
        
        System.out.println("All students loaded: " + students.size());
        
        // Stream 1: Find students with grade 5 and print them
        System.out.println("\n=== Students with grade 5 ===");
        students.stream()
                .filter(s -> s.getScore() == 5)
                .forEach(System.out::println);
        
        // Stream 2: Calculate average of all students' grades
        double average = students.stream()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0.0);
        System.out.println("\n=== Average grade ===");
        System.out.printf("Average: %.2f%n", average);
        
        // Stream 3: Count students with grade 5
        long countGrade5 = students.stream()
                .filter(s -> s.getScore() == 5)
                .count();
        System.out.println("\n=== Count of students with grade 5 ===");
        System.out.println("Count: " + countGrade5);
    }
}

