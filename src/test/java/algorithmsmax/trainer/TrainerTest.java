package algorithmsmax.trainer;

import algorithmsmax.trainer.Trainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    public void testCreateIsOk() {
        Trainer t = new Trainer("Valaki", 55);

        assertEquals("Valaki", t.getName());
        assertEquals(55, t.getAge());
    }

}
