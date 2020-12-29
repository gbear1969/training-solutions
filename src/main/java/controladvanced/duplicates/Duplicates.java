package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> find(List<Integer> numbers) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (i < numbers.lastIndexOf(numbers.get(i)) /*&& duplicates.indexOf(numbers.get(i)) == - 1*/) {
                duplicates.add(numbers.get(i));
            }
        }
        return duplicates;
    }
}
