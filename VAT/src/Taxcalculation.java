import java.math.BigDecimal;
import java.math.RoundingMode;

    public class Taxcalculation {
    public static void main(String[] args) {
            double netPrice = 9.99;
            double vatRate = 0.23;
            int quantity = 20000;

            System.out.println("Using double:");
            System.out.println("Net price per item: " + netPrice + "$");
            double grossPricePerItem = netPrice * (1 + vatRate);
            System.out.println("Gross price per item: " + grossPricePerItem + "$");
            double totalGross = grossPricePerItem * quantity;
            System.out.println("Total gross for " + quantity + " items: " + totalGross + "$");
            double totalNetFromGross = totalGross / (1 + vatRate);
            System.out.println("Total net calculated from gross: " + totalNetFromGross + "$");
            double totalNetDirect = netPrice * quantity;
            System.out.println("Total net direct: " + totalNetDirect + "$");
            System.out.println("Difference: " + (totalNetFromGross - totalNetDirect)+ "$");

            BigDecimal netPriceBD = new BigDecimal("9.99");
            BigDecimal vatRateBD = new BigDecimal("0.23");
            BigDecimal quantityBD = new BigDecimal(quantity);
            BigDecimal one = new BigDecimal("1");

            System.out.println("\nUsing BigDecimal:");
            System.out.println("Net price per item: " + netPriceBD + "$");

            BigDecimal grossPricePerItemBD = netPriceBD.multiply(one.add(vatRateBD));
            System.out.println("Gross price per item: " + grossPricePerItemBD + "$");

            BigDecimal totalGrossBD = grossPricePerItemBD.multiply(quantityBD);
            System.out.println("Total gross for " + quantity + " items: " + totalGrossBD + "$");

            BigDecimal totalNetFromGrossBD = totalGrossBD.divide(one.add(vatRateBD), RoundingMode.HALF_UP);
            System.out.println("Total net calculated from gross: " + totalNetFromGrossBD + "$");

            BigDecimal totalNetDirectBD = netPriceBD.multiply(quantityBD);
            System.out.println("Total net direct: " + totalNetDirectBD + "$");

            System.out.println("Difference: " + totalNetFromGrossBD.subtract(totalNetDirectBD) + "$");

            // Conclusion
            System.out.printf("\nConclusion: Big decimal is the best one as it gives the exact results . " +
                    "because it eliminates rounding errors of floating-point numbers arthimetic compared to double where the number of price forexample is 0.000000000045. " +
                    "Therefore, BigDecimal is the perfect one for financial calculations.");
        }
    }

