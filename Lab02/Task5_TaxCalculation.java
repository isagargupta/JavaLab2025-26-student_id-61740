import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task5_TaxCalculation {
    public static void main(String[] args) {
        System.out.println("=== Using double types ===\n");
        
        // Product net price
        double netPriceDouble = 9.99;
        double vatRate = 0.23;
        
        // Calculate gross value (net + 23% VAT)
        double grossPriceDouble = netPriceDouble * (1 + vatRate);
        System.out.println("Net price (double): " + netPriceDouble);
        System.out.println("Gross price with 23% VAT (double): " + grossPriceDouble);
        
        // Multiply by 10,000 (sold 10,000 pcs)
        double totalGrossDouble = grossPriceDouble * 10000;
        System.out.println("Total gross for 10,000 units (double): " + totalGrossDouble);
        
        // Calculate value excluding VAT
        double totalNetDouble = totalGrossDouble / (1 + vatRate);
        System.out.println("Total net value (double): " + totalNetDouble);
        
        System.out.println("\n=== Using BigDecimal class ===\n");
        
        // Using BigDecimal for precise calculations
        BigDecimal netPriceBD = new BigDecimal("9.99");
        BigDecimal vatRateBD = new BigDecimal("0.23");
        BigDecimal oneHundred = new BigDecimal("1");
        BigDecimal quantity = new BigDecimal("10000");
        
        // Calculate gross value
        BigDecimal grossPriceBD = netPriceBD.multiply(oneHundred.add(vatRateBD));
        System.out.println("Net price (BigDecimal): " + netPriceBD);
        System.out.println("Gross price with 23% VAT (BigDecimal): " + grossPriceBD);
        
        // Multiply by 10,000
        BigDecimal totalGrossBD = grossPriceBD.multiply(quantity);
        System.out.println("Total gross for 10,000 units (BigDecimal): " + totalGrossBD);
        
        // Calculate value excluding VAT
        BigDecimal totalNetBD = totalGrossBD.divide(oneHundred.add(vatRateBD), 2, RoundingMode.HALF_UP);
        System.out.println("Total net value (BigDecimal): " + totalNetBD);
        
        System.out.println("\n=== Comparison ===\n");
        System.out.println("Double total net: " + totalNetDouble);
        System.out.println("BigDecimal total net: " + totalNetBD);
        System.out.println("\nConclusion: Double has floating-point precision errors.");
        System.out.println("BigDecimal provides exact decimal arithmetic, essential for financial calculations.");
    }
}

