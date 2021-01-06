package exam02;

import java.util.ArrayList;
import java.util.List;

public class ArraySelector {
    public String selectEvens(int[] nums) {
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            r.add(nums[i]);
        }
        return nums.length == 0 ? "" : r.toString();
    }
}
