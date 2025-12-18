package Task1;

import java.util.Scanner;

public class Person {
    protected String surnameSagar61740;
    protected String firstNameSagar61740;
    protected String streetSagar61740;
    protected String zipCodeSagar61740;
    protected String citySagar61740;
    
    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname: ");
        surnameSagar61740 = scanner.nextLine();
        System.out.print("Enter first name: ");
        firstNameSagar61740 = scanner.nextLine();
        System.out.print("Enter street: ");
        streetSagar61740 = scanner.nextLine();
        System.out.print("Enter zip code: ");
        zipCodeSagar61740 = scanner.nextLine();
        System.out.print("Enter city: ");
        citySagar61740 = scanner.nextLine();
    }
    
    public void print() {
        System.out.println("=== Person Details ===");
        System.out.println("Name: " + firstNameSagar61740 + " " + surnameSagar61740);
        System.out.println("Address: " + streetSagar61740 + ", " + zipCodeSagar61740 + " " + citySagar61740);
    }
}

