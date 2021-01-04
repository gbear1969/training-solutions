package week10d01;

import java.util.List;
import java.util.Scanner;

public class Hiking {

    public double getPlusElevation(List<Double> list) {
        double sum = 0.0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                sum += list.get(i) - list.get(i - 1);
            }
        }
        return sum;

    }
}
