package algorithmsmax.trainer;

import algorithmsmax.trainer.MaxAgeCalculator;
import algorithmsmax.trainer.Trainer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaxAgeCalculatorTest {
    List<Trainer> trainers = Arrays.asList(
            new Trainer("John", 22),
            new Trainer("Bill", 55),
            new Trainer("Kate", 54),
            new Trainer("Mary", 60),
            new Trainer("Karl", 33)
    );

    @Test
    public void testSelectSalesPersonWithMaxSalesAmount() {
        MaxAgeCalculator ageRecorder = new MaxAgeCalculator();

        assertEquals(60, ageRecorder.trainerWithMaxAge(trainers).getAge());
    }
}

