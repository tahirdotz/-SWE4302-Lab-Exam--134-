import java.util.List;

public class InvoiceGenerator {
    public String generate(Container container, List<OrderItem> items, List<Topping> toppings, double subtotal, double tax, double total) {
        StringBuilder invoice = new StringBuilder("Ice Cream Shop Invoice\n");

        for (OrderItem item : items) {
            invoice.append(item.getFlavor().getName())
                    .append(" - ")
                    .append(item.getScoops())
                    .append(item.getScoops() > 1 ? " scoops" : " scoop")
                    .append(": $")
                    .append(String.format("%.2f", item.calculatePrice()))
                    .append("\n");
        }

        for (Topping topping : toppings) {
            invoice.append(topping.getName())
                    .append(" - 1 time: $")
                    .append(String.format("%.2f", topping.getPrice()))
                    .append("\n");
        }


        invoice.append("Container: ")
                .append(container.getType())
                .append(": $")
                .append(String.format("%.2f", container.getPrice()))
                .append("\n");


        invoice.append("Subtotal: $")
                .append(String.format("%.2f", subtotal))
                .append("\n");
        invoice.append("Tax: $")
                .append(String.format("%.2f", tax))
                .append("\n");
        invoice.append("Total Amount Due: $")
                .append(String.format("%.2f", total))
                .append("\n");

        return invoice.toString();
    }
}

