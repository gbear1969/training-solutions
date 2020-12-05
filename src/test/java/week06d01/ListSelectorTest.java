package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListSelectorTest {

    ListSelector teszt = new ListSelector();

    @Test
    public void parosElemekTeszt() {
        assertEquals("[alma, barack]", teszt.parosElemek(Arrays.asList("alma", "körte", "barack")));
    }

    @Test
    public void parosElemekNullal() {
        assertThrows(IllegalArgumentException.class, ()->teszt.parosElemek(null));
    }

    @Test
    public void parosElemekUres() {
        assertEquals("", teszt.parosElemek(new ArrayList<>()));
    }
}
