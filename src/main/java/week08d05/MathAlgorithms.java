package week08d05;

public class MathAlgorithms {
    private int sz1;
    private int sz2;

    public int greatestCommonDivisor(int n1, int n2) {
        if (n1 > n2) {
            sz1 = n1;
            sz2 = n2;
        } else {
            sz1 = n2;
            sz2 = n1;
        }
        if (sz1 % sz2 == 0) {
            return sz2;
        }

        int i = 2;
        if (oszthato(2)) {
            return sz2 / i;
        }
        i = 3;
        while (i <= sz2 / i) {
            if (oszthato(i)) {
                return (sz2 / i);
            }
            i += 2;
        }
        if (sz1 % 2 == 0 && sz2 % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    private boolean oszthato (int i) {
        return sz2 % i == 0 && sz1 % (sz2 / i) == 0;
    }

}
