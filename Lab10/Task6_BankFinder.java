import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Task6_BankFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first three digits of your bank account: ");
        String bankCode = scanner.nextLine().trim();
        
        String urlString = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";
        
        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            
            String line;
            boolean found = false;
            
            while ((line = reader.readLine()) != null) {
                // File format: bank_number \t bank_name (tab separated)
                if (line.startsWith(bankCode)) {
                    String[] parts = line.split("\t");
                    if (parts.length >= 2) {
                        System.out.println("\n=== Bank Information ===");
                        System.out.println("Bank code: " + parts[0].trim());
                        System.out.println("Bank name: " + parts[1].trim());
                        found = true;
                        break;
                    }
                }
            }
            
            if (!found) {
                System.out.println("Bank with code '" + bankCode + "' not found.");
            }
            
            reader.close();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Note: This task requires internet connection to access NBP website.");
        }
        
        scanner.close();
    }
}

