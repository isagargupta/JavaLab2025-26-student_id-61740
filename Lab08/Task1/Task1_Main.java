package Task1;

public class Task1_Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.initialize1();
        System.out.println();
        staff.print1();
        
        // Calculate salary
        int hoursSagar61740 = 160;
        double rateSagar61740 = 25.0;
        int overtimeHoursSagar61740 = 20;
        int yearsOfExperienceSagar61740 = 6;
        
        System.out.println("\n=== Salary Calculations ===");
        System.out.println("Regular salary (" + hoursSagar61740 + " hours @ $" + rateSagar61740 + "): $" 
            + staff.salaryToPaySagar61740(hoursSagar61740, rateSagar61740));
        
        // Default method behavior - can be called on instance
        System.out.println("Overtime salary (" + overtimeHoursSagar61740 + " hours @ $" + rateSagar61740 + "): $" 
            + staff.salaryForOvertimeSagar61740(overtimeHoursSagar61740, rateSagar61740));
        
        // Static method - called on interface name, NOT on instance
        boolean bonusSagar61740 = Salary.shouldReceiveBonusSagar61740(yearsOfExperienceSagar61740);
        System.out.println("Should receive bonus (" + yearsOfExperienceSagar61740 + " years): " + bonusSagar61740);
        
        /*
         * Answers:
         * - salaryToPaySagar61740: MUST be overridden (normal interface method)
         * - shouldReceiveBonusSagar61740: CANNOT be overridden (static method)
         * - salaryForOvertimeSagar61740: CAN be overridden but doesn't have to (default method)
         * 
         * Static method is called on the interface: Salary.shouldReceiveBonusSagar61740()
         * Default method provides a default implementation that can be used or overridden
         */
    }
}

