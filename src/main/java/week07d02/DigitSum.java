package week07d02;

public class DigitSum {
    public int sumOfDigits(int x) {
        int y = 0;
        while (x > 0) {
            y += x % 10;
            x=x/10;

        }
        return y;
    }


}
