package week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void unionTest() {
        StringLists sl = new StringLists();
        List<String> first = new ArrayList<>(Arrays.asList("b", "c", "a"));
        List<String> second = new ArrayList<>(Arrays.asList("a", "d"));

        assertEquals(Arrays.asList("a", "b", "c", "d"), sl.stringListsUnion(first, second));
    }
}
