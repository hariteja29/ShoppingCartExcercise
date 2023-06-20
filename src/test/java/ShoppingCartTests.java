import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShoppingCartTests {

    @Test
    public void testTotalCostWithOnlyApples() {
        ShoppingCart cart = new ShoppingCart();
        cart.scan("Apple");
        cart.scan("Apple");
        cart.scan("Apple");

        double totalCost = cart.calculateTotalCost();

        assertEquals(1.80, totalCost, 0.001);
    }

    @Test
    public void testTotalCostWithOnlyOranges() {
        ShoppingCart cart = new ShoppingCart();
        cart.scan("Orange");
        cart.scan("Orange");

        double totalCost = cart.calculateTotalCost();

        assertEquals(0.50, totalCost, 0.001);
    }

    @Test
    public void testTotalCostWithMixedItems() {
        ShoppingCart cart = new ShoppingCart();
        cart.scan("Apple");
        cart.scan("Orange");
        cart.scan("Apple");
        cart.scan("Orange");
        cart.scan("Orange");

        double totalCost = cart.calculateTotalCost();

        assertEquals(1.95, totalCost, 0.001);
    }

    @Test
    public void testTotalCostWithNoItems() {
        ShoppingCart cart = new ShoppingCart();

        double totalCost = cart.calculateTotalCost();

        assertEquals(0.0, totalCost, 0.001);
    }
}