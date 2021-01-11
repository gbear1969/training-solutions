package week11d01;

public class DivisorFinder {
    public int findDivisors(int n) {
        int o = 0;
        int i = n;
        while (i > 0) {
            if (i % 10 != 0 && n % (i % 10) == 0) {
                o++;
            }
            i = i / 10;
        }
        return o;
    }
}
