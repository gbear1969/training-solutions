package finalmodifier;

public class TaxCalculator {
    public static final double TAX_HU = (27 / 100.0);

    public double tax(double price) {
        return price * TAX_HU;
    }

    public double priceWithTax(double price) {
        return price + tax(price);
    }

    public static void main(String[] args) {
        TaxCalculator tC = new TaxCalculator();
        System.out.println(tC.tax(1000));
        System.out.println(tC.priceWithTax(1000));
    }
}
