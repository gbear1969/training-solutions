package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    List<String> union = new ArrayList<>();
    public List<String> stringListsUnion(List<String> first, List<String> second) {
        for (int i = 0; i < first.size(); i++) {
            if (!union.contains(first[i])) {
                union.add(first[i]);
            }
        }
        for (int i = 0; i < second.size(); i++) {
            if (!union.contains(second[i])) {
                union.add(second[i]);
            }
        }

        return union;
    }


}
