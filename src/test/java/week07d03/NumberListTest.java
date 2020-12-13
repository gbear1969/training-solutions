package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberListTest {

    @Test
    public void isIncreadingTest() {
        NumberList testList = new NumberList();

        assertTrue(testList.isIncreasing(Arrays.asList(1,2,3,3,3,5)));
        assertTrue(testList.isIncreasing(Arrays.asList(-10,1,2,3,3,3,5)));
        assertFalse(testList.isIncreasing(Arrays.asList(1,2,3,2,3,5)));
        assertFalse(testList.isIncreasing(Arrays.asList(1,2,-3,2,3,5)));
        assertTrue(testList.isIncreasing(Arrays.asList(1)));
        assertTrue(testList.isIncreasing(Arrays.asList()));

    }
}
