package week10d05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {

    public void findMinMaxSum(int[] arr) {
        if (arr == null || arr.length <  4) {
            throw new IllegalArgumentException();
        }
        Arrays.sort(arr);
        int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += arr[i];
            }
            System.out.println(sum);;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int l = 10000000;
        int[] t = new int[l];
        for (int i = l-1; i > -1; i--)
            t[i] = (i + 1) * 2 - 1;
        c.findMinMaxSum(t);
    }
}
