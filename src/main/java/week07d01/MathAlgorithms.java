package week07d01;

public class MathAlgorithms {
    public boolean isPrime(int x) {
        if (x < 1) {
            throw new IllegalArgumentException("Bocs, az ellenőrzés csak pozitív egész számokra működik.");
        } else {
            if (x > 1 && x < 4) {
                return true;
            }

            if (x % 2 == 0) {
                return false;
            }

            int i = 3;
            while (i <= x / i) {
                if (x % i == 0) {
                    return false;
                }
                i += 2;
            }
        }
        return true;

    }


}
