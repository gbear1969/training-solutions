package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing (List<Integer> numbers) {
        if (numbers.size() > 1) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                if ( numbers.get(i) > numbers.get(i+1)) {
                    return false;
                }
            }

        }
        return true;
    }
}
