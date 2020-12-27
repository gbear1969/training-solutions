package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public String getItemsToString() {
        String s = "";
        for (Item i: items) {
            s += i.getProduct() + ", mennyiség : " + i.getQuantity() + ", egységár : " + i.getPrice() + "\n";
        }
        return s;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Item i: items) {
            sum += (i.getQuantity() * i.getPrice());
        }
        return  sum;
    }
}
