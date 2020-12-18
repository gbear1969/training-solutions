package week08d05;

public class Main {
    public static void main(String[] args) {
        MathAlgorithms mA = new MathAlgorithms();
        System.out.println(mA.greatestCommonDivisor(177, 1003));
        System.out.println(mA.greatestCommonDivisor(1003, 177));
        System.out.println(mA.greatestCommonDivisor(1003, 1003));
        System.out.println(mA.greatestCommonDivisor(16, 8));
        System.out.println(mA.greatestCommonDivisor(14, 10));
        System.out.println(mA.greatestCommonDivisor(17, 7));
    }
}
