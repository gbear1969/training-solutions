package algorithmsdecision.integers;

import java.util.List;

public class IntegerDecisionMaker {

    public boolean containsGreaterThan(List<Integer> numbers, int limit) {
        for (Integer n: numbers) {
           if (n > limit) {
               return true;
           }
        }
        return false;
    }

    public boolean containsLowerThan(List<Integer> numbers, int limit) {
        for (Integer n: numbers) {
           if (n < limit) {
               return true;
           }
        }
        return false;
    }
}
