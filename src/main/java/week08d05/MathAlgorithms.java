package week08d05;

public class MathAlgorithms {
    private int sz1;
    private int sz2;

    public int greatestCommonDivisor(int n1, int n2) {
        sz1 = n1;
        sz2 = n2;
        if (n1 < n2) {
            sz1 = n2;
            sz2 = n1;
        }

        for (int i = 1; i <= sz2 / 2; i++) {
            if (sz2 % i == 0 && sz1 % (sz2 / i) == 0) {
                return sz2 / i;
            }
        }
        return 1;
    }

}
