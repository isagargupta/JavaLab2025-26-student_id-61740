public class Task2_Main {
    public static void main(String[] args) {
        // Create Car object using constructor
        Car car = new Car("Model S", "Tesla", 2023, 79999.99, "Red", 10);
        
        // Call and print toString()
        System.out.println("Initial state:");
        System.out.println(car.toString());
        
        // Call sell() method
        System.out.println("\nSelling 3 cars:");
        car.sell(3);
        
        // Print all fields using get methods
        System.out.println("\nUsing get methods:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());
        
        // Change some fields using set methods
        System.out.println("\nChanging fields using set methods:");
        car.setColor("Blue");
        car.setPrice(74999.99);
        car.setYear(2024);
        
        // Call and print toString() again to see changes
        System.out.println("\nAfter changes:");
        System.out.println(car.toString());
        
        // Test delivery
        System.out.println("\nDelivering 5 cars:");
        car.delivery(5);
        System.out.println(car.toString());
    }
}

