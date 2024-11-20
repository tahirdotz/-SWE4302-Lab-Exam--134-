public class Main {
    public static void main(String[] args) {
        Flavor chocolateFudge = new Flavor("Chocolate Fudge", 3.00);
        Flavor mintChocolateChip = new Flavor("Mint Chocolate Chip", 2.80);


        Topping chocolateChips = new Topping("Chocolate Chips", 0.50);
        Topping freshStrawberries = new Topping("Fresh Strawberries", 1.00);

        Container waffleCone = new Container("Waffle Cone", 5.00);

        Order order = new Order(waffleCone);

        order.addIceCream(chocolateFudge, 1);
        order.addIceCream(mintChocolateChip, 1);

        order.addTopping(chocolateChips);
        order.addTopping(freshStrawberries);

        String invoice = order.generateInvoice();
        System.out.println(invoice);
    }
}
