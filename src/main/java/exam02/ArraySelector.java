package exam02;

public class ArraySelector {
    public String selectEvens(int[] nums) {
        String r = "";
        if (nums.length > 0) {
            r = r +  "[";
        }
        for (int i = 0; i < nums.length; i += 2) {
            r = r + nums[i];
            if (i + 2 < nums.length) {
                r = r + ", ";
            } else {
                r = r + "]";
            }
        }
        return r;
    }
}
