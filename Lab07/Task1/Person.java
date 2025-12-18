package Task1;

import java.util.Scanner;

public class Person {
    protected String surname;
    protected String firstName;
    protected String street;
    protected String zipCode;
    protected String city;
    
    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname: ");
        surname = scanner.nextLine();
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter street: ");
        street = scanner.nextLine();
        System.out.print("Enter zip code: ");
        zipCode = scanner.nextLine();
        System.out.print("Enter city: ");
        city = scanner.nextLine();
    }
    
    public void print() {
        System.out.println("=== Person Details ===");
        System.out.println("Name: " + firstName + " " + surname);
        System.out.println("Address: " + street + ", " + zipCode + " " + city);
    }
}

