package Task1;

import java.util.Scanner;

public class Staff extends Person implements Salary {
    private String educationSagar61740;
    private String positionSagar61740;
    
    public void initialize1() {
        initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter education: ");
        educationSagar61740 = scanner.nextLine();
        System.out.print("Enter position: ");
        positionSagar61740 = scanner.nextLine();
    }
    
    public void print1() {
        print();
        System.out.println("Education: " + educationSagar61740);
        System.out.println("Position: " + positionSagar61740);
    }
    
    // MUST override - normal interface method
    @Override
    public double salaryToPaySagar61740(int hours, double rate) {
        return hours * rate;
    }
    
    // CAN override default method - but don't have to
    // Here we override it to add custom behavior
    @Override
    public double salaryForOvertimeSagar61740(int overtimeHours, double rate) {
        return overtimeHours * rate * 2.0; // Custom: 2x rate instead of 1.5x
    }
}

