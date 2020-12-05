package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void counterTeszt() {
        Store store = new Store(Arrays.asList(
                new Product("Zsemle", Category.BAKEDGOODS, 30),
                new Product("Kakaó", Category.DAIRY, 155),
                new Product("Kifli", Category.BAKEDGOODS, 30),
                new Product("Jégkrém", Category.FROZEN, 240),
                new Product("Tejföl", Category.DAIRY, 95)
        ));

        assertEquals(2, store.counterProducts(Category.BAKEDGOODS));
        assertEquals(1, store.counterProducts(Category.FROZEN));
        assertEquals(0, store.counterProducts(Category.OTHER));
    }
}
