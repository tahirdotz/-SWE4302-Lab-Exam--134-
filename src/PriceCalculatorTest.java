import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PriceCalculatorTest {

    @Test
    public void testCalculateSubtotalWithContainerAndIceCreamItems() {
        Container container = new Container("Waffle Cone", 5.00);
        PriceCalculator calculator = new PriceCalculator(container);
        Flavor flavor1=new Flavor("Mint Chocolate Chip",2.80);
        OrderItem item1 = new OrderItem(flavor1, 2);


        calculator.addIceCreamItem(item1);

        double expectedSubtotal = 5.00 + 8.60;

        assertEquals(expectedSubtotal, calculator.calculateSubtotal(), "Subtotal should be correctly calculated.");
    }
    @Test
    public void testCalculateSubtotalWithEmptyOrder() {
        Container container = new Container("Waffle Cone", 5.00);
        PriceCalculator calculator = new PriceCalculator(container);


        double expectedSubtotal = 5.00;

        assertEquals(expectedSubtotal, calculator.calculateSubtotal(), "Passed");
    }




}
