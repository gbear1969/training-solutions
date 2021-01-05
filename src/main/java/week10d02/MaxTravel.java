package week10d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> stops) {
        List<Integer> s = new ArrayList<>(stops);
        Collections.sort(s);
        int stop = 0;
        int count = 1;
        int max = 0;
        for (int i = 1; i < s.size(); i++) {
            if (s.get(i - 1) != s.get(i) || i + 1 == s.size()) {
                if (i + 1 == s.size()) {
                    count ++;
                }
                if (count > max) {
                    max = count;
                    stop = s.get(i - 1);
                    count = 1;
                }
            } else {
                    count++;
            }

        }
        return stop;
    }

    public static void main(String[] args) {
        System.out.println(new MaxTravel().getMaxIndex(List.of(12,12,0,3,4,4,12)));
    }
}
