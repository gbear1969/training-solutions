package week10d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HikingTest {

    @Test
    public void getPlusElevation() {

        assertEquals(13, new week10d01.Hiking().getPlusElevation(List.of(10d, 20d, 15d, 18d)));
        assertEquals(0, new week10d01.Hiking().getPlusElevation(List.of(90d,80d,75d,18d)));
        assertEquals(90-18, new week10d01.Hiking().getPlusElevation(List.of(18d,75d,80d,90d)));
        assertEquals(90.5-18, new week10d01.Hiking().getPlusElevation(List.of(18d,75d,80d,90.5)));
        assertEquals(0, new Hiking().getPlusElevation(List.of()));
    }

}
