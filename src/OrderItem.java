public class OrderItem {
    private final Flavor flavor;
    private final int scoops;

    public Flavor getFlavor() {
        return flavor;
    }

    public int getScoops() {
        return scoops;
    }

    public OrderItem(Flavor flavor, int scoops) {
        this.flavor = flavor;
        this.scoops = scoops;
    }

    public double calculatePrice() {
        return scoops * flavor.getPricePerScoop();
    }

    @Override
    public String toString() {
        return flavor.getName() + " - " + scoops + " scoop(s): $" + String.format("%.2f", calculatePrice());
    }


}
