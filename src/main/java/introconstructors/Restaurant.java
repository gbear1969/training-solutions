package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<String> menu;
    private String name;
    private int capacity;

    public Restaurant(String name, int nomberOfTables) {
        this.menu = createMenu();
        this.name = name;
        this.capacity = 4 * nomberOfTables;
    }

    public List<String> createMenu() {
        List<String> menu = new ArrayList<>();
        menu.add("Húsleves");
        menu.add("Túrós csusza");
        menu.add("Tiramisu");
        return menu;
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
