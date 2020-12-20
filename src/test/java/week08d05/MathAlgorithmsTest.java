package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {

    @Test
    public void greatestCommonDivisorTest() {
        MathAlgorithms mA = new MathAlgorithms();
        assertEquals(59, mA.greatestCommonDivisor(177, 1003));
        assertEquals(59, mA.greatestCommonDivisor(1003, 177));
        assertEquals(1003, mA.greatestCommonDivisor(1003, 1003));
        assertEquals(8, mA.greatestCommonDivisor(16, 8));
        assertEquals(6, mA.greatestCommonDivisor(42, 30));
        assertEquals(2, mA.greatestCommonDivisor(14, 10));
        assertEquals(1, mA.greatestCommonDivisor(17, 7));

    }
}
