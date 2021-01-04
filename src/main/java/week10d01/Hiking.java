package week10d01;

import java.util.Scanner;

public class Hiking {

    public double getPlusElevation(String list) {
        if (list == null) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        Scanner sc = new Scanner(list).useDelimiter(",");
        double sum = 0.0;
        double a = 0.0;
        double b = 0.0;
        if (sc.hasNext()) {
            if ( sc.hasNextDouble()) {
                a = sc.nextDouble();
            } else {
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        }
        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
                if (b - a > 0) {
                    sum += (b - a);
                }
                a = b;
            } else {
                throw new IllegalArgumentException("Incorrect parameter string!");
            }
        }
        return sum;
    }

}
