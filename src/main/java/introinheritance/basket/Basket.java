package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String barcode) {
        for (Item item: items) {
            if (barcode.equals(item.getBarcode())) {
                items.remove(item);
            }
        }
    }

    public void clearBasket() {
        items.clear();
    }

    public List<Item> getItems() {
        return List.copyOf(items);
    }
}
