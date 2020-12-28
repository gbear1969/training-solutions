package operators;

public class Operators {
    public boolean isEven(int n) {
        return (n % 2 == 0);
    }

    public int multiplyByPowerOfTwo(int x, int n) {
        return Integer.parseInt(Integer.toBinaryString(x << n), 2);
    }


}
