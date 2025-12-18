package Task1;

public interface Salary {
    // Normal interface method - MUST be overridden
    double salaryToPaySagar61740(int hours, double rate);
    
    // Default method - CAN be overridden but doesn't have to
    default double salaryForOvertimeSagar61740(int overtimeHours, double rate) {
        return overtimeHours * rate * 1.5; // Overtime paid at 1.5x rate
    }
    
    // Static method - CANNOT be overridden
    static boolean shouldReceiveBonusSagar61740(int yearsOfExperience) {
        return yearsOfExperience >= 5;
    }
}

