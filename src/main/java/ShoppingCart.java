import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Map<String, Integer> itemCounts = countItemOccurrences();
        double totalCost = 0.0;

        for (Map.Entry<String, Integer> entry : itemCounts.entrySet()) {
            String item = entry.getKey();
            int count = entry.getValue();

            if (item.equals("Apple")) {
                int applePairs = count / 2;
                int remainingApples = count % 2;
                totalCost += (applePairs + remainingApples) * APPLE_PRICE;
            } else if (item.equals("Orange")) {
                int orangeSets = count / 3;
                int remainingOranges = count % 3;
                totalCost += (orangeSets * 2 + remainingOranges) * ORANGE_PRICE;
            }
        }

        return totalCost;
    }

    private Map<String, Integer> countItemOccurrences() {
        Map<String, Integer> itemCounts = new HashMap<>();

        for (String item : scannedItems) {
            itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
        }

        return itemCounts;
    }
}
