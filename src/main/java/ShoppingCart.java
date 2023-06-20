import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static final double APPLE_PRICE = 0.60;
    private static final double ORANGE_PRICE = 0.25;

    private List<String> scannedItems;

    public ShoppingCart() {
        scannedItems = new ArrayList<>();
    }

    public void scan(String item) {
        scannedItems.add(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;

        for (String item : scannedItems) {
            if (item.equals("Apple")) {
                totalCost += APPLE_PRICE;
            } else if (item.equals("Orange")) {
                totalCost += ORANGE_PRICE;
            }
        }

        return totalCost;
    }
}