public class TaxCalculator {
    private final double taxRate;

    public TaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calculateTax(double subtotal) {
        return subtotal * taxRate;
    }
}
