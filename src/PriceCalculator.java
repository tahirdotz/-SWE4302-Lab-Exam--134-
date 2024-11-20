import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    private final List<OrderItem> iceCreamItems = new ArrayList<>();
    private final List<Topping> toppings = new ArrayList<>();
    private final Container container;
    private final TaxCalculator taxCalculator = new TaxCalculator(0.08);

    public PriceCalculator(Container container) {
        this.container = container;
    }

    public void addIceCreamItem(OrderItem item) {
        iceCreamItems.add(item);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculateSubtotal() {
        double subtotal = container.getPrice();
        for (OrderItem item : iceCreamItems) {
            subtotal += item.calculatePrice();
        }
        for (Topping topping : toppings) {
            subtotal += topping.getPrice();
        }
        return subtotal;
    }

    public double calculateTax() {
        return taxCalculator.calculateTax(calculateSubtotal());
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateTax();
    }
}
