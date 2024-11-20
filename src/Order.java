import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderItem> iceCreamItems = new ArrayList<>();
    private final List<Topping> toppings = new ArrayList<>();
    final Container container;
    private final PriceCalculator priceCalculator;
    private static final InvoiceGenerator invoiceGenerator = new InvoiceGenerator(); // Reusable instance

    public Order(Container container) {
        this.container = container;
        this.priceCalculator = new PriceCalculator(container);
    }

    public void addIceCream(Flavor flavor, int scoops) {
        OrderItem item = new OrderItem(flavor, scoops);
        iceCreamItems.add(item);
        priceCalculator.addIceCreamItem(item);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        priceCalculator.addTopping(topping);
    }

    public String generateInvoice() {
        return invoiceGenerator.generate(container, iceCreamItems, toppings, priceCalculator.calculateSubtotal(), priceCalculator.calculateTax(), priceCalculator.calculateTotal());
    }
}
