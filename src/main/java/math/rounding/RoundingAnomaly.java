package math.rounding;

import java.util.Random;

public class RoundingAnomaly {

    Random rand = new Random();

    private double[] randomNumbers(int size, double max, int scale) {
        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {
            double s = Math.pow(10, scale);
            numbers[i] = Math.round(rand.nextDouble() * max * s) / s;
        }
        return numbers;
    }

    private double roundAfterSum(double[] numbers) {
        double sum = 0;
        for (double n: numbers) {
            sum += n;
        }
        return Math.round(sum);
    }

    private double sumAfterRound(double[] numbers) {
        double sum = 0;
        for (double n: numbers) {
            sum += Math.round(n);
        }
        return sum;
    }

    public static void main(String[] args) {
        RoundingAnomaly rA = new RoundingAnomaly();
        double sum = 0;
        for (int i = 1; i < 101; i++) {
            double[] numbers = rA.randomNumbers(1000, 1000000, 5);
            sum += Math.abs(rA.roundAfterSum(numbers) - rA.sumAfterRound(numbers));
        }
        System.out.println(sum / 100);
    }
}
