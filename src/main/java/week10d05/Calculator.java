package week10d05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

    public int findMinMaxSum(int[] arr) {
        List<Integer> numbers = new ArrayList<>();
        for (int a: arr) {
            numbers.add(a);
        }
        Collections.sort(numbers);
        int sum = 0;
        if (numbers.size() >  3) {
            for (int i = 0; i < 4; i++) {
                sum += numbers.get(i);
            }
            return sum;
        }
        throw new IllegalArgumentException("Legalább 4 elemű tömböt várok.");
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int[] t = new int[5];
        for (int i = 0; i < 5; i++)
            t[i] = (i + 1) * 2 - 1;
        System.out.println(c.findMinMaxSum(t));
    }
}
