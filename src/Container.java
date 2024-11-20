public class Container {
    private final String type;
    private final double price;

    public Container(String type, double v) {
        if (type.equalsIgnoreCase("Waffle Cone")) {
            this.type = "Waffle Cone";
            this.price = 5.00;
        } else {
            this.type = "Paper Cup";
            this.price = 0.00;
        }
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
