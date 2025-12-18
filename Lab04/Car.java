public class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
    
    // Constructor
    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }
    
    // Getters
    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
    public int getQuantity() { return quantity; }
    
    // Setters
    public void setModel(String model) { this.model = model; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }
    public void setColor(String color) { this.color = color; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    
    // Delivery method - increases quantity
    public void delivery(int amount) {
        quantity += amount;
        System.out.println("Delivered " + amount + " cars. New quantity: " + quantity);
    }
    
    // Sell method - decreases quantity
    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Sold " + amount + " cars. Remaining quantity: " + quantity);
        } else {
            System.out.println("Not enough cars in stock!");
        }
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

