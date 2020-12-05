package week06d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BudgetTest {

    private Budget budget = new Budget(Arrays.asList(
            new Item(3850, 7, "pályamatrica"),
            new Item(990, 10, "vonatjegy"),
            new Item(1990, 7, "strand belépő"),
            new Item(5990, 12, "fenyőfa"),
            new Item(8900, 3, "kölni")

    ));

    @Test
    public void getItemsByMonthTest() {
        List<Item> ki = budget.getItemsByMonth(7);

        assertEquals(2, ki.size());
        assertEquals("pályamatrica", ki.get(0).getName());
        assertEquals("strand belépő", ki.get(1).getName());

        List<Item> ki2 = budget.getItemsByMonth(5);

        assertEquals(0, ki2.size());

    }
}
