import java.util.Scanner;

public class RectangleArea {
    private double lengthSagar;
    private double widthSagar;
    private double areaSagar;
    
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        lengthSagar = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        widthSagar = scanner.nextDouble();
    }
    
    public void computeField() {
        areaSagar = lengthSagar * widthSagar;
    }
    
    public void fieldDisplay() {
        System.out.println("Rectangle dimensions: " + lengthSagar + " x " + widthSagar);
        System.out.println("Area of rectangle: " + areaSagar);
    }
}

