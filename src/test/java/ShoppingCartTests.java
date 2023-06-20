import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShoppingCartTests {
    
    @Test
    public void testTotalCostWithBuyOneGetOneFreeOnApples() {
        ShoppingCart cart = new ShoppingCart();
        cart.scan("Apple");
        cart.scan("Apple");
        cart.scan("Apple");

        double totalCost = cart.calculateTotalCost();

        assertEquals(1.20, totalCost, 0.001);
    }

    @Test
    public void testTotalCostWithThreeForPriceOfTwoOnOranges() {
        ShoppingCart cart = new ShoppingCart();
        cart.scan("Orange");
        cart.scan("Orange");
        cart.scan("Orange");

        double totalCost = cart.calculateTotalCost();

        assertEquals(0.50, totalCost, 0.001);
    }

    @Test
    public void testTotalCostWithMixedItemsAndOffers() {
        ShoppingCart cart = new ShoppingCart();
        cart.scan("Apple");
        cart.scan("Apple");
        cart.scan("Orange");
        cart.scan("Apple");
        cart.scan("Orange");

        double totalCost = cart.calculateTotalCost();

        assertEquals(1.70, totalCost, 0.001);
    }
}