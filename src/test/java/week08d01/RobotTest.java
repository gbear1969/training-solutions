package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RobotTest {

    @Test
    public void testMove() {
        Robot robot = new Robot("FFLlLLLBBbBJJJJJJJ");
        String position = robot.move();
        assertEquals(3, robot.getX());
        assertEquals(-3, robot.getY());
    }

    @Test
    public void testMoveExeption() {
        Robot robot = new Robot("FFLlLLLBBbBJJJJJJJ0");
        assertThrows(IllegalArgumentException.class, ()->robot.move());
    }
}
