package week08d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringLists {
    private List<String> union = new ArrayList<>();
    public List<String> stringListsUnion(List<String> first, List<String> second) {
        for (int i = 0; i < first.size(); i++) {
            if (!union.contains(first.get(i))) {
                union.add(first.get(i));
            }
        }
        for (int i = 0; i < second.size(); i++) {
            if (!union.contains(second.get(i))) {
                union.add(second.get(i));
            }
        }
        Collections.sort(union);
        return union;
    }


}
