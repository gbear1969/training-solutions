package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWithMaxAge(List<Trainer> trainers) {
        Trainer maxAge = trainers.get(0);
        for (Trainer t: trainers) {
            if (maxAge.getAge() < t.getAge()) {
                maxAge = t;
            }
        }
        return maxAge;
    }
}
