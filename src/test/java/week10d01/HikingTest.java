package week10d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HikingTest {


    @Test
    public void incorrectParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new week10d01.Hiking().getPlusElevation("10,20,x,18"));
        assertEquals("Incorrect parameter string!", ex.getMessage());
    }


    @Test
    public void parameterIsNullShouldThrowException() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new week10d01.Hiking().getPlusElevation(null));
        assertEquals("Incorrect parameter string!", ex.getMessage());

    }


    @Test
    public void getPlusElevation() {

        assertEquals(13, new week10d01.Hiking().getPlusElevation("10,20,15,18"));
        assertEquals(0, new week10d01.Hiking().getPlusElevation("90,80,75,18"));
        assertEquals(90-18, new week10d01.Hiking().getPlusElevation("18,75,80,90"));
        assertEquals(90.5-18, new week10d01.Hiking().getPlusElevation("18,75,80,90.5"));
        assertEquals(0, new Hiking().getPlusElevation(""));
    }

}
