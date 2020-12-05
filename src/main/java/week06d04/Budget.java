package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items;

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemsByMonth(int month) {
        List<Item> ki = new ArrayList<>();

        for (Item item : items) {
            if (item.getMonth() == month) {
                ki.add(item);
            }
        }

        return ki;
    }
}
