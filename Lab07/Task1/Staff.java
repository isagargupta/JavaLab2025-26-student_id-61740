package Task1;

import java.util.Scanner;

public class Staff extends Person {
    private String education;
    private String position;
    
    public void initialize1() {
        initialize(); // Call parent method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter education: ");
        education = scanner.nextLine();
        System.out.print("Enter position: ");
        position = scanner.nextLine();
    }
    
    public void print1() {
        print(); // Call parent method
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}

