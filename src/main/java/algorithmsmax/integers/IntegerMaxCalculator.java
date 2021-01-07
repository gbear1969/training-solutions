package algorithmsmax.integers;

import algorithmsmax.trainer.Trainer;

import java.util.List;

public class IntegerMaxCalculator {

    public int max(List<Integer> numbers) {
        int max = 0;
        for (Integer n: numbers) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }
}
